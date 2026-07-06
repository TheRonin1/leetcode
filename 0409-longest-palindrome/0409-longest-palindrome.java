class Solution {
    public int longestPalindrome(String s) {
      HashMap<Character,Integer> map = new  HashMap<>();
      if(ispalindrome(s)){
        return s.length();
      }

      for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
     } 
      boolean isodd=false;
      int count=0;
      for(int freq: map.values()){// jo map ke values hai usmai irratet karne ka aur jo bhi chara even usse add kar ans mai warna jo odd hai usmai -1 laga taki agar wo chara sirf 1 hai toh zero add ho ans mai aur ahra chara 3 hai toh 2 add hoga logic.
        if(freq%2==0){

            count+=freq;
        }else{
            count+=freq-1;
            isodd=true;
        }
      }
      if(isodd){
        count++;
      }
      return count;
    }
    boolean ispalindrome(String s){
        char[] arr = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna