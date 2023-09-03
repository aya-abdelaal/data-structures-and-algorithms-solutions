class Solution {

    private static char[][] arr = new char[][] {
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}
    };

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits.length()!=0)
            helper("", res,digits);
        return res;
        
    }

    public static void helper(String curr, List<String> res, String digits){
        if(digits.length()== 0){
            res.add(curr);
            return;
        }

        int digit = Integer.parseInt("" + digits.charAt(0));
        
        char[] letters = arr[digit - 2];
        
        for(int i = 0; i < letters.length; i++){
            helper(curr + letters[i], res, digits.substring(1));
        }
        
    }
}
