class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();



        for (int i = 0; i < strs.length; i++) {
            if (map.get(sortString(strs[i])) != null) {
                map.get(sortString(strs[i])).add(strs[i]);
            } else {
                List<String> set = new ArrayList<>();
                set.add(strs[i]);
                map.put(sortString(strs[i]), set);
            }
        }

        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

     public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
