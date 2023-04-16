public class Recursion1 {
    public static int increasingOrder(int n) {

        if (n == 0) {
            return n;
        }

        increasingOrder(n - 1);
        System.out.println(n);
        return n;
    }

    public static void main(String[] args) {
        int n = 10;
        increasingOrder(n);

    }
}

/*

1
2
3
4
5
6
7
8
9
10


recursion is the method of solving computational problem
where the solution depends on solution to smaller instance of the same problem.

 */
