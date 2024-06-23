public class Sum {
    public static void main(String[] args) {
    int sum =    findSumUsingRecursion(10);
        System.out.println(sum);
    }

    public static int findSum(int n) {
        int sum =0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }


    public static int findSumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n+findSumUsingRecursion(n-1);
    }
}
