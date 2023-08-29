import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mapts = new HashMap();
         HashMap<Character,Character> mapst = new HashMap();

        for(int i = 0; i < s.length(); i++){
            if(
            ((mapts.containsKey(t.charAt(i)) && mapts.get(t.charAt(i)) != s.charAt(i)) || 
            (mapst.containsKey(s.charAt(i)) && mapst.get(s.charAt(i)) != t.charAt(i))))
            return false;
            mapts.put(t.charAt(i), s.charAt(i));
            mapst.put(s.charAt(i), t.charAt(i));
        }

        return true;
    }
}
