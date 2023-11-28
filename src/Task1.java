public class Task1 {
    public static void main(String[] args) {
        int n = 8;
        StringBuilder out = new StringBuilder();
        for (int i=0;i < n; i++){
            if (i%2==0){
                out.append("+");

            }
            else out.append("-");
        }
        System.out.println(out);
    }
}
