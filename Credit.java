

import java.util.Scanner;

public class Credit {

    public static boolean isValid(long number) {

        int total = sumOfOddPlace(number) + sumOfOddPlace(number);


        if ((total % 10 == 0) && (firstNumber(number, 1) == true) && (Size(number)>=13 ) && (Size(number)<=16 )) {
            return true;
        } else {
            return false;
        }
    }

    public static int Digit(int number) {

        if (number <= 9) {
            return number;
        } else {
            int firstDigit = number % 10;
            int secondDigit = (int) (number / 10);

            return firstDigit + secondDigit;
        }
    }
    public static int sumOfOddPlace(long number) {
        int result = 0;

        while (number > 0) {
            result += (int) (number % 10);
            number = number / 100;
        }

        return result;
    }

    public static int sumOfDoubleEvenPlace(long number) {

        int result = 0;
        long temp = 0;

        while (number > 0) {
            temp = number % 100;
            result += Digit((int) (temp / 10) * 2);
            number = number / 100;
        }

        return result;
    }

    public static boolean firstNumber(long number, int y) {

        if ((getPrefix(number, y) == 4)
                || (getPrefix(number,y) == 5)
                || (getPrefix(number, y) == 3)) {

            if (getPrefix(number, y) == 3) {
                System.out.println("\nVisa Card ");
            } else if (getPrefix(number, y) == 5) {
                System.out.println("\nMaster Card ");
            } else if (getPrefix(number, y) == 3) {
                System.out.println("\nAmerican Express Card ");
            }
            else if (getPrefix(number,y) == 6){
            	System.out.println("\n Discover Card");
            }

            return true;

        } else {

            return false;

        }
    }

    public static int Size(long d) {

        int count = 0;

        while (d > 0) {
            d = d / 10;

            count++;
        }

        return count;

    }

    public static long getPrefix(long number, int k) {

        if (Size(number) < k) {
            return number;
        } else {

            int size = (int) Size(number);

            for (int i = 0; i < (size - k); i++) {
                number = number / 10;
            }

            return number;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a credit card number: ");

        long input = sc.nextLong();


        if (isValid(input) == true) {
            System.out.println("\n" + input + "  is Valid. ");
        } else {
            System.out.println("\n" + input + " is Invalid. ");
        }

    }

        	}
        