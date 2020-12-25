import java.util.Arrays;

public class Solution455 {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {

            if (s == null || s.length == 0){
                return 0;
            }

            int result = 0;

            Arrays.sort(g);
            Arrays.sort(s);

            for (int i = 0, j = 0; i < g.length && j < s.length; i++, j++) {

                while (j < s.length && g[i] > s[j]) {
                    j++;
                }

                if (j < s.length){
                    result++;
                }
            }

            return result;
        }
    }
}
