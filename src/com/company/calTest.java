package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class calTest {

    @Test
    public void test(){
        assertEquals(3,new cal().add(1,2));
    }

}
