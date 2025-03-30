package DP;

public class MinimumCosttoCutTheStick {
    public static void main(String[] args) {
        int cuts[] = {1,3,4,5};
        System.out.println(minCost(7, cuts, 0, cuts.length-1));
        
    }


    static int minCost(int n, int[] cuts,int i, int j) {
        if(i==j) {
            return 0;
        }

        int mini = (int)1e9;
        for(int k=i;k<=j;k++) {
            int cost = cuts[j+1]-cuts[i-1] + minCost(n, cuts, i, k-1) + minCost(n, cuts, k+1, j);
            mini = Math.min(mini, cost);
        }
        return mini;
    }
}
