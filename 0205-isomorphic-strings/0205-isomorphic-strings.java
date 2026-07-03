class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int count=0;
        HashMap<Character,Character> map= new HashMap<>();
        HashMap<Character,Character> map1= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map1.put(t.charAt(i),s.charAt(i));
                map.put(s.charAt(i),t.charAt(i));

            }
        }
        
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==map.get(s.charAt(i)) && s.charAt(i)==map1.get(t.charAt(i))){
                count++;
            }
        }
        if(count==s.length()){
            return true;
        }else{
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna