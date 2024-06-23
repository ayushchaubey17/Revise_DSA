public class Factorial
{
    public static void main(String[] args) {
        System.out.println(findFactorialUsingRecursion(5));
    }

    public static int findFactorial(int n) {
        if (n==1 || n==0) return 1;

        int ans =1;
        for (int i = 2; i <=n ; i++) {
            ans*=i;
        }
        return ans;
    }


    public static int findFactorialUsingRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * findFactorialUsingRecursion(n - 1);
    }
}
