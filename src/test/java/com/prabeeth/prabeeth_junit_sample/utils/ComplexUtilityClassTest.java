package com.prabeeth.prabeeth_junit_sample.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ComplexUtilityClass.class, Logger.class})
public class ComplexUtilityClassTest {

    @Mock
    private Logger logger;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        PowerMockito.mockStatic(ComplexUtilityClass.class);
        PowerMockito.mockStatic(Logger.class);
        PowerMockito.when(Logger.getLogger(ComplexUtilityClass.class.getName())).thenReturn(logger);
    }

    @Test
    public void testComplexCalculation() {
        int a = 4;
        int b = 5;
        int c = 2;
        int dbResult = 9; // a + b = 9
        double expected = Math.sqrt(dbResult * c); // sqrt(18)

        PowerMockito.mockStatic(ComplexUtilityClass.class);

        PowerMockito.doNothing().when(logger).info("Starting complexCalculation");
        PowerMockito.doNothing().when(logger).info("Completed complexCalculation with result: " + expected);
        PowerMockito.when(ComplexUtilityClass.fetchFromDatabase(a, b)).thenReturn(dbResult);

        double actual = ComplexUtilityClass.complexCalculation(a, b, c);

        assertEquals(expected, actual, 0.001);

        PowerMockito.verifyStatic(ComplexUtilityClass.class);
        ComplexUtilityClass.fetchFromDatabase(a, b);
    }
}