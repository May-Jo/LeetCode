class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = n + 1;

        // best[i] = minimum length of a valid subarray
        // completely inside arr[0 ... i-1]
        int[] best = new int[n + 1];
        java.util.Arrays.fill(best, INF);

        int left = 0;
        int sum = 0;
        int ans = INF;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > target) {
                sum -= arr[left++];
            }

            // If we found a subarray [left ... right]
            if (sum == target) {
                int len = right - left + 1;

                // Previous non-overlapping subarray must end before left
                if (best[left] != INF) {
                    ans = Math.min(ans, len + best[left]);
                }

                // Update best for positions up to right
                best[right + 1] = Math.min(best[right], len);
            } else {
                best[right + 1] = best[right];
            }
        }

        return ans == INF ? -1 : ans;
    }
}