class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        
        int[] result = new int[arr.length - 1];
            
        int j = 0;
        for (int i : arr) {
            if (i != min) {
                result[j++] = i;
            }
        }        
        return result;
    }
}