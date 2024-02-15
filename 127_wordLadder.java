import java.util.*;
class Solution {

    public boolean checkInList( List<String> wordList, String word){
        for(int i = 0; i < wordList.size(); i++){
            if(word.equals(wordList.get(i)))
                return true;
        }
        return false;
    }



    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if(!checkInList(wordList, endWord))
            return 0;
        
        HashMap<String,List<String>> adj = new HashMap();
        wordList.add(beginWord);

        //create adjacency list
        for(var word : wordList){
            for(int j = 0; j < word.length(); j++){
                String pattern = word.substring(0,j) + "*" + word.substring(j+1);
                if(!adj.containsKey(pattern))
                    adj.put(pattern, new LinkedList<String>());
                List<String> list = adj.get(pattern);
                list.add(word);
            }
        }


        //BFS
        HashSet<String> set = new HashSet();
        Queue<String> q = new LinkedList<String>();
        q.add(beginWord);
        set.add(beginWord);
        int length = 1;

        while(q.size() != 0){
            int size = q.size();

            for(int i = 0; i < size; i++){
                String word = q.remove();
                if(word.equals(endWord) )
                    return length;
                for(int j = 0; j < word.length(); j++){
                    List<String> neighbors = adj.get(word.substring(0,j) + "*" + word.substring(j+1));
                    for(var neighbor : neighbors){
                        if(!set.contains(neighbor)){
                            q.add(neighbor);
                            set.add(word);
                        }
                    }
            }
            
            }


            length += 1;
        }

        return 0;

        

        
    }
}
