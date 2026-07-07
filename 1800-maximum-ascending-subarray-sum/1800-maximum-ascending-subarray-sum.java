class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum=0;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }else{
                sum=nums[i];
                
            }
            

            maxsum=Math.max(sum,maxsum);
        }
        for(int s: nums){
            if(maxsum<s){
                maxsum=s;
            }
        }
        return maxsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna