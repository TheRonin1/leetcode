class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[i].contains(words[j])){
                    if(words[i]==words[j]){
                        continue;
                    }
                    if(!list.contains(words[j])){
                        list.add(words[j]);
                    }
                }
            }
        }
         return list;
    }
   
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna