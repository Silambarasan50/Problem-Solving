class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i];
            }
        }
        int[] ans = new int[queries.length];
        int index = 0;
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            ans[index++] = prefix[end + 1] - prefix[start];
        }
        return ans;
    }
    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}