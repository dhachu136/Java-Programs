
import java.util.*;
class Priority {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int k = 3;
        ArrayDeque<Integer> p = new ArrayDeque<>();
        for(int i = 0; i< k; i++){
            p.addFirst(arr[i]);
            }
                for(int i = k; i< arr.length; i++){
            p.addLast(arr[i]);
                }
        System.out.println(p);
    }
}
       
      