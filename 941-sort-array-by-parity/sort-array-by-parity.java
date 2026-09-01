//Using linear search

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int start = 0;
        int back = n-1;
        for (int i=0; i<n; i++){
            if(nums[i]%2 == 0){
                arr[start]=nums[i];
                start++;
            }
            else{
                arr[back]= nums[i];
                back--;
            }
        }
        return arr;
    }
}