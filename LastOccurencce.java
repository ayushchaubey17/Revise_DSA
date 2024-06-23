public class LastOccurencce {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6, 3, 5, 5, 4, 6, 6, 5};
        System.out.println(findLastOccurenceWithreccursion(arr, 3,0));
        System.out.println(recursion2(arr,3, arr.length-1));
    }

    public static int withoutRecursion(int arr[], int key) {
        int ind = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) ind=i;
        }
       return ind;

    }

    public static int findLastOccurenceWithreccursion(int arr[], int key, int i) {

        if (i== arr.length) return -1;


        int ageDekho = findLastOccurenceWithreccursion(arr,key,i+1);


        if (arr[i] == key && ageDekho == -1) {
            return i;
        }

        return ageDekho;
    }


    public static int recursion2(int arr[], int key, int i) {
        if(i== -1 ) return  -1;
        if(arr[i] == key) return i;
        return recursion2(arr, key, i - 1);
    }
}
