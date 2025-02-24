class Solution {
    public String solution(String s, int n) {
        n %= 26;     
        StringBuilder result = new StringBuilder(s.length());
        
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append((char) ((ch - 'A' + n) % 26 + 'A'));
            } else if (Character.isLowerCase(ch)) {
                result.append((char) ((ch - 'a' + n) % 26 + 'a'));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}