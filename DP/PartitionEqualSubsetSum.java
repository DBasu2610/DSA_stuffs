package DP;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int arr[] = {2,3,3,3,4,5};
        System.out.println(partition(arr, arr.length-1, 10));
        
    }

    static boolean partition(int[] arr,int index,int sum) {
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total+=arr[i];
        }
        if(total%2!=0) {
            return false;
        }

        sum = total/2;

        if(sum==0) {
            return true;
        }

        if(index==0) {
            return arr[index]==sum;
        }

        boolean notTake = partition(arr, index-1, sum);
        boolean take = false;
        if(sum>=arr[index]) {
            take = partition(arr, index-1, sum-arr[index]);
        }

        return take || notTake;
    }
}
