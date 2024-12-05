public class Matrices {
    public static void createRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void createRandomMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.random();
            }
        }
    }

    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int inte : row) {
                System.out.printf("%4d ", inte);
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (double[] row : matrix) {
            for (double doub : row) {
                System.out.printf("%.2f ", doub);
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        return (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length);
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        return (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length);
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] sub = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return sub;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] sub = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return sub;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] mul = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[i].length; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < matrix2.length; k++) {
                    mul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return mul;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] mul = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[i].length; j++) {
                mul[i][j] = 0.0;
                for (int k = 0; k < matrix2.length; k++) {
                    mul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return mul;
    }

    public static void main(String[] args) {
        // int[][] matrix1 = new int[3][4]; 
        // int[][] matrix2 = new int[3][4]; 

        double[][] matrix3 = new double[3][4];
        double[][] matrix4 = new double[3][4];

        // createRandomMatrix(matrix1);
        // createRandomMatrix(matrix2);
        createRandomMatrix(matrix3);
        createRandomMatrix(matrix4);

        System.out.println("Matrix 1: ");
        print(matrix3);
        System.out.println();
        System.out.println("Matrix 2: ");
        print(matrix4);
        System.out.println();

        if (haveSameDimension(matrix3, matrix4)) {
            System.out.println("Add matrix 1 to matrix 2: ");
            print(add(matrix3, matrix4));

            System.out.println();
            System.out.println("Subtract matrix 1 to matrix 2: ");
            print(subtract(matrix3, matrix4));

            System.out.println();
            System.out.println("Multiply matrix 1 and 2: ");
            print(multiply(matrix3, matrix4));
        }
    }
}