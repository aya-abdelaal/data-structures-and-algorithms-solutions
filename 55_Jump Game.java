import java.util.*;

class Solution {
    public boolean canJump(int[] nums) {

        if(nums.length == 1)
            return true;

       boolean[] arr = new boolean[nums.length];
       arr[0] = true;

    
        for(int i = 0; i < arr.length; i++){
            if(arr[i]){
                if(nums[i] == 0)
                    arr[i] = false;
                else{
                    if(i + nums[i] >= nums.length - 1)
                        return true;
                    else{
                        arr[i] = false;
                        for(int j = 1; j <= nums[i] ;j++)
                            arr[i+j] = true;
                        }
                    }
               }
       }

        return false;
        
    }
}
