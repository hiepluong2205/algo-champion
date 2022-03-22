/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date:
 * Date Submitted:
 *
 * - https://deanza.instructure.com/courses/23660/assignments
 * - https://discord.com/channels/927730169152675841/927730169731493972
 */

package io.github.hiepluong2205.fhda.cis35a;

import java.util.Scanner;

public class ChampCIS35A {
    static Scanner in = new Scanner(System.in);

    public static void p1(String[] args) {
        int number = 10;
        if (number > 0) {
            System.out.println("Number is positive.");
        }
        System.out.println("This statement is always executed.");
    }

    public static void p15(String[] args) {
        int sum = 0, i = 4;
        while (i != 0) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }

    public static void p13(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("Line " + i);
            i = ++i + i++;
        }
    }

    public static void p14(String[] args) {
        int i = 1;
        while (i >= 10) {
            System.out.println("Line " + i);
            i = i - 1;
        }
    }

    public static void p12(String[] args) {
        int sum = 0;
        for (int i = 1; ; ) {
            System.out.println(i);
        }
    }

    public static void p10(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; ) {
            System.out.println(i);
        }
    }

    public static void p11(String[] args) {
        for (int i = 1; ; i++) {
            System.out.println(i);
        }
    }

    public static void p6(String[] args) {
        int week = 3;
        String day;
        switch (week) {
            case 1:
                day = "Sunday";
            case 2:
                day = "Monday";
            case 3:
                day = "Tuesday";
            case 4:
                day = "Wednesday";
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                day = "Saturday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println(day);
    }

    public static void p7a(String[] args) {
        int week = 17;
        String day;
        switch (week) {
            case 1:
                day = "Sunday";
            case 2:
                day = "Monday";
            case 3:
                day = "Tuesday";
            case 4:
                day = "Wednesday";
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                day = "Saturday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println(day);
    }

    public static void p7b(String[] args) {
        char operator;
        Double number1, number2, result;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter operator (either +, -, * or /):  ");
        operator = in.next().charAt(0);
        System.out.print("Enter number1 and number2 respectively:  ");
        number1 = 55.0;
        number2 = 33.0;
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.print(number1 + "+" + number2 + "  = " + result);
            case '-':
                result = number1 - number2;
                System.out.print(number1 + "-" + number2 + "  = " + result);
            case '*':
                result = number1 * number2;
                System.out.print(number1 + "*" + number2 + "  = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.print(number1 + "/" + number2 + "  = " + result);
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }

    public static void p8(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; --i) {
            System.out.println("Hello");
        }
    }

    public static void p9(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }

    public static void p2(String[] args) {
        int number = -10;
        if (number > 0) System.out.println("Hello San Ramon");
        System.out.println("What is this printed?");
    }

    public static void p3(String[] args) {
        int number = -10;
        if (number > 0) {
            System.out.println("Hello San Ramon");
            System.out.println("What is this printed?");
        } else System.out.println("Why?");
    }

    public static void p4(String[] args) {
        int number = -10;
        int x = 55;
        if (x > 55) if (number > 0) {
            System.out.println("Hello San Ramon");
            System.out.println("What is this  printed ? ");
        } else System.out.println("Why?");
    }

    public static void p18(String[] args) {
        int x = 55;
        do {
            System.out.print("Enter a number: ");
            x = in.nextInt();
        } while (x < -5);
    }

    public static void p16(String[] args) {
        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            sum += number;
        } while (number != 0.0);
        System.out.println("Sum = " + sum);
    }

    public static void p5(String[] args) {
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, ap = 0.0;
        if (n1 >= n2) {
            if (n1 >= n3) {
                ap = n1;
            } else {
                ap = n3;
            }
        } else {
            if (n2 >= n3) {
                ap = n2;
            } else {
                ap = n3;
            }
        }
        System.out.println(ap);
    }
}