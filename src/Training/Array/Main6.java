package Training.Array;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[][] arr= {{1, 2, 3},{4,5,6},{7,8,9}};

        int[] rowSum=new int[arr.length];
        int[] colSum=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int s=0;
            for (int j = 0; j < arr[i].length; j++) {
                s+=arr[i][j];
            }
            rowSum[i]=s;
        }

        for (int i = 0; i < arr.length; i++) {
            int s=0;
            for (int j = 0; j < arr[i].length; j++) {
                s+=arr[j][i];
            }
            colSum[i]=s;
        }

        System.out.println(Arrays.toString(rowSum));
        System.out.println(Arrays.toString(colSum));


    }
}
