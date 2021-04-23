import java.util.ArrayList;
import java.util.List;

public class Fuck {

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        dfs(matrix, 0, m - 1, 0, n - 1, res);
        return res;
    }

    private void dfs(int[][] matrix, int startRow, int endRow, int startCol, int endCol, List<Integer> res) {
        if (startRow > endRow || startCol > endCol) return;
        else {
            if (startRow == endRow && startCol == endCol) {
                res.add(matrix[startRow][startCol]);
            } else if (startRow < endRow && startCol == endCol) {
                for (int i = startRow; i <= endRow; i++) {
                    res.add(matrix[i][endCol]);
                }
            } else if (startRow == endRow) {
                for (int i = startCol; i <= endCol; i++) {
                    res.add(matrix[startRow][i]);
                }
            } else {
                for (int i = startCol; i < endCol; i++) {
                    res.add(matrix[startRow][i]);
                }
                for (int i = startRow; i < endRow; i++) {
                    res.add(matrix[i][endCol]);
                }
                for (int i = endCol; i > startCol; i--) {
                    res.add(matrix[endRow][i]);
                }
                for (int i = endRow; i > startRow; i--) {
                    res.add(matrix[i][startCol]);
                }
                dfs(matrix, startRow + 1, endRow - 1, startCol + 1, endCol - 1, res);
            }
        }
    }

    public static void main(String[] args) {
        Fuck f = new Fuck();
        int[][] test = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}};
        System.out.println(f.spiralOrder(test));
    }
}
