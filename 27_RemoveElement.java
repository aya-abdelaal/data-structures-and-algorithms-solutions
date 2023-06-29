class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int shamt = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                count++;
                if(shamt != 0)
                 nums[i - shamt] = nums[i];
            }
            else {
                shamt++;
            }
            
        }
        
        return count;
            
    }
}
