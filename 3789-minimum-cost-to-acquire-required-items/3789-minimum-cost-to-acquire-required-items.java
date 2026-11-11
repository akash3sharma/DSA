class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long single = (long) cost1 * need1 + (long) cost2 * need2;

        long both = (long) costBoth * Math.max(need1, need2);

        long n1 = (long) costBoth * need1 + (long) cost2 * Math.max(0 , (need2 - need1));

        long n2 = (long) costBoth * need2 + (long) cost1 * Math.max(0 , (need1 - need2));

        return Math.min(single, Math.min(both, Math.min(n1, n2)));
    }
}