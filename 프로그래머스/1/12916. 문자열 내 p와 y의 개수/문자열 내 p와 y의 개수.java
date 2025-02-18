class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();
        int pCnt = 0;
        int yCnt = 0;
        
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'p' || ch[i] == 'P')
                pCnt++;
            if (ch[i] == 'y' || ch[i] == 'Y')
                yCnt++;
        }
        
        if (pCnt == yCnt)
            answer = true;
        else if (pCnt == 0 && yCnt == 0)
            answer = true;
        else 
            answer = false;

        return answer;
    }
}