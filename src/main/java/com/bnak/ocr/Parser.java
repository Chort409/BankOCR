package com.bnak.ocr;

public class Parser {

    static String parseRecord(String line1, String line2, String line3)
    {
        StringBuilder result = new StringBuilder(9);
        int startIndex;

        if (line1.length() != 27 || line2.length() != 27 || line3.length() != 27)
            throw new IllegalArgumentException("line length is not 27 characters");

        for(int i = 0 ; i < 9;i++)
        {
            StringBuilder number = new StringBuilder(9);
            startIndex = i*3;

            number.append(line1.substring(startIndex,startIndex+3));
            number.append(line2.substring(startIndex,startIndex+3));
            number.append(line3.substring(startIndex,startIndex+3));

            int digit = Digits.parse(number.toString());

            if (digit < 0)
                throw new IllegalArgumentException(String.format("Unparseable digit at %d : %s", i , number.toString()) );

            result.append(String.valueOf(digit));
        }
        return result.toString();
    }
}
