package com.gla.methods.level3;

public class EmployeeBonus {

    public static double[][] generateEmployeesData(int numEmployees) {
        double[][] data = new double[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] employees) {
        int n = employees.length;
        double[][] newData = new double[n][3];
        for (int i = 0; i < n; i++) {
            double oldSalary = employees[i][0];
            double years = employees[i][1];
            double bonusPercent = years > 5 ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercent;
            double newSalary = oldSalary + bonusAmount;

            newData[i][0] = oldSalary;
            newData[i][1] = bonusAmount;
            newData[i][2] = newSalary;
        }
        return newData;
    }

    public static void displaySummary(double[][] newData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.printf("%-10s %-15s %-15s %-15s\n", "Employee", "Old Salary", "Bonus Amount", "New Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < newData.length; i++) {
            double oldSalary = newData[i][0];
            double bonus = newData[i][1];
            double newSalary = newData[i][2];

            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f\n", i + 1, oldSalary, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15.2f %-15.2f\n", "Total", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employees = generateEmployeesData(numEmployees);
        double[][] newData = calculateBonus(employees);
        displaySummary(newData);
    }
}

