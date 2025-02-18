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
        /*
        1. x -> String으로 분리 
        2. 숫자로 바꿔서 더하기
        3. x에서 더한 거 나눠서 나머지 0이면 true 아니면 false 
        */

    }
}