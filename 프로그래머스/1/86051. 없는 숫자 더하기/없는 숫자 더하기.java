class Solution {
    public int solution(int[] numbers) {
        
        int nums = 0;
        for (int n : numbers) {
            nums += n;
        }
        
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            sum += i;
        }
        
        return sum - nums;
    }
}