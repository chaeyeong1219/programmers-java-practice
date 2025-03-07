import java.util.*;
import static java.util.Collections.reverseOrder;

class Solution {
    public int solution(int k, int m, int[] score) {
        List<Integer> list = new ArrayList<>();
        for (int i : score) {
            list.add(i);
        }
        list.sort(reverseOrder());  

        int[][] boxes = new int[score.length/m][m]; 

        int idx = 0;
        int sum = 0;
        for (int i = 0; i < boxes.length; i++) {
            for (int j = 0; j < boxes[i].length; j++) {
                boxes[i][j] = list.get(idx++);
            }

            sum += boxes[i][m-1] * m;
        }
      
        return sum;
    }
}