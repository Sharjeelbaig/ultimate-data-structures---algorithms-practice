public class Java {
    public static void main(String[] args) {
        int A[][] = { { 4, 2, 3 },
                { 3, 1, 3 },
                { 3, 6, 2 } };
        int B[][] = { { 2, 4, 5, 9 },
                { 3, 2, 8, 7 },
                { 8, 4, 3, 2 } };
        int C[][] = new int[3][4];

        int row, col, element;

        for (row = 0; row < 3; row++) {
            for (col = 0; col < 4; col++) {
                C[row][col] = 0;
                for (element = 0; element < 3; element++) {
                    C[row][col] += A[row][element] * B[element][col];
                }
            }
        }

        for (row = 0; row < 3; row++) {
            System.out.print('|');
            for (col = 0; col < 4; col++) {
                System.out.print(" " + C[row][col] + " ");
            }
            System.out.println('|');
        }

    }
}