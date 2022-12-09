import java.util.*;

public class p2114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sentences = new String[n];
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sc.nextLine();
        }
        for(int i = 0; i < sentences.length; i++){
            System.out.println(sentences[i]);
        }
        sc.close();
    }

}
