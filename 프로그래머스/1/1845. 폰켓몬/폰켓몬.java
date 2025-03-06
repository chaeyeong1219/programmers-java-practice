import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        
        Set<Integer> nset = new HashSet<>();
        
        for (int num : nums) {
            nset.add(num);
        }
        
        return nset.size() <= nums.length / 2 ? nset.size() : nums.length / 2;
        
    }
}