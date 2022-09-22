package com.cellwize.developersdk.javaclient;

import com.cellwize.developersdk.AppConfig;

import com.cellwize.developersdk.ApplicationInstance;
import com.cellwize.developersdk.IApplication;



public class Cpr {
    
    public static void main(String[] args) {
        run();
    }

    /* Edit cpr_1.groovy file content with the relevant cpr for CHIME Designer*/
    public static void run() {
        AppConfig config  = new AppConfig.Builder()
         .showApiLog(true)
                .fromConfigYaml()
                .build();
        IApplication app = ApplicationInstance.newInstance(config);
        app.runCpr("src/main/resources/cpr_1.groovy");
    }


}
