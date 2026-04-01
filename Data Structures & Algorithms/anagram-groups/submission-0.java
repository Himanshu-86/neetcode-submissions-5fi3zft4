class Solution {
    boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){ 
            return false;}
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        int l = strs.length;
        int[] arr = new int[l];
        List<List<String>> result = new ArrayList<>();

        for(int i = 0; i<l; i++){
            if(arr[i]==0){
                List<String> Group = new ArrayList<>();
                Group.add(strs[i]);
                arr[i]=1;
                for(int j=0; j<l; j++){
                    if(arr[j]==0){
                        if (isAnagram(strs[i], strs[j])){
                            Group.add(strs[j]);
                            arr[j]=1;
                        }
                    }


                }
                result.add(Group);
            }
        }
    return result;  
    }
    
}


