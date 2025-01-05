class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1]; 
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int dir = shift[2];
            int shiftValue = dir == 0 ? -1 : 1; 
            diff[start] += shiftValue;
            if (end + 1 < n) {
                diff[end + 1] -= shiftValue;
            }
        }
        int[] cumulativeShifts = new int[n];
        int totalShift = 0;
        for (int i = 0; i < n; i++) {
            totalShift += diff[i];
            cumulativeShifts[i] = totalShift;
        }
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            char c = sb.charAt(i);
            int newCharIndex = (c - 'a' + cumulativeShifts[i] % 26 + 26) % 26;
            sb.setCharAt(i, (char) ('a' + newCharIndex));
        }
        return sb.toString();
    }
}
