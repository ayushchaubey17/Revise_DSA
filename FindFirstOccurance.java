public class FindFirstOccurance {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 5, 67, 7, 4, 5};
        System.out.println(withoutRecursion(arr,5)  );
    }

    public static int findUsingReccursion(int arr[], int key, int n) {
        if(n== arr.length) return -1;
        if (arr[n] == key) return n;
        return  findUsingReccursion(arr, key, n+1);
    }


    public static int withoutRecursion(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) if (arr[i]==key)return i;return -1;
    }
}
