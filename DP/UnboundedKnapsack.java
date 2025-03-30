package DP;

public class UnboundedKnapsack {
   public static void main(String[] args) {
        int[] wt = {2,4,6};
        int[] val = {5,11,13};
        int W = 10;
        System.out.println(unbounded(wt, val, W, wt.length-1));
    
   }
   
   static int unbounded(int[] wt, int[] val, int W, int ind) {
      if(ind==0) {
        return (W/wt[0])*val[0];
      }

      int notPick = unbounded(wt, val, W, ind-1);
      int pick = Integer.MIN_VALUE;
        if(wt[ind]<=W) {
            pick = val[ind] + unbounded(wt, val, W-wt[ind], ind);
        }
      
        return Math.max(notPick, pick);
   }
}
