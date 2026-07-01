class Solution {
    public String convert(String s, int numRows) {
       StringBuilder[] row = new StringBuilder[numRows];
       if(numRows==1 || numRows>=s.length()){

        return s;
       }
       for( int i =0;i<numRows;i++){
            row[i]= new StringBuilder();
       }
       int current =0;
       boolean goingdown =false;
       char[] ch = s.toCharArray();
       for(int i=0;i<ch.length;i++){
        
        row[current].append(ch[i]);
        if(current == 0){
            goingdown = true;
        }else if(current == numRows-1){
            goingdown = false;
        }
        if(goingdown){
            current++;
        }else{
            current--;
        }
       }
       StringBuilder ans = new StringBuilder();
       for (int i =0;i<row.length;i++){
            ans.append(row[i]);
       }
       return ans.toString();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna