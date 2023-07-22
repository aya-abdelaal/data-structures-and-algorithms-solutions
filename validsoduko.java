


import java.util.*;

class Solution {
public boolean isValidSudoku(char[][] arr) {
        HashSet[] columns = new HashSet[9];
        HashSet[] rows = new HashSet[9];
        HashSet[] boxes = new HashSet[9];

        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<Integer>();
            columns[i] = new HashSet<Integer>();
            boxes[i] = new HashSet<Integer>();
        }

        for(int i = 0; i < 9; i++ ){
            for(int j = 0; j < 9; j++){
                if(arr[i][j] != '.'){
                int num = Character.getNumericValue(arr[i][j]);
                if(rows[i].contains(num))
                    return false;
                else
                    rows[i].add(num);

                if(columns[j].contains(num))
                    return false;
                else
                    columns[j].add(num);
                
                int box = (3*(i/3)) + (j/3);

                if(boxes[box].contains(num))
                    return false;
                else
                    boxes[box].add(num);
            }}
        }

        return true;

    }
};
