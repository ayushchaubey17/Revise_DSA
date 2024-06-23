public class First {
    public static void main(String[] args) {
//       print(10);
usingRecursion(12);
    }




    public static void print(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i+" ");
        }
    }


    public static void usingRecursion(int n) {
        if (n==0 ) return;
        System.out.print(n + " ");
        usingRecursion(n-1);

    }
}