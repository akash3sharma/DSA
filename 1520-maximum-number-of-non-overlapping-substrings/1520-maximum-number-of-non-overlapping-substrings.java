class Solution {
    public List<String> maxNumOfSubstrings(String s) {

        HashMap<Character, int[]> hp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!hp.containsKey(c)) {
                hp.put(c, new int[] { i, i });
            } else {
                hp.get(c)[1] = i;
            }
        }

        List<int[]> valid = new ArrayList<>();

        for (char c : hp.keySet()) {

            int start = hp.get(c)[0];
            int min = start;
            int max = hp.get(c)[1];

            boolean ok = true;

            int i = min;

            while (i <= max) {

                char cur = s.charAt(i);
                
                if (hp.get(cur)[0] < start) {
                    ok = false;
                    break;
                }

                max = Math.max(max, hp.get(cur)[1]);
                i++;
            }

            if (ok) {
                valid.add(new int[] { min, max });
            }
        }

        valid.sort((a, b) -> {
            if (a[1] != b[1])
                return a[1] - b[1];
            return a[0] - b[0];
        });

        List<String> ans = new ArrayList<>();

        int prevEnd = -1;

        for (int[] in : valid) {

            if (in[0] > prevEnd) {
                ans.add(s.substring(in[0], in[1] + 1));
                prevEnd = in[1];
            }
        }

        return ans;
    }
}