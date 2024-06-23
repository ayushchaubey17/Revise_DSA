public class Fabomaccic {
    public static void main(String[] args) {
        System.out.println(calFab(7));
    }

    public static int calFab(int n) {
        if(n==1) return 0;
        if (n==2) return 1;
        return calFab(n-1)+calFab(n-2);
    }
}
