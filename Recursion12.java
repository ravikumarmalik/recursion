public class Recursion12 {

    public static void binaryStringWithoutConsecutiveOnes(int n,int lastPlace,String str) {
        if (n==0){
            System.out.println(str);
            return;
        }
        binaryStringWithoutConsecutiveOnes(n-1,0,str+"0");
        if (lastPlace==0){
            binaryStringWithoutConsecutiveOnes(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        binaryStringWithoutConsecutiveOnes(3,0, "");
    }
}

/*

000
001
010
100
101


 */
