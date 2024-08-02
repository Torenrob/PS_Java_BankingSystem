package com.perscholas.java_basics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CSVReader {
    public static List<Employee> readEmployeesFromCSV(String file) throws IOException {
        List<Employee> employees = new ArrayList<Employee>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            reader.readLine();
            while((line = reader.readLine()) != null){
                String[] splitLine = line.split(",");
                int id = Integer.parseInt(splitLine[0]);
                String name = splitLine[1];
                double salary = Double.parseDouble(splitLine[2]);
                String position = splitLine[3];
                String department = splitLine[4];
                double hourlyRate = Double.parseDouble(splitLine[5]);
                Employee e = new Employee(id, name, position, department, salary, hourlyRate);
                employees.add(e);
            }
        }catch (IOException ioe) {
            ioe.printStackTrace();
            ioe.getMessage();
        }
      return employees;
    }
}
