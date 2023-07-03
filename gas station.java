class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int sumGas = 0;
        int start = 0;
        int sumCost = 0;

       int[] net = new int[gas.length];
       for(int i =0; i < gas.length; i++){
           sumCost += cost[i];
           sumGas += gas[i];
           net[i] = gas[i] - cost[i];
       }

       if(sumCost > sumGas)
        return -1;

       sumGas = 0;

        for(int i =0; i < gas.length; i++){
           sumGas += net[i];
             if(sumGas < 0){
               start = i+1;
               sumGas = 0;
           }
         
       }

       
    return start;

       

        
    }
}
