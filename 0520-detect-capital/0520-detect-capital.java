class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercase=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                uppercase++;
            }
        }
        if(uppercase==word.length() || uppercase==0 || (uppercase==1 && Character.isUpperCase(word.charAt(0)))){
            return true;
        }else{
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna