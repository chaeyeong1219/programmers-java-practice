import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        Set<Integer> nset = new HashSet<>();
        
        for (int num : nums) {
            nset.add(num);
        }
        
        if (nset.size() <= nums.length / 2) 
            return nset.size(); 
        
        return nums.length / 2;
    }
}