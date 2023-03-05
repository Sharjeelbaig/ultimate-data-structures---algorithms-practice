import java.util.Scanner;

public class Java {
    static int linearSearchHandler(int array[], int number) {
        int i = 0;
        while (i < array.length && array[i] != number)
            i++;
        return i == array.length ? -1 : i;
    }

    public static void main(String[] args) {
        int array[] = { 6, 22, 36, 48, 59, 71 };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to find in an array: ");
        int number = input.nextInt();
        input.close();
        int location = linearSearchHandler(array, number);
        System.out.println(
                location == -1
                        ? "The number does not exist in the array!"
                        : "The number is found at the index " + location);
    }
}