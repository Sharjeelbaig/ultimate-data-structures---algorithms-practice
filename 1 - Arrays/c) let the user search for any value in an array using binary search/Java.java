import java.util.Scanner;

public class Java {
    static int binarySearch(int array[], int left, int right, int numberToFind) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == numberToFind)
                return mid;
            if (array[mid] < numberToFind) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6 };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to find in an array: ");
        int numberToFind = input.nextInt();
        input.close();
        int location = binarySearch(array, 0, array.length, numberToFind);
        System.out
                .println(location == -1
                        ? "Number does not exist"
                        : numberToFind + " is located at index " + location);
    }
}
