
public class problem20 {
    public static void main(String[] args) {
        int target = 5;
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        boolean found = searchMatrix(matrix, target);
        System.out.println(found);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            int val = matrix[row][col];
            if (val == target) {
                return true;
            } else if (val < target) {
                row++; 
            } else {
                col--;
            }
        }

        return false;
    }

}
