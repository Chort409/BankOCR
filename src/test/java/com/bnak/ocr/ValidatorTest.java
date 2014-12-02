package com.bnak.ocr;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidatorTest {

    @org.junit.Test
    public void testCalculateSum() throws Exception {
       assertEquals(0, Validator.calculateSum("490867715"));
    }

    @Test
    public void testCheckSumTrue() throws Exception {
        assertEquals(true, Validator.checkSum("457508000"));
    }

    @Test
    public void testCheckSumFalse() throws Exception {
        assertEquals(false, Validator.checkSum("664371495"));
    }

    @Test
    public void testValidateILL() throws Exception {
        assertEquals("ILL", Validator.validate("123?56789"));
    }

    @Test
    public void testValidateERR() throws Exception {
        assertEquals("ERR", Validator.validate("664371495"));
    }
}
