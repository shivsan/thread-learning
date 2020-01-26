package com.shivku.udemy.sync;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TwoThreadsSharingTheSameVariableTest {

    @Test
    public void runThread() {
        var classToRun = new TwoThreadsSharingTheSameVariable();
        classToRun.runThread();
    }
}