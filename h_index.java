class Solution {
    public int hIndex(int[] citations) {
        int[] frequencies = new int[citations.length + 1];

        for(int i = 0; i < citations.length; i++){
            if(citations[i] > citations.length)
                frequencies[citations.length]++;
            else 
                frequencies[citations[i]]++;
        }

        int pointer = citations.length;
        int value = frequencies[citations.length];

        while( pointer > value && --pointer >= 0){
            value+= frequencies[pointer];
        }

        return pointer;
    }
}
