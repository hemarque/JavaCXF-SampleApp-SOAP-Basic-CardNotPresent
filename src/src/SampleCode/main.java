//Online documentation available : http://www.evosnap.com/support/knowledgebase
package SampleCode;

public class main {
	
	public static void main(String args[]) throws Exception {
		SampleApp SA = new SampleApp();
		ConfigurationValues CV = new ConfigurationValues();
	///Service Information 
		/* 
		 * Preparing the application to transact
		 * http://www.evosnap.com/support/knowledgebase/preparing-the-application-to-transact-2/
		 * Note : The following steps should be performed during the initial setup of the application.
		 * The results of the following steps will be an ApplicationProfileId, ServiceId and MerchantProfileId.
		 * These values should be persisted/cached and use for Transaction Processing. The persistence/caching should be treated similar Administrator user credentials. 

		 * Service Information produces Three configuration values that if already obtained should bypass the 
		 * Service information steps. To simulate this behavior, if you provide the values below the Service 
		 * Information steps are skipped. 
		*/
		
		if (SA._ActivationKey != "" && SA._MerchantType == "Managed") {
			CV._BCPMerchantProfileId = SA._ActivationKey;
			CV._BCPServiceId = "39C6700001";
		}
			else if (SA._ActivationKey != "" && SA._MerchantType == "Unmanaged") {
				CV._BCPMerchantProfileId = SA._ActivationKey + "_TC";
				CV._BCPServiceId = "4C85600001";
			}
			else {
				CV._BCPMerchantProfileId = "";
				CV._BCPServiceId = "";
		}
		
		CV._ApplicationProfileId = "";//If you provide a value this step will be skipped
		//CV._BCPServiceId = "";//If you provide a getServiceInformation will attempt to match from the services returned for BankcardService
		CV._ECKServiceId = "";//If you provide a getServiceInformation will attempt to match from the services returned for ElectronicCheckingService
		//CV._BCPMerchantProfileId = "";//If you provide a value this step will attempt to match from the services returned for BankcardService
		CV._ECKMerchantProfileId = "";//If you provide a value this step will attempt to match from the services returned for ElectronicCheckingService
		CV._WorkFlowId = "";// "A121700001";//For workflows like ReD or Magensa set this value to the proper workflowId
		CV._UseWorkFlowId = false;//Trigger to use the workflowId in place of the Serviceid
		//The following service does incur additional fees. Please contact your sales representative
		CV._UseTMS = true;//Transaction Management Services (TMS) - Query transactions that have process through the application
		 
		/*
		 * Step 1 - Let's first get a Security Token from the Service Key and Identity token provided in the Integration Recommendation. 
		 * Note that step 1 is necessary for both Service Information as well as Transaction Processing. The session token returned is 
		 * valid for up to 30 minutes. We recommend that your application obtains a new session token if older than 25 minutes. 
		 * http://www.evosnap.com/support/knowledgebase/preparing-the-application-to-transact-2/#signonwithtoken-soap
		*/
		if(!SA.signOnWithToken(CV))return;
		
		/*
		 * Step 2 - If this is the first time running the application, you need to save application 
		 * and retrieve an applicationProfileId used in transacting.
		 * http://www.evosnap.com/support/knowledgebase/preparing-the-application-to-transact-2/#saveapplicationdata-soap
		*/
		if(CV._ApplicationProfileId.length() < 1)
			if(!SA.SaveApplicationConfiguration(CV))return;
		
		/*
		 * Step 3 - Retrieve Service Information. In this scenario we'll use the first ServiceId returned
		 * http://www.evosnap.com/support/knowledgebase/preparing-the-application-to-transact-2/#getserviceinformation-soap
		*/
		if(!SA.RetrieveServiceInformation(CV))return;

		/*
		 * Step 4 - The final step for preparing your application to transact is to save a merchant profile
		 * the application should store the name as this values will be used in all transactions. 
		 * http://www.evosnap.com/support/knowledgebase/preparing-the-application-to-transact-2/#savemerchantprofiles-soap
		*/
		if(!SA.SaveMerchantProfile(CV))return;

	///Transaction Processing
	///BankcardService Transactions
		CV.ServiceToProcessAs = "BankcardService";
		/*Step 5 -  Authorizing. The user has two options for authorizing a card. The first "AuthorizeAndCapture()"
		 * is an immediate capture of funds. The second "Authorize()" is a pre-capture where funds are 
		 * reserved however not marked for capture. The "Authorize()" requires a follow-up "Capture" to mark the 
		 * transaction for settlement.
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#authorizeandcapture-soap
		*/
		if(!SA.AuthorizeAndCapture(CV, false))return; //Results displayed in the console
		if(!SA.Authorize(CV))return; //Results displayed in the console
		
		/*Step 6 - Adjusting and Voiding
		 * The following operations are associated with the adjustment and void of previously authorized transactions:
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#adjust-soap
		*/
		if(!SA.Adjust(CV))return; //Results displayed in the console
		if(!SA.Undo(CV))return; //Results displayed in the console
		/*Step 7 - Capturing for Settlement
		 * The following operations are associated with the capture and settlement of transactions:
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#capture-soap
		*/
		if(!SA.Capture(CV))return; //Results displayed in the console
		if(!SA.CaptureAll(CV))return; //Results displayed in the console
		if(!SA.CaptureSelective(CV))return; //Results displayed in the console
		
		/*Step 8 - Refunding
		 * The following operations are associated with refunding previously settled transactions
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#returnbyid-soap
		*/
		if(!SA.ReturnById(CV))return; //Results displayed in the console
		if(!SA.ReturnUnlinked(CV))return; //Results displayed in the console
		
		/*Step 9 - Optional Operations
		 * The following operations may be implemented based on the the specific requirements of the application:
		 * http://www.evosnap.com/support/knowledgebase/transaction-processing/#acknowledge-soap
		*/
		if(!SA.Verify(CV))return; //Results displayed in the console
	
		/* - Alternate examples
		 */

		//Demonstrate a Magensa transaction
		if(CV._WorkFlowId.length() > 0){
			CV._UseWorkFlowId = true;
			if(!SA.Authorize(CV))return; 
		}
		
		
	///Electronic Checking Transactions
	///The valid processing sequence of transaction 
	/// "QueryAccount" - "Authorize" - "CaptureAll"
	/// OR
	/// "QueryAccount" - "Undo"
		CV.ServiceToProcessAs = "ElectronicCheckingService";
		if(!SA.QueryAccount(CV))return; //Results displayed in the console
		
		//Option to Undo or to Authorize transaction
		if(!SA.Authorize(CV))return; //Results displayed in the console
		//if(!SA.Undo(CV))return; //Check transactions that have not been committed can be voided 
		
		if(!SA.CaptureAll(CV))return; //Results displayed in the console
		
	///Transaction Management Processing (TMS)
		/*The QueryBatch() operation queries the batch summary and returns Batch Status, Date/Time, and a list of transactionIds in the batch.
		 * http://www.evosnap.com/support/knowledgebase/data-services-implementation/#soap
		 */
		if(!SA.QueryBatch(CV))return; //Results displayed in the console
		
		/*The QueryTransactionsSummary() operation queries the specified transactions and returns summary details related to 
		 * one or more transactions matching specific search criteria. You can indicate if the response will include all 
		 * related transactions (includeRelated = 'true'). This returns all transactions matching specific search criteria 
		 * and all transactions that have parent/child relationships with those matches. 
		 * http://www.evosnap.com/support/knowledgebase/data-services-implementation/#soap
		 */
		if(!SA.QueryTransactionsSummary(CV))return; //Results displayed in the console
		
		/*The QueryTransactionFamilies() operation returns family summary information and a list of TransactionIds that can be used to query 
		 * for full transaction details.
		 * http://www.evosnap.com/support/knowledgebase/data-services-implementation/#soap
		 */
		if(!SA.QueryTransactionFamilies(CV))return; //Results displayed in the console
		
		/*The QueryTransactionsDetail() operation queries the specified transactions and returns both summary details and full transaction 
		 * details as a serialized object. QueryTransactionsDetail() contains the same search criteria and includeRelated functionality as 
		 * QueryTransactionsSummary().
		 * http://www.evosnap.com/support/knowledgebase/data-services-implementation/#soap
		 */
		if(!SA.QueryTransactionsDetail(CV))return; //Results displayed in the console
		
		System.out.println("End of Sample Code");
	}
}

