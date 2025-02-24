import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
      
        while (n > 0) {
            numbers.add(n % 3);
            n /= 3;
        }
        
        int answer = 0;
        int power = 1;
        
         for (int i = numbers.size() - 1; i >= 0; i--) {
            answer += numbers.get(i) * power;
            power *= 3;  
        }
        
        return answer;
    }
}