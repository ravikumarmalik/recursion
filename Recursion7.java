public class Recursion7 {

    public static int lastOccurance(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,4,2,4,22,2,2,2,2,2,2};
        System.out.println(lastOccurance(arr, 2, 0));//15
    }
}
