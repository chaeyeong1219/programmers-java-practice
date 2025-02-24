class Solution {
    public String solution(String s, int n) {
        n = n % 26;
        
        StringBuilder result = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append((char)('A' + (ch - 'A' + n) % 26));
            }
            
            if (Character.isLowerCase(ch)) {
                result.append((char)('a' + (ch - 'a' + n) % 26));
            }
            
            if (ch == ' ') {
                result.append(' ');
            }
        }
        
        return result.toString();
    }
}