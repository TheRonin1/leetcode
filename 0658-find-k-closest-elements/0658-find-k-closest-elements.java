class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left =0;
        int end=arr.length-k;
        while(left<end){
            int mid =left+(end-left)/2;//sliding window use kar rahe hai ans sirf k size ka ho skata hai is liye. 
            if(x-arr[mid]>arr[mid+k]-x){// yeh condition first ele of one windwo and last ele of second windoe kyuki baki sare comonon hai dono mai.
                left=mid+1;
            }else{// agar false toh windoe ka start left se hoga.
                end=mid;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i < left + k; i++) {// last mai ans ko ek list mai add kar do
            ans.add(arr[i]);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna