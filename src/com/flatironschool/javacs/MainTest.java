package com.flatironschool.javacs;

import static org.junit.Assert.assertTrue;

/**
 * Created by pletcher on 3/10/16.
 */
public class MainTest {

    @org.junit.Test
    public void testGetVersion() throws Exception {
        Main main = new Main();
        assertTrue(main.getVersion() >= 1.7);
    }
}