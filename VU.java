 
package vu.project1;

public class VU {
    private static final double MINIMUM_WAGE = 40000.0;
    private static final int MAX_HOURS = 60;

    public static void calculatePay(double basePay, int hoursWorked) {
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay is below the minimum wage.");
        } else if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked exceeds the maximum limit.");
        } else {
            double totalPay = hoursWorked <= 40 ? hoursWorked * basePay
                    : 40 * basePay + (hoursWorked - 40) * basePay * 1.5;
            System.out.println("Total pay: UGX" + totalPay);
        }
    }

    public static void main(String[] args) {
        double[] basePays = {28000.0, 35000.0, 38000.0};
        int[] hoursWorked = {35, 45, 75};

        for (int i = 0; i < basePays.length; i++) {
            System.out.println("Employee " + (char)('A' + i) + ":");
            calculatePay(basePays[i], hoursWorked[i]);
        }
    }
}