public class Task5 {
    public static void main(String[] args) {
        System.out.println(repFirstChar("test"));
    }
    public static String repFirstChar(String s){
        char c = s.charAt(0);

        if(String.valueOf(s.toUpperCase().charAt(0)).equals(String.valueOf(c))){
            return "upper";
        }
        else if(String.valueOf(s.toLowerCase().charAt(0)).equals(String.valueOf(c))){
            return "lower";
        }
        else if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
            return "digit";
        }
        else {
            return "other";
        }
    }
}