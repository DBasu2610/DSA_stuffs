package DP;

public class SubsetSumEqualToTarget {
    public static void main(String[] args) {
        int arr[] = {2,3,7,8,10};
        int target = 11;
        System.out.println(targetPresent(arr, arr.length-1, target));;
    }

    static boolean targetPresent(int[] arr, int index, int target) {
         if(target==0) {
            return true;
         }

         if(index==0) {
            return arr[index]==target;
        }

        boolean noTake = targetPresent(arr, index-1, target);
        boolean take = false;
        if(target>=arr[index]) {
            take = targetPresent(arr, index-1, target-arr[index]);
        }

        return noTake || take;
    }
}
