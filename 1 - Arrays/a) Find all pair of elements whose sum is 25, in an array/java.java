
public class java {
    public static void main(String[] args) {
        int array[] = { 6, 16, 10, 15, 8, 20, 45, 12, 4, 6 };
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print((array[i] + array[j] == 25)
                        ? "array[" + i + "]" + " + " + "array[" + j + "]" + " = " + 25
                        : "");
            }
        }

    }
}