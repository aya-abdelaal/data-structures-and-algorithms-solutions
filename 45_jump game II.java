import java.util.*;
class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1)
            return 0;


        int jumps = 0;

        int left =0, right = 0;

        

        while(right < nums.length - 1){
            int farthestJump = 0;
            for(int i = left; i <= right; i++){
                farthestJump = Math.max(farthestJump, i + nums[i]);
            }

            left = right + 1;
            right = farthestJump;

            jumps++;
            
        }
        
        return jumps;
        
    }
}
