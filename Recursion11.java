public class Recursion11 {

    public static int friendsPairing(int n) {
        if (n==1||n==2){
            return n;
        }
        //choice
        //single
        int fnm1=friendsPairing(n-1);
        //pairs
        int fnm2=friendsPairing(n-2);
        int pairways=(n-1)*fnm2;

        //totalways
        int totways=fnm1+pairways;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));//4
    }
}
