package com.mtnfog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {

            LOGGER.info("This is a sample log message " + i + " for patient 123-45-6789.");

        }

    }

}
