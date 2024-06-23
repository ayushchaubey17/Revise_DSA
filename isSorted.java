public class isSorted {
    public static void main(String[] args) {
        int arr[] = {1 ,2, 3, 4, 6};
        System.out.println(isSortedUsingLoop(arr));
    }

    public static boolean isSorted(int arr[],int i) {

        if (i== arr.length-1) return true;
        if (arr[i]>arr[i+1]) return false;
        return isSorted(arr, i + 1);
    }


    public static boolean isSortedUsingLoop(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++)  if (arr[i]>arr[i+1]) return false; return true;
    }
}
