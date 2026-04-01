class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++){
            HashSet<Character> myint = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char temp = s.charAt(j);
                if (myint.contains(temp))
                    break;
                myint.add(temp);
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
        }
        
    }


