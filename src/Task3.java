public class Task3 {
    public static void main(String[] args) {
        int n =11;
        printArray(zeroArray(n));
    }
    public static int[] zeroArray(int n){
        int[] arr = new int[n];
        if (n%2 == 1) {
            arr[n-1]=0;
            n--;
        }
        for (int i=0; i<n/2; i++) {
            arr[i] = i+1;
            arr[n-1-i] = -(i+1);
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}