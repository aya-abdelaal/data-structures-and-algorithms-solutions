class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i>= 0; i--){
            digits[i] +=1;
            if(digits[i] > 9 && i != 0){
                digits[i] = 0;
            }
            else
                break;
        }

        if(digits[0] > 9){
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            arr[1] = 0;
            for(int i = 1; i < digits.length; i++)
                arr[i+1] = digits[i];
            return arr;
        }else
            return digits;
    }
}
