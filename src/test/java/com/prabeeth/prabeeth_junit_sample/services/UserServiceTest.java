package com.prabeeth.prabeeth_junit_sample.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Test
    public void testGetUserById() {
        String expected = "User1";
        String actual = userService.getUserById(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateUser() {
        boolean result = userService.createUser("John");
        assertEquals(true, result);
    }
}