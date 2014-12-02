package com.bnak.ocr;

public class Validator {

    public static int calculateSum(String str)
    {
        Integer result = 0;
        if( str.length() != 9)
            throw  new IllegalArgumentException("String has to be 9 characters long");

        try
        {
            Integer number = Integer.parseInt(str);
            for(int i = 1; i<10; i++)
            {
                Integer lastDigit = number % 10;
                result += i*lastDigit;
                number /= 10;
            }
        }
        catch(NumberFormatException nfe)
        {
            throw  new IllegalArgumentException("String is not numeric");
        }
        return result%11;
    }

    public static boolean checkSum(String string)
    {
        return calculateSum(string) == 0;
    }

    public static String validate(String s)
    {
        if (s.contains("?"))
            return  "ILL";

        if(!checkSum(s))
            return "ERR";

        return "";
    }
}
