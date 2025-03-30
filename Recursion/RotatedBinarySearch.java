package Recursion;

public class RotatedBinarySearch {
    public static int find(int arr[], int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Check if the left part is sorted
        if (arr[start] <= arr[mid]) {
            // Check if the target is within the sorted left part
            if (target >= arr[start] && target < arr[mid]) {
                return find(arr, target, start, mid - 1);
            } else {
                return find(arr, target, mid + 1, end);
            }
        }

        // If the left part isn't sorted, the right part must be sorted
        if (target > arr[mid] && target <= arr[end]) {
            return find(arr, target, mid + 1, end);
        }
        return find(arr, target, start, mid - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int result = find(arr, target, 0, arr.length - 1);
        System.out.println("Target found at index: " + result);
    }
}
