class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, pos = 0;
        while( i < m && j < n){
            if(nums1[pos] < nums2[j]){
                i++;
                pos++;
            }
            else{
               for(int k = pos + (m - i); k > pos; k--){
                    nums1[k] = nums1[k -1];
               }
               nums1[pos] = nums2[j];
               j++;
               pos++;

            }
        }

        if(j != n){
            while(j < n){
                nums1[pos] = nums2[j];
                j++;
                pos++;
            }
        }
    }
}
