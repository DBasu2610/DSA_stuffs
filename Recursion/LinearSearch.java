package Recursion;

public class LinearSearch {
    public static int linearsearch(int[] arr, int key, int index) {
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == key) {
            return index;
        }
        return linearsearch(arr, key, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(linearsearch(arr, 5,0));
    }
}
