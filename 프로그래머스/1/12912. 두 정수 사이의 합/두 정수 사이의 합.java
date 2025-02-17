class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int start = 0;
        int num = 0;
        
        if (a > b) {
            start = b;
            num = a - b;
        }
        else {
            start = a;
            num = b - a;
        }
        
        for (int i = 0; i < (num + 1); i++) {
            if (a == b) {
                answer = a;
                break;
            }
            answer += start + i;
        }
        
        return answer;
    }
}