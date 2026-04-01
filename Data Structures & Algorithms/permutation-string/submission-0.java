class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int windowSize = s1.length();
        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            char c = s2.charAt(right);
            map2.put(c, map2.getOrDefault(c, 0) + 1);

            if (right - left + 1 > windowSize) {
                char removeChar = s2.charAt(left);
                map2.put(removeChar, map2.get(removeChar) - 1);

                if (map2.get(removeChar) == 0) {
                    map2.remove(removeChar);
                }
                left++;
            }

            if (map1.equals(map2)) {
                return true;
            }
        }

        return false;
    }
}

