class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
    int k=0;
    
    int[] ans = new int[num1.length];
    for(int i=0;i<num1.length;i++){
        int great=0;
        for(int j=0;j<num2.length;j++){
            if(num1[i]==num2[j]){
                k=j+1;
                if(k>=num2.length){
                    great=-1;
                }
                while(k<num2.length){
                    if(num2[k]>num1[i]){
                        great=num2[k];
                    
                        break;
                    }else{
                        k++;
                        great=-1;
                    }
                }
                

            }
        }
        ans[i]=great;
    }
    return ans;    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna