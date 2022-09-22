package by.itstep.gulik.util;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);



    public static String inputString(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;
    }

    public static int inputNumber(String prompt) {
        System.out.print(prompt);
        int number = scanner.nextInt();
        return number;
    }
}
