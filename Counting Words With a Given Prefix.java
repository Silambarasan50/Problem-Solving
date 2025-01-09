class Solution {
    public int prefixCount(String[] words, String pref) {
    int c = 0;
    for(String i:words)
    {
        if(i.indexOf(pref)==0)
        c++;
    } 
    return c;   
    }
}