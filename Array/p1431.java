import java.util.*;

public class p1431 {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,3};
        ArrayList<Boolean> res = new ArrayList<>();
        int ec = 3;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }    
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]+ec > max){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        // for (int i = 0; i < res.length; i++) {
        //     System.out.println(res[i]);
        // }
        System.out.println(res);
    }
}
