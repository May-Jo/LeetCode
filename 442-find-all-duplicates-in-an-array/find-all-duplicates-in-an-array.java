class Solution {
    public List<Integer> findDuplicates(int[] nums) {


        int numss[] = new int[nums.length];
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i =0;i<nums.length;i++) {
            numss[nums[i]-1]++;
        }

        for(int i =0;i<numss.length;i++) {
            if(numss[i]>1) {
                ans.add(i+1);
            }
        }

        return ans;
        
    }
}