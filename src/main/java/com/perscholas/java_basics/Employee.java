package com.perscholas.java_basics;

public class Employee {
    private int id;
    private String name;
    private String position;
    private String department;
    private double salary;
    private double hourly_rate;

    public Employee(int id, String name, String position, String department, double salary, double hourly_rate) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
        this.hourly_rate = hourly_rate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public double getHourly_rate() {
        return hourly_rate;
    }

    public String toCSVString() {
        return
                id +
                "," + name +
                "," + salary +
                "," + position +
                "," + department +
                "," + hourly_rate;
    }

    @Override
    public String toString() {
        return "Employee - " +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", position: '" + position + '\'' +
                ", department: '" + department + '\'' +
                ", salary: " + salary +
                ", hourly_rate: " + hourly_rate;
    }
}
