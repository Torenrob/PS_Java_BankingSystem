package com.perscholas.java_basics;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        CSVReader reader = new CSVReader();
        List<Employee> employees = reader.readEmployeesFromCSV("./src/financial_management_system.csv");
        FinancialOperations fo = new FinancialOperations();
        System.out.println(fo.getHourlyRateSum(employees));
        System.out.println(fo.sumDepartmentSalary(employees, "finance"));

    }
}