package com.bnak.ocr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void testParse123456789() throws Exception {

        String result = Parser.parseRecord("    _  _     _  _  _  _  _ ",
                                           "  | _| _||_||_ |_   ||_||_|",
                                           "  ||_  _|  | _||_|  ||_| _|");

        assertEquals("123456789", result);
    }

    @Test
    public void testParse000000000() throws Exception {
        String result = Parser.parseRecord(" _  _  _  _  _  _  _  _  _ ",
                                           "| || || || || || || || || |",
                                           "|_||_||_||_||_||_||_||_||_|");

        assertEquals("000000000",result);
    }

    @Test
    public void testParse111111111() throws Exception {
        String result = Parser.parseRecord("                           ",
                                           "  |  |  |  |  |  |  |  |  |",
                                           "  |  |  |  |  |  |  |  |  |");

        assertEquals("111111111",result);
    }

    @Test
    public void testParse222222222() throws Exception {
        String result = Parser.parseRecord(" _  _  _  _  _  _  _  _  _ ",
                                           " _| _| _| _| _| _| _| _| _|",
                                           "|_ |_ |_ |_ |_ |_ |_ |_ |_ ");

        assertEquals("222222222",result);
    }

    @Test
    public void testParse333333333() throws Exception {
        String result = Parser.parseRecord(" _  _  _  _  _  _  _  _  _ ",
                                           " _| _| _| _| _| _| _| _| _|",
                                           " _| _| _| _| _| _| _| _| _|");

        assertEquals("333333333",result);
    }

    @Test
    public void testParse444444444() throws Exception {
        String result = Parser.parseRecord("                           ",
                                           "|_||_||_||_||_||_||_||_||_|",
                                           "  |  |  |  |  |  |  |  |  |");

        assertEquals("444444444",result);
    }

    @Test
    public void testParse555555555() throws Exception {
        String result = Parser.parseRecord(" _  _  _  _  _  _  _  _  _ ",
                                           "|_ |_ |_ |_ |_ |_ |_ |_ |_ ",
                                           " _| _| _| _| _| _| _| _| _|");

        assertEquals("555555555",result);
    }

    @Test
    public void testParse666666666() throws Exception {
        String result = Parser.parseRecord(" _  _  _  _  _  _  _  _  _ ",
                                           "|_ |_ |_ |_ |_ |_ |_ |_ |_ ",
                                           "|_||_||_||_||_||_||_||_||_|");

        assertEquals("666666666",result);
    }

    @Test
    public void testParse777777777() throws Exception {
        String result = Parser.parseRecord(" _  _  _  _  _  _  _  _  _ ",
                                           "  |  |  |  |  |  |  |  |  |",
                                           "  |  |  |  |  |  |  |  |  |");

        assertEquals("777777777",result);
    }

    @Test
    public void testParse888888888() throws Exception {
        String result = Parser.parseRecord(" _  _  _  _  _  _  _  _  _ ",
                                           "|_||_||_||_||_||_||_||_||_|",
                                           "|_||_||_||_||_||_||_||_||_|");

        assertEquals("888888888",result);
    }

    @Test
    public void testParse999999999() throws Exception {
        String result = Parser.parseRecord(" _  _  _  _  _  _  _  _  _ ",
                                           "|_||_||_||_||_||_||_||_||_|",
                                           " _| _| _| _| _| _| _| _| _|");

        assertEquals("999999999",result);
    }
}
