package com.ravi.ds.array;

import com.ravi.ds.array.OneAway;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneAwayTest {
    @Test
    public void shoulIdentifyIfElementIsOneInsert() {
        OneAway oneAway = new OneAway("pale", "ple");
        assertTrue(oneAway.isAway());
    }
    @Test
    public void shoulIdentifyIfElementIsOneDelete() {
        OneAway oneAway = new OneAway("ple", "plae");
        assertTrue(oneAway.isAway());
    }
    @Test
    public void shoulIdentifyIfElementIsOneReplace() {
        OneAway oneAway = new OneAway("plee", "plae");
        assertTrue(oneAway.isAway());
    }
    @Test
    public void shoulIdentifyIfElementIsNotOneAway() {
        OneAway oneAway = new OneAway("aple", "plae");
        assertFalse(oneAway.isAway());
    }
}
