class Solution {
    public int[] minOperations(String boxes) {
    List<Integer> l = new ArrayList<>();
    int ans[] = new int[boxes.length()];
    for(int i=0;i<boxes.length();i++)
    if(boxes.charAt(i)=='1')
    l.add(i);
    int sum = 0;
    for(int i=0;i<boxes.length();i++)
    {
      sum=0;
      for(int ind:l)
      sum+=Math.abs(i-ind);
      ans[i]=sum;
    }  
    return ans; 
    }
}