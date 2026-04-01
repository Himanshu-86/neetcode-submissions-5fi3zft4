class Solution {

    String sortstring(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> myMap = new HashMap<>();
        for (String s : strs) {
            String key = sortstring(s);
            if (!myMap.containsKey(key)) {
                myMap.put(key, new ArrayList<>());
            }
            myMap.get(key).add(s);
        }

        return new ArrayList<>(myMap.values());
    }
}

