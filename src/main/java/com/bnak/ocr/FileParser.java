package com.bnak.ocr;

import java.io.*;

public class FileParser {

    public static void parseFile(String pathToInFile, String pathToOutFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathToInFile));
        PrintWriter writer = null;
        try {
            writer  = new PrintWriter(pathToOutFile, "UTF-8");

            String line1 = br.readLine();

            while (line1 != null)
            {
                String line2 = br.readLine();
                String line3 = br.readLine();
                br.readLine(); // ignore the 4th line

                String result = null;
                String validate = null;
                try {
                    result = Parser.parseRecord(line1, line2, line3);
                    validate = Validator.validate(result);

                    if (validate.length() != 0)
                        result += " "+validate;

                    writer.println(result);
                } catch (Exception e) {
                  writer.println("ERR");
                }

                line1 = br.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(String.format("Error while processing: input inputFile: %s  outPutFile: %s. Please check files.", pathToInFile, pathToOutFile));
        }
        finally {
            writer.close();
            br.close();
        }
    }
}
