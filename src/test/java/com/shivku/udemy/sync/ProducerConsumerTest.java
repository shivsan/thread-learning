package com.shivku.udemy.sync;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ProducerConsumerTest {
    private ProducerConsumer producerConsumer = new ProducerConsumer();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void running() {
        producerConsumer.running();
    }
}