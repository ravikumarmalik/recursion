public class Recursion6 {

    public static int firstOccurance(int[] arr, int key, int i) {
        if (i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstOccurance(arr,key,i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,2,3,4,5,4,4,6,7};
        System.out.println(firstOccurance(arr,7,0));//12
    }
}
