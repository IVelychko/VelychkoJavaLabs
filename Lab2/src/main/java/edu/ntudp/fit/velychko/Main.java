package edu.ntudp.fit.velychko;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int MIN_ROWS = 1;
    public static final int MAX_ROWS = 20;
    public static final int MIN_COLUMNS = 1;
    public static final int MAX_COLUMNS = 20;
    public static final int SPECIFIC_VALUES = 1;
    public static final int RANDOM_VALUES = 2;
    public static void main(String[] args) {
        int[][] matrix;
        int rows = 0, columns = 0;
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Set size of the matrix.");
        while (rows < MIN_ROWS || rows > MAX_ROWS) {
            System.out.println("Enter number of rows between "+MIN_ROWS+" and "+MAX_ROWS+": ");
            if (scanner.hasNextInt()) {
                rows = scanner.nextInt();
                if (rows < MIN_ROWS || rows > MAX_ROWS) {
                    System.out.println("You should write number between "+MIN_ROWS+" and "+MAX_ROWS);
                }
                scanner.nextLine();
            }
            else {
                System.out.println("You should write number between "+MIN_ROWS+" and "+MAX_ROWS);
                scanner.nextLine();
            }
        }
        while (columns < MIN_COLUMNS || columns > MAX_COLUMNS) {
            System.out.println("Enter number of columns between "+MIN_COLUMNS+" and "+MAX_COLUMNS+": ");
            if (scanner.hasNextInt()) {
                columns = scanner.nextInt();
                if (columns < MIN_COLUMNS || columns > MAX_COLUMNS) {
                    System.out.println("You should write number between "+MIN_COLUMNS+" and "+MAX_COLUMNS);
                }
                scanner.nextLine();
            }
            else {
                System.out.println("You should write number between "+MIN_COLUMNS+" and "+MAX_COLUMNS);
                scanner.nextLine();
            }
        }
        while (true) {
            System.out.printf("""
                            How do you want to fill the matrix with values?
                            %d. Type elements yourself.
                            %d. Set elements randomly.""",
                    SPECIFIC_VALUES, RANDOM_VALUES
                    );
            System.out.println();
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input == SPECIFIC_VALUES) {
                    matrix = getCustomMatrix(rows, columns);
                    break;
                }
                else if (input == RANDOM_VALUES) {
                    matrix = getRandomMatrix(rows, columns);
                    break;
                }
                else {
                    System.out.println("You should choose between "+SPECIFIC_VALUES+" and "+RANDOM_VALUES+" options");
                }
            }
            else {
                System.out.println("You should choose between "+SPECIFIC_VALUES+" and "+RANDOM_VALUES+" options");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Matrix is created:");
        printMatrix(matrix);
        int min = findMinElement(matrix);
        int max = findMaxElement(matrix);
        double arithmeticMean = findArithmeticMean(matrix);
        double geometricMean = findGeometricMean(matrix);
        System.out.println("Min element of the matrix: " + min);
        System.out.println("Max element of the matrix: " + max);
        System.out.println("Arithmetic mean: " + arithmeticMean);
        System.out.println("Geometric mean: " + geometricMean);
    }
    public static int[][] getCustomMatrix(int inputRows, int inputColumns) {
        int[][] matrix = new int[inputRows][inputColumns];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Row " + (i + 1) + ", Column " + (j + 1) + " element: ");
                if (scanner.hasNextInt()) {
                    matrix[i][j] = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                }
            }
        }
        return matrix;
    }
    public static int[][] getRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int min = 1;
        int max = 20;
        int diff = max - min;
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rand.nextInt(diff + 1) + min;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public static int findMinElement(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                }
            }
        }
        return min;
    }
    public static int findMaxElement(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
    public static double findArithmeticMean(int[][] matrix) {
        double sumOfElements = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                sumOfElements += ints[j];
            }
        }
        return sumOfElements / (matrix.length * matrix[0].length);
    }
    public static double findGeometricMean(int[][] matrix) {
        int productOfElements = 1;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                productOfElements *= ints[j];
            }
        }
        return Math.pow(productOfElements, 1.0 / (double) (matrix.length * matrix[0].length));
    }
}
