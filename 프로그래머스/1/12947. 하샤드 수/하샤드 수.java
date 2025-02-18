class Solution {
    public boolean solution(int x) {
        String[] sArr = Integer.toString(x).split("");
        
        int sum = 0;
        for (int i = 0; i < sArr.length; i++) {
            sum += Integer.parseInt(sArr[i]);
        }
        
        if (x % sum == 0)
            return true;
        else
            return false;
    }
}