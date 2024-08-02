package com.perscholas.java_basics;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CSVWriter {

    public static void writeEmployeesToCSV(List<Employee> employees, String file) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            employees.forEach(e -> {
                try {
                    String line = e.toCSVString();
                    writer.write(line);
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            });
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
