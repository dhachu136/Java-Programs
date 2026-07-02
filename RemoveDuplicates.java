import java.util.HashSet;
public class RemoveDuplicate
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 2, 6};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println("Array after removing duplicates:");
        System.out.println(set);
    }
}