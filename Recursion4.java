public class Recursion4 {
    public static int fibbonacci(int n) {
        if (n==0||n==1){
            return 1;
        }
        int a=fibbonacci(n-1);
        int b=fibbonacci(n-2);
        int c=a+b;
        return c;

    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(fibbonacci(n));//34
    }
}
