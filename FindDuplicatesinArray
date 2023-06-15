import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(arr.get(i))) {
                return arr.get(i);
            } else {
                set.add(arr.get(i));
            }
        }
        return 0;
    }
}
