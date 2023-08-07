import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int pointer = 0;
        int start = 0;
        HashMap<Character,Integer> seen = new HashMap();
        int max = 0;

        while(pointer < s.length()){
            if(seen.containsKey(s.charAt(pointer))){
                max = Math.max(max, pointer - start );
                int n = seen.get(s.charAt(pointer));
                while(start <=  n){
                    seen.remove(s.charAt(start));
                    start++;
                }
            }
            seen.put(s.charAt(pointer), pointer);
            pointer++;
        }

        max = Math.max(max, pointer - start);
        return max;

            }
}
