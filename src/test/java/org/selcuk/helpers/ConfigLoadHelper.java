package org.selcuk.helpers;

import org.selcuk.frameworkEnums.EnvType;

import java.util.Properties;

import static org.selcuk.constants.FrameworkConstants.*;

public class ConfigLoadHelper {
    private static  final String BASE_URL = "baseUrl";
    private static  final String SEND_EMAIL_TO_USERS = "send_email_to_users";
    private Properties properties;
    private static ConfigLoadHelper configLoadHelper;
    private ConfigLoadHelper(){
        // setting the env prameter here/
        // by default , stage env will be taken.
        String env = System.getProperty(PARAMETER_ENV,String.valueOf(EnvType.STG));
        switch (EnvType.valueOf(env)){
            case QA:{
                properties = PropertyHelper.propertyLoader(DIRECTORY_ENV_CONFIG + ENV_CONFIG_QA);
                break;
            }
            case INT:{
                properties = PropertyHelper.propertyLoader(DIRECTORY_ENV_CONFIG + ENV_CONFIG_INT);
                break;
            }
            case STG:{
                properties = PropertyHelper.propertyLoader(DIRECTORY_ENV_CONFIG + ENV_CONFIG_STG);
                break;
            }
            case PROD:{
                properties = PropertyHelper.propertyLoader(DIRECTORY_ENV_CONFIG + ENV_CONFIG_PROD);
                break;
            }
            default:
                throw new IllegalStateException("INVALID ENV: " + env);
        }

        }
    public static ConfigLoadHelper getInstance(){
        if (configLoadHelper == null){
            configLoadHelper = new ConfigLoadHelper();
        }
        return configLoadHelper;

    }
    public String getBaseUrl() {
        return getPropertyValue(BASE_URL);
    }

    public String getSendEmailToUsers() {
        return getPropertyValue(SEND_EMAIL_TO_USERS);
    }

    private String getPropertyValue(String propertyKey) {
        String prop = properties.getProperty(propertyKey);
        if (prop != null) {
            return prop.trim();
        } else {
            throw new RuntimeException("Property " + propertyKey + " is not specified in the config.properties file");
        }
    }
    }


