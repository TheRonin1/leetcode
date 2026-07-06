class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            int rightmax=0;
            int leftmax=0;
            left=i-1;
            right=i+1;
            while(left>=0){
                leftmax=leftmax+nums[left];
                left--;
            }
            while(right<nums.length){
                rightmax+=nums[right];
                right++;
            }
            if(leftmax==rightmax){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna