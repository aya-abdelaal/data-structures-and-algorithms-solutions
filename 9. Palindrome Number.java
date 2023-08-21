class Solution {
    public boolean isPalindrome(int x) {
        String n = ((Integer)x).toString();

        int beg = 0;
        int end = n.length() -1;

        while(beg <= end){
            if(n.charAt(beg) != n.charAt(end))
                return false;
            beg++;
            end --;
        }

        return true;
    }
}
