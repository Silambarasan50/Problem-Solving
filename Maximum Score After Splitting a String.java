class Solution {
    public int maxScore(String s) {
    int oc = 0;
    int zc = 0;
    int ans = 0;
    int curr = 0;
    for(char i:s.toCharArray())
    {
      if(i=='1')
      oc++;
    }
    for(int i=0;i<s.length()-1;i++)
    {
      if(s.charAt(i)=='0')
      zc++;
      else
      curr++;
      ans = Math.max((zc+(oc-curr)),ans);
    }  
    return ans;
    }
}
