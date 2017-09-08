package pl.coderstrust.fibonacciIsNumber;

import java.util.Scanner;

public class IsFibonacci {

    public static void main(String[] args) {

        System.out.println("Wpisz liczbę którą chcesz sprawdzić : ");
        Scanner scanner = new Scanner(System.in);
        long numberWhatWeCheck = scanner.nextLong();
       // long longMaxValue = 9223372036854775807L;
        boolean isFibonacci = new IsFibonacci().checkNumberIsFibonnacci(numberWhatWeCheck);

        if (!isFibonacci) {
            System.out.println("Nie, liczba " + numberWhatWeCheck + " nie należy do ciągu Fibonacciego");
        } else {
            System.out.println("Tak liczba " + numberWhatWeCheck + " należy do ciągu Fibonacciego");

        }

    }

    public boolean checkNumberIsFibonnacci(long number) {


        long twoNumbersBefore;
        long oneNumberBefore = 0;
        long currentNumber = 1;


        while (currentNumber < number) {
            twoNumbersBefore = oneNumberBefore;
            oneNumberBefore = currentNumber;
            currentNumber = oneNumberBefore + twoNumbersBefore;

            if (currentNumber > number || currentNumber < 0) {
                return false;
            } else if (currentNumber == number) {
                return true;
            }

        }
        return false;
    }

}