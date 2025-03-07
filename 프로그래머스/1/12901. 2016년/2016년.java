class Solution {
    public String solution(int a, int b) {
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED", };
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = 0;
        
        for (int i = 0; i < a - 1; i++) {
            total += months[i];
        }
        
        total += b;
        
        return week[total % 7];
        
    }
}