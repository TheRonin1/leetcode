class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> set = new HashSet<>();
       int i=0;
       int j=0;
       int max=0;
       char[] ch= s.toCharArray();
       while(j<ch.length){
            if(!set.contains(ch[j])){
                set.add(ch[j]);
                max= Math.max(max,j-i+1);
                j++;
            }else{
                set.remove(ch[i]);
                i++;
            }

       }
       return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna