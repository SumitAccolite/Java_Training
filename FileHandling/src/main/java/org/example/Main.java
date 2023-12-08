package org.example;

import java.io.File;
import java.util.List;

class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sumit.bashetwar\\demo\\FileHandling\\src\\main\\java\\org\\example\\Source.txt");
        List<String> lines = FileReaders.readFile(file);
        lines = SortByComparator.sortLine(lines);
        FileWriter.writeToFile(lines);
    }
}