package com.utilities;

public class ObjectRepository {
	// ********************SignIn Credentials elements************************//

	final static public String LoginpageUserName = ".//input[@id='EmailAddress']";
	final static public String LoginpagePassword = ".//input[@id='Password']";
	final static public String LoginpageButton = ".//button[@name='go']";
	
	//*********************DashBoard Elements and Clicks*********************////////////
	final static public String DashBoardPageTitle = "//*[contains(text(),'CheckmarkIndia')]";
	final static public String LogoutClick = "//*[@href='/CanadaCloudPayroll/Account/LogOff']"; 
	final static public String DashBoardClick = "//*[@href='/CanadaCloudPayroll/Dashboard']"; 
	final static public String CompanySetupClick = "(//*[@class='hasSubmenu'])[1]"; 
	final static public String companysetupStale = ".//*[@class='hasSubmenu active']";

	final static public String CompanyInformationClick ="//*[@href='/CanadaCloudPayroll/CompanyInformation']";
	final static public String DepartmentsClick ="//*[@href='/CanadaCloudPayroll/Departments']";
	final static public String ContributionsClick="//*[@href='/CanadaCloudPayroll/Contributions']";
	final static public String ProvincialDataClick="//*[@href='/CanadaCloudPayroll/ProvincialData']";
	final static public String HoursCategoriesClick="//*[@href=\\\"/CanadaCloudPayroll/HourCategories\\\"]";
	final static public String AdditionalIncomeClick="//*[@href='/CanadaCloudPayroll/AdditionalIncome']";
	final static public String OtherDeductionsClick="//*[@href='/CanadaCloudPayroll/OtherDeductions']";
	final static public String LedgerAccountsClick="//*[@href='/CanadaCloudPayroll/LedgerAccounts']";
	
	final static public String EmployeeSetupClick="//*[@href='/CanadaCloudPayroll/EmployeeSetup/EmployeeSetup']";
	final static public String PayCycleClick="(//*[text()='Pay Cycle'])[1]";
	final static public String ProcessPayClick="//*[@href='/CanadaCloudPayroll/PayCyclePayment/CalculatePayDates']";
	final static public String ChequesClick="//*[@href='/CanadaCloudPayroll/PayCycle/ChequesAndPayments']";
	final static public String DistributeToDeptOrJobsClick="//*[@href='/CanadaCloudPayroll/DistributeDeptJobs']";
	final static public String ReportsClick="//*[@href='/CanadaCloudPayroll/Report/Index']";
	final static public String MyAccountClick="";
	
	//****************Company Information elements******************//
	
	final static public String CompanyInformationPageTitle = "(//*[text()='Company Information'])[3]";
	final static public String CompanyName = "//*[@id='CompanyName']";
	final static public String TradeName = "//*[@id='TradeName']";
	final static public String TradenameOnChequesAndReportsCheckbox ="//*[@id='UseOnChecksReports']";
	final static public String  PhoneNo ="//*[@id='Phone']";
	final static public String AddressLine1 = "//*[@id='AddressLine1']";
	final static public String AddressLine2 = "//*[@id='AddressLine2']";
	final static public String  City ="//*[@id='city']";
	final static public String  Province ="//*[@id='ProvinceId']";
	final static public String  PostalCode ="//*[@id='PostalCode']";
	final static public String  FederalAc ="//*[@id='FedAccount']";
	final static public String  PensionPlanregNo="//*[@id='PensionPlan']";
	//Buttons
	final static public String  CompanyInfoSaveBtn ="//*[@id='SubmitCompany']";
	final static public String  CompanyInfoClearBtn ="//*[@id='CampanyCLEAR']";
	final static public String  CompanyInfoCancelBtn ="//*[@id='CampanyCancel']";

	//Hour Categories
	final static public String SelectFromList = "//*[@id='ListCategoryMaster']";
	final static public String AddButtonList = "//*[@id='LoadHourCatList']";

	
	
	
	
	
	
	
	
