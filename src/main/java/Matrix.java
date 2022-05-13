import java.util.ArrayList;

public class Matrix {
    public static ArrayList<Integer> indexOfRowsWithZeros(int[][] Matrix){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int row = 0; row < Matrix[0].length; row++) {
            boolean notZero = true;
            for (int i = 0; i < Matrix.length; i++) {
                if (Matrix[row][i] != 0) {
                    notZero = false;
                }
            }
            if (notZero){
                arrayList.add(row);
            }
        }
        return arrayList;
    }

    public static int sumOfNumbersDivisibleByFive (int[][] Matrix){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        for (int col = 0; col < Matrix.length; col++) {
            for (int i = 0; i < Matrix[col].length; i++) {
                if (Matrix[i][col] % 5 ==0) {
                    sum += Matrix[i][col];
                }
            }
        }
        return sum;
    }


}

