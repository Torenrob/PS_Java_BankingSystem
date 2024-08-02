package com.perscholas.java_basics;
import java.util.*;
import java.io.*;

public class FinancialOperations {

    public static double getHourlyRateSumLoop(List<Employee> employees) {
        double sum = 0.0;
        for (Employee e : employees) {
            sum += e.getHourly_rate();
        }
        return sum;
    }
    public static double getHourlyRateSum(List<Employee> employees) {
       return employees.stream()
                .mapToDouble(Employee::getHourly_rate)
                .sum();
    }


    public static double sumDepartmentSalary(List<Employee> employees, String department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(department))
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    public static double getAverageSalaryByDepartment(List<Employee> employees, String department){
        return employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(department))
                .mapToDouble(Employee::getSalary)
                .average().orElse(0);

    }

    public static double sumDepartmentHourlyRate(List<Employee> employees, String department){
        return employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(department))
                .mapToDouble(Employee::getHourly_rate)
                .sum();
    }

    public static double getAverageHourlyRateByDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(department))
                .mapToDouble(Employee::getHourly_rate)
                .average().orElse(0);
    }
//    public static Map<String, Double> getTotalSalaryByDepartment(List<Employee> employees){
//        return employees.stream()
//    }


}
