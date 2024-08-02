package com.perscholas.java_basics;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
//        CSVReader reader = new CSVReader();
        List<Employee> employees = CSVReader.readEmployeesFromCSV("./src/financial_management_system.csv");
        Map<String, Double> salaryByDepartments = FinancialOperations.getTotalSalaryByDepartment(employees);
//        System.out.println(salaryByDepartments);
//        System.out.println(FinancialOperations.getAverageHourlyRateByDepartment(employees));
//        System.out.println(FinancialOperations.getAverageHourlyRateByDepartment(employees, "HR"));
        System.out.println(FinancialOperations.getSumOfEmployeeIdDigits(employees));
        System.out.println(FinancialOperations.getSumOfEmployeeIdDigits(employees));

    }
}