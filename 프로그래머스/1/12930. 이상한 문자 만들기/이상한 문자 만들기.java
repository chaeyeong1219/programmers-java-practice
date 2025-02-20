class Solution {
    public String solution(String s) {
        String[] sArr1 = s.split(" ", -1); 
        String[] sArr2 = new String[sArr1.length]; 
        
        for (int i = 0; i < sArr1.length; i++) {
            char[] cArr = sArr1[i].toCharArray();
            for (int j = 0; j < cArr.length; j++) {
                if (j % 2 == 0) {
                    cArr[j] = Character.toUpperCase(cArr[j]);
                } else {
                    cArr[j] = Character.toLowerCase(cArr[j]);
                }
            }
            sArr2[i] = new String(cArr);
        }
        
        return String.join(" ", sArr2);
    }
}