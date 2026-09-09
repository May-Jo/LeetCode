class Solution {

    public int firstStableIndex(int[] nums, int k) {

        int maximum = 0;
        int minimum = 0;

        for (int i = 0; i<nums.length; i++) {

            maximum = max(0, i, nums);
            minimum = min(i, nums.length, nums);

            if (nums[maximum] - nums[minimum] <= k) {
                return i;
            }
        }

        return -1;
    }

    static int max(int start, int end, int[] array) {

        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = start; i < end; i++) {

            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return index;
    }

    static int min(int start, int end, int[] array) {

        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = start; i < end; i++) {

            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
}