	final static public String LaunchPagePaycycle = "(//*[@class='hasSubmenu'])[2]";
	final static public String LaunchPageProcessPay = "(//*[@class='linksli'])[11]";
	final static public String LaunchPageProcessPaynextbutton = "//*[@id='Next']";
	final static public String LaunchPageTimesheetnextbutton = "//*[@id='RetainHours']";
	final static public String Employee = ".//option[@value='NJnHHehJ/XB4ZeSEtKE0Gw==']";
	final static public String PayCheckbox = "//*[@id='isPayFrequencySelected_Monthly']";
	// ********EMPLOYEE WAGES>>TAXES************************//
	final static public String TAXEI = "//*[@id='TAXEI']";
	final static public String TAXQPIP = "//*[@id='TAXQPIP']";
	final static public String TAXCPP = "//*[@id='TAXCPP']";
	final static public String TAXQPP = "//*[@id='TAXQPP']";
	final static public String TAXIT = "//*[@id='TAXIT']";
	final static public String TAXQTax = "//*[@id='TAXQTax']";
	// ****************EMPLOYEE EARNINGS**************************//
	final static public String DashboardReports = "(//*[@class='linksli'])[14]";
	final static public String EmployeeEarnings = "(//*[@class='collapsed'])[1]";
	final static public String ChequeDateSelect = "//*[text()='06-17-2019 ']";
	final static public String ChequeDateSelect2 = "//*[text()='06-21-2019 ']";
	final static public String EmployeeSelect = "(//*[@value='NJnHHehJ/XB4ZeSEtKE0Gw=='])[1]";
	final static public String EmployeeName2 = ".//option[@value='hD52BCIMvuTWx1dxj7tgkQ==']";
	final static public String EarningsRegister = "//*[@id='ern_rgstr']";
	// *************************Departments/Job*****************************//
	//add_dept
	final static public String addnewdepartmentsclick = ".//*[@id='AdDept']";
	final static public String enterdepartmentName = "//*[@id='Department0']";
	final static public String departmentsaveBtn = ".//*[@id='SubmitDepartmentText']";
	final static public String DeleteDeptErrorMsgText="//*[@id='DelMsgDept']";
	//add_job
	final static public String JobTitleCLick="//*[@href='#menu1'and//*[text()='Job Title']]";
	final static public String addnewJobtitleclick = "//*[@id='AddDesg'and//*[text()='ADD NEW Job Title']]";
	final static public String selectListOfDepartment = "//*[@id='Departmentsdrp'and //*[@name='Departmentsdrp']]";
	final static public String jobTitleTextbox = "//*[@id='Designation0']";
	final static public String jobTitleSaveBtn = "//*[@id='SubmitDesignation']";

	
	
	
	
	// *********************Additional Income**********************//
	final static public String AddFromListAddtlIncome = ".//*[@id='btnIncomeAddFromList']";
	final static public String SelectFromlistAddtlIncome = ".//*[@id='dropIncomePopUpList']";
	final static public String AdditonalIncomeAddbtn = ".//*[@id='LoadIncomeList']";
	final static public String EditSelecedAdditionalBtn ="//*[@id='btnIncomeEditSelected']";
	final static public String CreateNewAdditionalBtn="//*[@id='btnIncomeCreateNew']";
	final static public String DeleteAdditionalBtn="//*[@id='btnIncomeDelete']";
	final static public String CancelAdditionalBtn="//*[@class='btn btn-danger redirectToDashboard']";
	
	
	//Additional income calculation method for categories
	final static public String EnterCategoryTextCreate="//*[@id='txtCreateIncomeName']";
	final static public String EnterCategoryTextEdit ="//*[@id='txtEditIncomeName']";
	final static public String VariableAmountClick ="//*[@id='Variable Amount']";
	final static public String FixedAmountClick="//*[@id='Fixed Amount']";
	final static public String FixedAmountEnterText="//*[@id='2T2']";
	final static public String FixedAmountSelectPeriod="//*[@id='2-2']";
	final static public String FixedPercentsalesClick="//*[@id='Fixed % Of Sales']";
	final static public String FixedPercentofsalesEnterText="//*[@id='3T_E3']";
	final static public String MileageClick="//*[@id='Mileage Amount Per Mile']";
	final static public String MileageTextEnter="//*[@id='4T_E4']";
	final static public String PieceworkClick="//*[@id='Piecework']";
	final static public String PieceworkTextEnter="//*[@id='5T_E5']";
	final static public String ConfirmPopupBtn="//*[@class='confirm']";
	//Exempt From
	final static public String ExepmtFromTaxList="//*[@type='checkbox']";
	final static public String ExepmtFedTax="//*[@id='Fed_Tax']";
	final static public String ExepmtProvTax="//*[@id='Prov_Tax']";
	final static public String ExepmtEI="//*[@id='EI']";
	final static public String ExepmtCPP="//*[@id='CPP']";
	final static public String ExepmtQPP="//*[@id='QPP']";
	final static public String ExepmtWSIB="//*[@id='WSIB']";
	final static public String ExepmtEHT="//*[@id='EHT']";
	final static public String ExepmtQPIP="//*[@id='QPIP']";
	final static public String ExepmtOmitFromNet="//*[@id='Omit_From_Net']";
	final static public String ExepmtNonVacationable="//*[@id='Non_Vacationable']";
	final static public String ExepmtIncludeInWages="//*[@id='Includein_Wages']";
	
	
	final static public String CreateNewSaveBtn="//*[@id='btnSaveIncome']";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// **********************Deductions**************************//
	
