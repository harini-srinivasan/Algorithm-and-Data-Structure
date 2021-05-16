class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = position(nums, target, 0, nums.length-1, true);
        if(left == -1) {
            return new int[]{-1,-1};
        }
        int right = position(nums, target, left, nums.length-1, false);
        return new int[]{left, right};
    }
    public int position(int[] nums, int target, int start, int end, boolean left) {
        int mid;
        while( start <= end) {
            mid = (start + end)/2;
            
            if (nums[mid] < target) {
                start = mid + 1;
                
            } else if(nums[mid] > target) {
                end = mid -1;
            } else if(left) { 
                if(mid > start && nums[mid-1] == target) {
                    end = mid -1;
                } else {
                    return mid;
                }    
                 
            } else { 
                if(mid <  end && nums[mid+1] == target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;   
    }
    
}
