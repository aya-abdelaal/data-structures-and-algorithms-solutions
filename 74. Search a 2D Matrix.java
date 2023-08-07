class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int right = matrix.length - 1;
        int left = 0;
        while(left <= right){
            int middle = left + (right - left)/2;
            int pivot = matrix[middle][0];
            if(target==pivot)
                return true;
            if(target < pivot)
                right = middle - 1;
            else{
                pivot = matrix[middle][matrix[0].length - 1];
                if(target == pivot)
                    return true;
                if(target > pivot)
                    left = middle + 1;
                else
                    return binarysearch(matrix[middle],target);
            }
        }
        return false;
    }

    public static boolean binarysearch(int arr[], int x){
         int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (arr[m] == x)
                return true;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // If we reach here, then element was
        // not present
        return false;
    }
}
