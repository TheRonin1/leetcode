class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int odd=Integer.MIN_VALUE;

        int even=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int freq: map.values()){
            if(freq%2==0){
                even =Math.min(even,freq);
            }else{
                odd= Math.max(odd,freq);
            }
        }
        return odd-even;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna