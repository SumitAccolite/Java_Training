package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileReaders {
    public static List<String> readFile(File file){
        List<String> lines = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new java.io.FileReader(file))){
            String line = null;
            while( (line = br.readLine()) !=null){
                lines.add(line);
                //System.out.println(line);
            }
        }catch (Exception e){
        }
        return lines;
    }
}
