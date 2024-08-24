package com.rays.basicProgram;

/**
 * The {@code ArmStriongNo} class checks whether a given number is an Armstrong
 * number or not.
 * <p>
 * An Armstrong number for a given number of digits is a number such that the sum
 * of its digits each raised to the power of the number of digits gives the number itself.
 * For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 * </p>
 *
 * @version 1.0
 * @since 24 Aug 2024
 * 
 */
public class ArmStriongNo {

    /**
     * The main method where the Armstrong number check is performed.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {

        int num = 153;
        int temp = 0;
        int num2 = num;
        int r = 0;

        while (num2 != 0) {

            r = num2 % 10;
            temp = temp + r * r * r;
            num2 = num2 / 10;

        }

        if (temp == num) {

            System.out.println("ArmStrongNo");

        } else {
            System.out.println("Not ArmStrongNo");
        }

    }

}