	final static public String OtherDeductionsPageTitle="(//*[text()='Other Deductions'])[2]";
	final static public String AddFromlistBtn = "//*[@id='btnAddFromListDeduction']";
	final static public String DeleteBtn="//*[@id='btnDeductionDelete']";
	final static public String CancelBtn="//*[@value='Cancel']";
	final static public String EditSelectedBtn="//*[@id='btnDeductionEditSelected']";
	final static public String SelectAllfromlist = "//*[@id='dropDeductionPopUpList']";
	final static public String AddButton = "//*[@id='LoadIncomeList']";
	
	final static public String PopupOK = "//*[@class='confirm']";
	final static public String CreateNewBtn="//*[@id='btnDeductionCreateNew']";
	final static public String EnterOtherDeductionName="//*[@id='txtCreateDeductionName']";
	final static public String SelectVariableAmount="//*[@id='Variable Amount']";
	final static public String SelectFixedAmount="//*[@id='Fixed Amount']";
	final static public String EnterFixedAmountValue="//*[@id='7T7']";
	final static public String SelectPayPeriod="//*[@id='7-7']";
	final static public String SelectFixedPercent="//*[@id='Fixed %']";
	final static public String EnterFixedPercentValue="//*[@id='8T8']";
	final static public String SelectTotalWages="//*[@id='8-8']";
	final static public String SelectLimitType="//*[@id='LimitTypeListCreate']";
	final static public String EnterLimitTypeAmount="//*[@id='LimitAmountCreate']";
	final static public String SelectEmployeeMatchType="//*[@id='MatchTypeListCreate']";
	final static public String EnterEmployeeMatchAmount="//*[@id='MatchAmountCreate']";
	final static public String DeductBeforeCheckboxList="//*[@type='checkbox']";
	final static public String SaveBtnOtherDeductionCreateNew="//*[@id='btnDeductionSave']";
	final static public String CancelBtnOtherDeductionCreateNew="//*[@id='btnCancelPopup']";
	final static public String TaxDeductBeforecheckbox="//*[@id='Tax']";
	final static public String EIDeductBeforecheckbox="//*[@id='EI']";
	final static public String CPPDeductBeforecheckbox="//*[@id='CPP']";
	final static public String QPPDeductBeforecheckbox="//*[@id='QPP']";
	final static public String QPIPDeductBeforecheckbox="//*[@id='QPIP']";
	
	
	
	
	
	
	
	
	
	
	
