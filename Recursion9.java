public class Recursion9 {

    public static int tiling(int n) {

        //base
        if (n==0||n==1){
            return 1;
        }
        //verticalchoice
        int fnm1=tiling(n-1);

        //horizontalchoice

        int fnm2=tiling(n-2);

        int totalWays=fnm1+fnm2;
        return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(tiling(4));//5

    }
}
