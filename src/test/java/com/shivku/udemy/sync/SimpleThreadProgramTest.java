package com.shivku.udemy.sync;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class SimpleThreadProgramTest {
    @Test
    public void runThreads() {
        SimpleThreadProgram s = new SimpleThreadProgram();
        s.threading();
    }
}