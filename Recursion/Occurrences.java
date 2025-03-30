package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Occurrences {

    static List<Integer> list = new ArrayList<>();
    static List<Integer> findAllOcuurences(int arr[], int key, int index) {
          if(index == arr.length) {
            return list;
          }

          if(arr[index] == key) {
              list.add(index);
          }
         return findAllOcuurences(arr, key, index+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5};
        System.out.println(findAllOcuurences(arr, 5, 0));
    }
}
