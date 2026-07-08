class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxlen=0;
        int ass=1;
        int des=1;
        int max=0;
        if(nums.length==1){
            return 1;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                ass++;
                des=1;
                
            }else if(nums[i]<nums[i-1]){
                des++;
                ass=1;
                
            }else{
                ass=1;
                des=1;
            }
            
            
            maxlen= Math.max(maxlen,Math.max(ass,des));
            
        }
            
        return maxlen;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna