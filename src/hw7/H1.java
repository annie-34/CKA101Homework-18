package hw7;

import java.io.BufferedReader;
import java.io.FileReader;

public class H1 {
    public static void main(String[] args) {
        int charCount = 0;
        int lineCount = 0;
        int byteCount = 0;
        try {
            FileReader fr = new FileReader("C:\\CKA101_worksppace\\CKA101Homework-18\\files\\Sample.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
            	System.out.println(line);
            	lineCount++;                 
            	charCount += line.length(); 
            	byteCount += line.getBytes().length; 
            }

			br.close();

				System.out.println("=========");
				System.out.println("總行數: " + lineCount);
				System.out.println("總字元數: " + charCount);
				System.out.println("總位元組: " + byteCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}