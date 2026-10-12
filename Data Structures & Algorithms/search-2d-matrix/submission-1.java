class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int colum = 0;
        for (int[] ints : matrix) {
            if (target <= ints[col - 1] && Arrays.binarySearch(ints, target) >= 0)
                return true;
        }
        return false;
    }
}
