package Recursion;

public class linear {
    public static void main(String[] args) {
        int[] arr = {3,7,2,9,8,5,4,10};
        boolean found = linearsearch(arr, 0, 5);
        System.out.println(found);
    }
    public static boolean linearsearch(int[] arr,int i,int target) {
        if (i == arr.length) {
            return false;
        }
        if (arr[i] == target) {
            return true;
        }
        return linearsearch(arr, i + 1, target);
    }
}
