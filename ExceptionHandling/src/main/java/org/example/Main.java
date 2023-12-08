package org.example;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\sumit.bashetwar\\demo\\ExceptionHandling\\src\\main\\java\\org\\example\\output.txt");
            InputStream input = new FileInputStream("C:\\Users\\sumit.bashetwar\\demo\\ExceptionHandling\\src\\main\\java\\org\\example\\output.txt")){
            String msg= "havsuzkjciskzx";
            //byte[] byteArray = msg.getBytes();
            for(int i = 0 ; i < msg.length(); i++) {
                fileOutputStream.write(msg.charAt(i));
            }
            System.out.println("Data written into file");
            System.out.println(msg);
            DataInputStream inst = new DataInputStream(input);
            int data = input.available();
            byte[] byteArray2 = new byte[data]; //
            inst.read(byteArray2);
            String str = new String(byteArray2);
            System.out.println("Data read from file");
            System.out.println(str);
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
}