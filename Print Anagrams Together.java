
class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
    Map<String,ArrayList<String>> map = new HashMap<>();
    for(String i:arr)
    {
        char str[] = i.toCharArray();
        Arrays.sort(str);
        String s = new String(str);
        if(!map.containsKey(s))
        map.put(s,new ArrayList<>());
        map.get(s).add(i);
    }
    return new ArrayList<>(map.values());
    }
}

