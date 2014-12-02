package com.bnak.ocr;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitsTest {

    public static String one =  "     |  |";
    public static String two = " _  _||_ ";
    public static String three = " _  _| _|";
    public static String four = "   |_|  |";
    public static String five = " _ |_  _|";
    public static String six = " _ |_ |_|";
    public static String seven = " _   |  |";
    public static String eight = " _ |_||_|";
    public static String nine = " _ |_| _|";

    @org.junit.Test
    public void testParseOne() throws Exception {
        assertEquals(Digits.parse(one), 1);
    }

    @org.junit.Test
    public void testParseTwo() throws Exception {
        assertEquals(Digits.parse(two), 2);
    }

    @org.junit.Test
    public void testParseThree() throws Exception {
        assertEquals(Digits.parse(three), 3);
    }

    @org.junit.Test
    public void testParseFour() throws Exception {
        assertEquals(Digits.parse(four), 4);
    }

    @org.junit.Test
    public void testParseFive() throws Exception {
        assertEquals(Digits.parse(five), 5);
    }

    @org.junit.Test
    public void testParseSix() throws Exception {
        assertEquals(Digits.parse(six), 6);
    }

    @org.junit.Test
    public void testParseSeven() throws Exception {
        assertEquals(Digits.parse(seven), 7);
    }

    @org.junit.Test
    public void testParseEight() throws Exception {
        assertEquals(Digits.parse(eight), 8);
    }

    @org.junit.Test
    public void testParseNine() throws Exception {
        assertEquals(Digits.parse(nine), 9);
    }

    @Test
    public void testFailToParse() throws Exception {
        assertEquals(Digits.parse("^_^"), -1);
    }
}
