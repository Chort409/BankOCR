package com.bnak.ocr;

import java.io.IOException;

public class Main {

    public static void main(String... strings) throws IOException {
        FileParser.parseFile("input.txt", "output.txt");
    }

}
