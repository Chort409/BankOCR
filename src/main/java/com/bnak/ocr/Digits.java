package com.bnak.ocr;

public class Digits {
    public static final String ZERO = " _ | ||_|";
    public static final String ONE =  "     |  |";
    public static final String TWO = " _  _||_ ";
    public static final String THREE = " _  _| _|";
    public static final String FOUR = "   |_|  |";
    public static final String FIVE = " _ |_  _|";
    public static final String SIX = " _ |_ |_|";
    public static final String SEVEN = " _   |  |";
    public static final String EIGHT = " _ |_||_|";
    public static final String NINE = " _ |_| _|";

    private static final Map<String, Integer> digitsMap;
    static {
        digitsMap = new HashMap<String, Integer>(10);
        digitsMap.put(ZERO, 0);
        digitsMap.put(ONE, 1);
        digitsMap.put(TWO, 2);
        digitsMap.put(THREE, 3);
        digitsMap.put(FOUR, 4);
        digitsMap.put(FIVE, 5);
        digitsMap.put(SIX, 6);
        digitsMap.put(SEVEN, 7);
        digitsMap.put(EIGHT, 8);
        digitsMap.put(NINE, 9);
    }

    public static int parse(String s)
    {
        Integer result = digitsMap.get(s);
        if (null == result)
            return -1;
        else
            return result;

    }
}
