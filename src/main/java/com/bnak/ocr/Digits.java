package com.bnak.ocr;


public class Digits {

    public static final String ZERO = " _ | ||_|";
    public static final String ONE =  "    |  | ";
    public static final String TWO = " _  _||_ ";
    public static final String THREE = " _  _| _|";
    public static final String FOUR = "   |_|  |";
    public static final String FIVE = " _ |_  _|";
    public static final String SIX = " _ |_ |_|";
    public static final String SEVEN = " _   |  |";
    public static final String EIGHT = " _ |_||_|";
    public static final String NINE = " _ |_| _|";

    public static int parse(String s)
    {
        int result;
        switch (s)
        {
            case ZERO :
                result = 0;
                break;
            case ONE :
                result = 1;
                break;
            case TWO :
                result = 2;
                break;
            case THREE :
                result = 3;
                break;
            case FOUR :
                result = 4;
                break;
            case FIVE :
                result = 5;
                break;
            case SIX :
                result = 6;
                break;
            case SEVEN :
                result = 7;
                break;
            case EIGHT :
                result = 8;
                break;
            case NINE :
                result = 9;
                break;
            default:
                result = -1;
                break;
        }
        return result;
    }
}
