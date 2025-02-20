class Solution {
    public int solution(String t, String p) {
        String[] arr1 = t.split(""); 
        int len = arr1.length - p.length() + 1; 
        String[] arr2 = new String[len]; 
        
        for (int i = 0; i < len; i++) { 
            arr2[i] = t.substring(i, i + p.length()); 
        }
        
        int cnt = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (Long.parseLong(arr2[i]) <= Long.parseLong(p))  {
                cnt++;
            }
        }
        
        return cnt;
    }
}