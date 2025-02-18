import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] sArr = String.valueOf(n).split("");
        Arrays.sort(sArr, Collections.reverseOrder());
    
        String sorted = String.join("", sArr);
        answer = Long.parseLong(sorted);
        return answer;
    }
}