	//*******************************Ledger Accounts*********************************//
	final static public String SelectPayrollCategoriesLedger="//*[@id='selectProvince']";
	final static public String EditActionBtnLedger="//*[@class='awe-btn geditbtn fa fa-pencil-square-o cursr']";
	final static public String EditActionBtnLedgerStale="//*[@class='awe-btn geditbtn fa fa-pencil-square-o cursr'and //*[@type='button']]";
	final static public String EnterLedgerAccountNumbers="//input[@name='AccountNumber']";
	final static public String EnterLedgerAccountNumbersStale="//table/tbody/tr/td/input[@name='AccountNumber']";
	final static public String SizeOfItems="//*[@class='gridPageInfo']";
	final static public String SaveEditAccountNo="//*[@class='gsavebtn fa fa-check cursr can-up']";
	
	
	//****************************Employee Creation****************//
	final static public String DashboardEmployeeSetup = ".//*[@id='lnkEmployees']";
	final static public String CreateEmployee = ".//*[@data-target='#createemp']";
	final static public String EmpFirstName=".//*[@id='FNameCr']";
	final static public String EmpLastName="//*[@id='LnameCr']";
	final static public String EmpStreet="//*[@id='AddressCr']";
	final static public String EmpCity="//*[@id='cityCr']";
	final static public String EmpProvince="//*[@id='ProvinceCr']";
	final static public String EmpSIN="//*[@id='SINCr']";
	final static public String EmpDOB="//*[@name='BirthDate']";
	final static public String EmpPostalCode="//*[@id='PostalCodeCr']";
	final static public String EmpSaveButton="//*[@id='SubmitPersonalInfo']";
	final static public String SelectEmpList="//*[@id='empList']";
	//*********Wages Tab****************//
	final static public String Tab_Wages=".//*[@href='#Wages']";
	final static public String EmpSalPerPayPeriod=".//*[@id='WagesInformation_SalaryPerPay']";
	final static public String PayFrequencyDropDown=".//*[@id='PayFrequency']";
	final static public String HourRate01=".//*[@id='HourRateEdit0']";
	final static public String HourRate02=".//*[@id='HourRateEdit1']";
	final static public String HourRate03=".//*[@id='HourRateEdit2']";
	final static public String HourRate04=".//*[@id='HourRateEdit3']";
	final static public String EmpHireDate=".//*[@id='WagesInformation_HireDate']";
	final static public String SaveButtonCommon="//*[@id='employeeUpdate']";
	final static public  String Tab_Taxes=".//*[@href='#Taxes']";
	//*****************Taxes Tab************//
	final static public String TaxesProvince="//*[@id='provinceListED']";
	//*********************Income/Deductions Tab*************************//
	final static public String Tab_Income=".//*[@href='#Income']";
	final static public String IncomeDropDown="//*[@id='IncomeDrpEdit']";
	final static public String AssignIncomeButton="//*[@id='AssignIncomeEdit']";
	final static public String OtherDeductionTab=".//*[@href='#DeductionsGridTabEdit']";
	final static public String DropDownDeduction=".//*[@id='DeductionsdrpEdit']";
	final static public String AssignDeduction=".//*[@id='AssignDeductionEdit']";
	//*****************Reports-Employee*************************************//
	final static public String ReportsEmpSalary="(//*[@id='frbody']/div/div[17]/div)[2]";
	final static public String ReportsEmpEI="//*[@id=\"frbody\"]/div/div[23]/div[2]";
	final static public String ReportsEmpCPP="//*[@id=\"frbody\"]/div/div[29]/div[2]";
	final static public String ReportsEmpIT="(//*[@id='frbody']/div/div[35]/div)[2]";
	final static public String ReportsEmpNET="(//*[@id=\"frbody\"]/div/div[41]/div)[2]";
	//****************Reports-CompanyTotals********//
	final static public String ReportsCTSalary="(//*[@id='frbody']/div/div[51]/div)[2]";
	final static public String ReportsCTHourly="(//*[@id=\"frbody\"]/div/div[56]/div)[2]";
	final static public String ReportsCTVacation="(//*[@id='frbody']/div/div[61]/div)[2]";
	final static public String ReportsCTEI="(//*[@id='frbody']/div/div[66]/div)[2]";
	final static public String ReportsCTQPIP="(//*[@id='frbody']/div/div[71]/div)[2]";
	final static public String ReportsCTCPP="(//*[@id='frbody']/div/div[76]/div)[2]";
	final static public String ReportsCTQPP="(//*[@id=\"frbody\"]/div/div[81]/div)[2]";
	final static public String ReportsCTIT="(//*[@id='frbody']/div/div[86]/div)[2]";	
	final static public String ReportsCTQTax="(//*[@id='frbody']/div/div[91]/div)[2]";
	final static public String ReportsCTNet="(//*[@id='frbody']/div/div[96]/div)[2]";
	//*****************************YTD************************//
	final static public String YTDSalary="(//*[@id=\"frbody\"]/div/div[19]/div)[2]";
	final static public String YTDEI="(//*[@id='frbody']/div/div[25]/div)[2]";
	final static public String YTDQPIP="(//*[@id='frbody']/div/div[31]/div)[2]";
	final static public String YTDQPP="(//*[@id='frbody']/div/div[37]/div)[2]";
	final static public String YTDIT="(//*[@id='frbody']/div/div[43]/div)[2]";
	final static public String YTDQTax="(//*[@id='frbody']/div/div[49]/div)[2]";
	final static public String YTDNet="(//*[@id='frbody']/div/div[55]/div)[2]";
	//*******************YTD-Company Totals***********************//
	final static public String YTDCSalary="//*[@id='frbody']/div/div[65]/div";
	final static public String YTDCHourly="//*[@id='frbody']/div/div[70]/div";
	final static public String YTDCVacation="//*[@id='frbody']/div/div[75]/div";
	final static public String YTDCEI="//*[@id='frbody']/div/div[80]/div";
	final static public String YTDCQPIP="//*[@id='frbody']/div/div[85]/div";
	final static public String YTDCCPP="//*[@id='frbody']/div/div[90]/div";
	final static public String YTDCQPP="//*[@id='frbody']/div/div[95]/div";
	final static public String YTDCIT="//*[@id='frbody']/div/div[100]/div";
	final static public String YTDCQTax="//*[@id='frbody']/div/div[105]/div";
	final static public String YTDCNet="//*[@id='frbody']/div/div[110]/div";
	//*************************Employees List**********************//
	final static public String ReportsEmployeesList=".//*[@id='dropEmployeeList']";
	final static public String ReportsChequeDateList= ".//*[@id='dropChequeList']";
	//*************************************************************************************//
	final static public String ProcessPayEmpList=".//*[@id='EmpList']";
	final static public String ProcessPay_Taxes=".//*[contains(@id,'TAX')]";
	final static public String Process_OtherDeduc="//*[(@id='OD1' or @id='OD2' or  @id='OD3' or @id='OD4' or @id='OD5' or @id='OD6' or @id='OD7') and @type='text']";
	final static public String Process_AddtlInc="//*[@class='wages']//*[@class='OI pull-right' or @id='VacPay' or @id='Accrued']";
	}
