class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toUpperCase().toCharArray();
        
        int pCnt = 0;
        int yCnt = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'P')
                pCnt++;
            if (ch[i] == 'Y')
                yCnt++;
        }
        
        if (pCnt == yCnt)
            answer = true;
        else 
            answer = false;

        return answer;
    }
}