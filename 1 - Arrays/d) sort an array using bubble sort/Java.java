public class Java {
    static void bubbleSort(int array[]) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 9 };
        System.out.println("Array before sorting: ");
        for (var each : array) {
            System.out.print(each + " ");
        }
        bubbleSort(array);
        System.out.println("\nArray after sorting: ");
        for (var each : array) {
            System.out.print(each + " ");
        }
    }
}
