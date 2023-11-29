public class Task2 {
    public static void main(String[] args) {
        System.out.println("The sum of array is: " + calcSumArray(new int[]{1,1,2,3,4}));
    }
    public static int calcSumArray(int[] arr){
       int result = 0;
        for (int j : arr) {
            result += j;
        }
       return result;
    }
}
