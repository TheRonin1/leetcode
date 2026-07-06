class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        String ans="";
        if(t.length()>s.length()){
            return ans;
        }
        
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int r=0;
        int l=0;
        int start=-1;
        int count=0;
        int minlen= Integer.MAX_VALUE;
        
        while(r<s.length()&& l<s.length()){
            if(!map.containsKey(s.charAt(r))){
                r++;
                continue;
            }
            if(map.get(s.charAt(r))>0){
                count++;
  
            }
            map.put(s.charAt(r),map.get(s.charAt(r))-1);
            while(count ==t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    start=l;
                }
                if(map.containsKey(s.charAt(l))){
                    map.put(s.charAt(l),map.get(s.charAt(l))+1);
                    if(map.get(s.charAt(l))>0){
                        count--;
                    }
                }
                l++;

            }
            r++;
        }
       if(minlen==Integer.MAX_VALUE){
        return "";
       }else{
         return s.substring(start,start+minlen);
       }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna