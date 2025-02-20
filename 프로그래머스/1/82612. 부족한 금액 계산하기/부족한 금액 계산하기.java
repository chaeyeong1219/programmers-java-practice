class Solution {
    public long solution(int price, int money, int count) {
        long pay = (long) price * count * (count + 1) / 2;

        if (money >= pay) {
            return 0;
        } 

        return pay - money;        
    
    }
}