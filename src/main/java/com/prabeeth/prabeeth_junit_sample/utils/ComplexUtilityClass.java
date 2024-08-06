package com.prabeeth.prabeeth_junit_sample.utils;

import java.util.logging.Logger;

public class ComplexUtilityClass {

    private static final Logger logger = Logger.getLogger(ComplexUtilityClass.class.getName());

    public static double complexCalculation(int a, int b, int c) {
        logger.info("Starting complexCalculation");

        // Simulate a database call
        int dbResult = fetchFromDatabase(a, b);

        // Perform a complex calculation
        double result = Math.sqrt(dbResult * c);

        logger.info("Completed complexCalculation with result: " + result);
        return result;
    }

    static int fetchFromDatabase(int a, int b) {
        // Simulate a database operation
        return a + b;
    }
}