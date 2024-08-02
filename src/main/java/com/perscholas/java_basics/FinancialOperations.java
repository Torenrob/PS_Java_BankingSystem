package com.perscholas.java_basics;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

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

    public static double getAverageSalaryByDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(department))
                .mapToDouble(Employee::getSalary)
                .average().orElse(0);

    }

    public static double sumDepartmentHourlyRate(List<Employee> employees, String department) {
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

    public static Map<String, Double> getTotalSalaryByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.summingDouble(e -> e.getSalary())));
        //.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));

    }

    public static Map<String, Double> getAverageSalaryByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    }

    public static Map<String, Double> getTotalHourlyRateByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getHourly_rate)));
    }

    public static Map<String, Double> getAverageHourlyRateByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getHourly_rate)));
    }

    public static int getNumSum(int number) {
        String[] str = String.valueOf(number).split("");

        int sum = 0;
        for (String i: str) {
            sum += Integer.parseInt(i);
        }

        return sum;
    }

    public static int getSumOfEmployeeIdDigits(List<Employee> employees) {
        return employees.stream()
                .mapToInt(e -> getNumSum(e.getId()))
                .sum();
    }




}
