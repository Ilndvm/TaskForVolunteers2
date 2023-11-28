public class Task4 {
    public static void main(String[] args) {
        int n = 10233;
        String nStr = "";
        nStr+=n;
        char[] digit = nStr.toCharArray();

        System.out.println("The larges sibling in family of "+n+" is: " + convertArray(sortArray(digit)));
    }
    public static char[] sortArray(char[] digit){
        boolean stop = false;
        for(int i=1; i<digit.length && !stop; i++){
            stop = true;
            for (int j=0; j<digit.length-i; j++){
                if (digit[j]<digit[j+1]){
                    stop=false;
                    int temp = digit[j+1];
                    digit[j+1]=digit[j];
                    digit[j]=(char)temp;
                }
            }
        }
        return digit;
    }
    public static int convertArray(char[] digit){
        String numberStr = "";
        for (char i:digit) {
            numberStr+=i;
        }
        return Integer.parseInt(numberStr);
    }
}