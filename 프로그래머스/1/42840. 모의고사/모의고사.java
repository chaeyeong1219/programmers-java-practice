import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {            
        int[] spj1 = {1, 2, 3, 4, 5};
        int[] spj2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] spj3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3 = new LinkedList<>();

        for (int i : spj1) {
            q1.add(i);
        }
        for (int i : spj2) {
            q2.add(i);
        }
        for (int i : spj3) {
            q3.add(i);
        }

        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (q1.peek() == answers[i]) cnt1++;
            q1.offer(q1.poll());

            if (q2.peek() == answers[i]) cnt2++;
            q2.offer(q2.poll());

            if (q3.peek() == answers[i]) cnt3++;
            q3.offer(q3.poll());

        }
        
        List<Integer> result = new ArrayList<>();
        int best = Math.max(cnt1, Math.max(cnt2, Math.max(cnt3, cnt3)));
        if (best == cnt1) result.add(1);
        if (best == cnt2) result.add(2);
        if (best == cnt3) result.add(3);
        
        return result;
        
    }
}