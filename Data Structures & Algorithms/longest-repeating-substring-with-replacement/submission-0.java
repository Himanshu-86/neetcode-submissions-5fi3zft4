class Solution {
    public int characterReplacement(String s, int k) {

        int l = 0;
        int r = 0;
        int n = s.length();
        int arr = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < n){ 
            char chr = s.charAt(r);
            map.put(chr, map.getOrDefault(chr, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(chr));

            while ((r - l + 1) - maxFreq > k) {
                char chl = s.charAt(l);
                map.put(chl, map.get(chl) - 1);
                l++;
            }
            arr = Math.max(arr, r - l + 1);
            r++;
        }
        return arr;
    }
}

