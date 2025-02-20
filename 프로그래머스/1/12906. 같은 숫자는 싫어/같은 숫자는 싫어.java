import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> li = new ArrayList<>();
        
         for (int num : arr) {
            if (li.isEmpty() || li.get(li.size() - 1) != num) {
                li.add(num);
            }
        }

        int[] answer = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            answer[i] = li.get(i);
        }
        
        return answer;
    }
}