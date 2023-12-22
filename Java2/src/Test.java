import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Sum of all numbers, while using for " + sum);

        sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        System.out.println("Sum of all numbers, while using while: " + sum);

        sum = 0;
        i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);
        System.out.println("Sum of all numbers, while using do-while: " + sum);

        System.out.print("CLI args: ");
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println();

        System.out.println("First 10 harmonic numbers:");
        for (i = 1; i <= 10; i++) {
            System.out.println(1.0 / i);
        }

        int[] array2 = new int[10];
        Random random = new Random();
        for (i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(250);
        }
        System.out.println("Random numbers array: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted random numbers array: " + Arrays.toString(array2));


        Scanner scn =new Scanner(System.in);

        System.out.print("Enter number: ");

        int number = scn.nextInt();
        int result = 1;
        for (i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Factorial is  " + number + " = " + result);
    }
}
