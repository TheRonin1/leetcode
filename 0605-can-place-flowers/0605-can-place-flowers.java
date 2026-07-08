class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        if(n==0){
            return true;
        }
         if(flowerbed.length==1){
            if(flowerbed[0]==1){
                return false;
            }else{
                return true;
            }
         }
        

            for(int i=0;i<flowerbed.length;i++){

                if(i==0 && flowerbed[i]==0){
                    if(flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        count++;
                    }
                }
                if(i==flowerbed.length-1 && flowerbed[i]==0){
                    if(flowerbed[i-1]==0){
                        flowerbed[i]=1;
                        
                        count++;
                    }
                }
                else if(flowerbed[i]==0){
                    if(flowerbed[i+1]==0 && flowerbed[i-1]==0){
                        flowerbed[i]=1;
                        
                        count++;
                    }
                }

            }
    
        if(count>=n){
            return true;
        }else{
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna