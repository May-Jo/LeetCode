class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = findpivot(nums);

        int a = oaBS(nums, 0, pivot, target);
        int b = oaBS(nums, pivot+1, nums.length-1, target);

        if(a!= -1){
            return true;
        }
        if(b!= -1){
            return true;
        }
        return false;
    }

    static int findpivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;


            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }

                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }

                end--;

            } 
            else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } 
            else {
                end = mid;
            }
        }

        return -1;
    }



    static int oaBS(int[] arr, int start, int end, int target){
            while(start<= end){
                int mid = start+(end-start)/2;
                if(target<arr[mid]){
                    end = mid-1;
                }
                else if(target>arr[mid]){
                    start=(mid+1);
                }
                else{
                    return mid;
                }
            }
            return -1;
    }
}