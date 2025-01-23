class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int oLength = overwrite_string.length();
        int mLength = my_string.length();
        
        String oString = my_string.substring(0, s);
        String mString = my_string.substring((s + oLength), mLength);
        
        answer += oString + overwrite_string + mString;
        
        return answer;
    }
}