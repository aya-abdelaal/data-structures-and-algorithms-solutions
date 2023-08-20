import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if (s == null || words == null || s.length() == 0 || words.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String,Integer> all = new HashMap<String,Integer>();
        HashMap<String,Integer> curr = new HashMap<String,Integer>();

        int n = words[0].length();
        int length = n * words.length;

        List<Integer> res = new ArrayList();
        int beg = 0; 
        int pointer = 0;

        for(int i = 0; i < words.length; i++){
            all.put(words[i], all.getOrDefault(words[i], 0) + 1);
        }

        while(beg < s.length() - length + 1){
            pointer = beg;
            curr.clear();
            while(pointer < beg + length){
                String word = s.substring(pointer, pointer + n);
                curr.put(word, curr.getOrDefault(word, 0) + 1);
                pointer+=n;
            }

            if(all.equals(curr))
                res.add(beg);
            
            beg++;
        }

        return res;
    }
}
