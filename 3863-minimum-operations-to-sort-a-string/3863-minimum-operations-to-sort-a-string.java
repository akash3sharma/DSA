import java.util.*;

class Solution {
    public int minOperations(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        if (s.equals(new String(arr))) return 0;

        int n = s.length();

        if (n == 2) return -1;

        char mn = arr[0];
        char mx = arr[n - 1];

        if (s.charAt(0) == mn || s.charAt(n - 1) == mx)
            return 1;

        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == mn || s.charAt(i) == mx)
                return 2;
        }

        return 3;
    }
}