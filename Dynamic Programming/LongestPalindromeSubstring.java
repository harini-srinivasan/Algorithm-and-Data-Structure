class Solution {
    public String longestPalindrome(String s) {
        boolean[][] memo ;
        int len = s.length();
        
        int maxLen = 0;
        String res = "";
        memo = new boolean[len][len];
        
        for (int left = len -1; left >= 0; left--){ // notice this goes backwards
            for (int right = left; right < len; right++){
                
             if (s.charAt(left) == s.charAt(right)){
                 
                if (right - left <=2){
                    memo[left][right] = true;
                } else{
                    memo[left][right] = memo[left + 1][right - 1]; 
                }
             }
    
            if (memo[left][right]  && maxLen < right - left + 1) {
                maxLen = right - left + 1;
                res = s.substring(left, right + 1);
                }
            }   
            
        }
        
        return res;
    }
}