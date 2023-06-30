class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 0;
        int count = 0;

        while(pointer < nums.length){
            int temp = nums[pointer];
            int freq = 0;

            while( pointer < nums.length && temp == nums[pointer]){
                pointer++;
                freq++;
            }
            
            if(freq > 2)
                freq = 2;
                
            for(int i = 0; i < freq; i++){
                nums[count] = temp;
                count++;
            }
        }

        System.gc();

        return count;


    }
}
