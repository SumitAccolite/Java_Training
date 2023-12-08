package org.example;

import java.io.FileOutputStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try (FileOutputStream fos= new FileOutputStream("C:\\Users\\sumit.bashetwar\\demo\\ExceptionWithResources\\src\\main\\java\\org\\example\\file.txt")) {
            String text = " This is my java program for Exception with Resources";
                   for(int i = 0 ;  i < text.length() ; i++) {

                        fos.write(text.charAt(i));
                    }
                }
                catch (Exception e) {
                    System.out.println(e);
        }
        finally {
            System.out.println("Message has been written into the file.txt");
        }
    }
}
