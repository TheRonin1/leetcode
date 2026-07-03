class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> temp = new HashMap<>();
        char[] ch= s.toCharArray();
        int res=-1;
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
            temp.put(ch[i],i);
        }
        for(int i=0;i<ch.length;i++){
            
            if(map.get(ch[i])==1){
                return temp.get(ch[i]);
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna