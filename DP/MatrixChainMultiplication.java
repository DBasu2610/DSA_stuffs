package DP;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(minOp(arr, 1, n-1,dp));
        
    }

    static int minOp(int arr[], int i, int j,int[][] dp) {
        if(i==j) {
            return 0;
        }

        if(dp[i][j]!=-1) {
            return dp[i][j];
        }

        int mini = (int)1e9;

        for(int k=i;k<j;k++) {
            int step = arr[i-1]*arr[k]*arr[j] + minOp(arr, i,k,dp) + minOp(arr, k+1,j,dp);
            if(step<mini) {
                mini = step;
            }
        }

        return dp[i][j]=mini;
    }
}
