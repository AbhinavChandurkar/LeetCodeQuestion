import java.util.*;

public class p2011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =0;
        String[] operations = new String[n];
        for (int i = 0; i < n; i++) {
            operations[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {

           if(operations[i].equals("++X") || operations[i].equals("X++") ){
                x++;
           }
           else{
            x--;
           }
        }
        System.out.println(x);
        sc.close();
    }
}
