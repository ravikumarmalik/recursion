public class Recursion2 {
    public static void Decrising(int n) {
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.println(n+" ");
        Decrising(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        Decrising(n);
    }
}

/*
10
9
8
7
6
5
4
3
2
1
 */
