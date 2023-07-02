import java.util.*;

class RandomizedSet {

    private HashSet<Integer> hs;
    private ArrayList<Integer> arr ;

    public RandomizedSet() {
        hs= new HashSet<Integer>();
        arr = new ArrayList<Integer>();
        
    }
    
    public boolean insert(int val) {
        arr.add(val);
        return hs.add(val);
    }
    
    public boolean remove(int val) {
        arr.remove((Object)(new Integer(val)));
        return hs.remove(val);
    }
    
    public int getRandom() {
        int index = (int)(Math.random() * (arr.size()));
        return arr.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
