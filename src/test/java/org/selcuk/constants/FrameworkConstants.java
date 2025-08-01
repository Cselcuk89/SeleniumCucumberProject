package org.selcuk.constants;

public class FrameworkConstants {
    public static final int EXPLICIT_WAIT = 10;
    public static final String YES = "yes";
    public static final String NO = "no";
    public static final String PROJECT_NAME = "Selenium Cucumber Project";
    //PARAMETERS TO BE USED FROM MAVEN COMMAND LINE
    public static final String PARAMETER_ENV = "env";
    public static final String PARAMETER_BROWSER = "browser";
    /* SUPPORTED BROWSERS */
    public static final String CHROME_BROWSER = "chrome";
    public static final String FIREFOX_BROWSER = "firefox";
    public static final String SAFARI_BROWSER = "safari";
    public static final String EDGE_BROWSER = "edge";
    public static final String OPERA_BROWSER = "opera";

    public static final String ATTRIBUTE_VALUE = "value";

    /* ENVIRONMENT CONFIGURATION FILES */
    public static final String DIRECTORY_ENV_CONFIG = "src/test/resources/config/";
    public static final String ENV_CONFIG_QA = "qa_config.properties";
    public static final String ENV_CONFIG_INT = "int_config.properties";
    public static final String ENV_CONFIG_STG = "stg_config.properties";
    public static final String ENV_CONFIG_PROD = "prod_config.properties";

    /* CUCUMBER REPORTS */
    public static final String REPORTS_CUCUMBER_LOCATION = "./target/cucumber/";
    public static final String REPORTS_CUCUMBER_LOCAL = REPORTS_CUCUMBER_LOCATION + "cucumber.html";
    public static final String REPORTS_ZIPPED_FILE_NAME = "CucumberReports.zip";



}
