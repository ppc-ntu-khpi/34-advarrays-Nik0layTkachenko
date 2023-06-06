public class MatrixTest {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Matrix matrixObj = new Matrix(matrix);
        int sum = matrixObj.sumOfElements();
        System.out.println("Сума елементів матриці: " + sum);
    }
}
