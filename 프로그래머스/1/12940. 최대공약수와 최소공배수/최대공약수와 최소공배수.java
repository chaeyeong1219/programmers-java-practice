class Solution {
    public int[] solution(int n, int m) { 
        int a = Math.max(n,m);
        int b = Math.min(n,m);
        int multi = a * b;
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int[] answer = new int[2];
        answer[0] = a;
        answer[1] = multi / a;
        
        return answer;
    }
}