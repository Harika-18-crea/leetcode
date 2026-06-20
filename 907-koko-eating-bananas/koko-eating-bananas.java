class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        long total = 0;
        for (int num : piles) {
            total += num;
        }
        int start = (int)((total - 1) / h) + 1;
        int end = (int)((total - n) / (h - n + 1)) + 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int time = 0;
            for (int num : piles) {
                time += (num - 1) / mid + 1;
            }
            if (time > h) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}