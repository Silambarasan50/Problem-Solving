class Solution {
    public int countPalindromicSubsequence(String s) {
    Map<Character,int[]> map = new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
        char c = s.charAt(i);
        if(map.containsKey(c))
        map.get(c)[1]=i;
        else
        map.put(c,new int[]{i,i});
    }
    int c = 0;
    for(Map.Entry<Character,int[]> entry:map.entrySet())
    {
        int val[] = entry.getValue();
        Set<Character> set = new HashSet<>();
        for(int i=val[0]+1;i<val[1];i++)
        set.add(s.charAt(i));
        c+=set.size();
    } 
    return c;   
    }
}