/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

import java.util.*;

class Solution {
    public Node cloneGraph(Node node) {

        if(node==null)
            return null;

        Queue<Node> q = new LinkedList<>();
        HashMap<Node,Node>  visited = new HashMap<Node,Node>();

       Node resNode = new Node(node.val);
       visited.put(node,resNode);
       q.add(node);

       while(q.size() != 0){
           
           Node original = q.remove();
           Node copy = visited.get(original);

           for(var neighbor: original.neighbors){

               //add to copy
               if(visited.containsKey(neighbor)){
                   copy.neighbors.add(visited.get(neighbor));
               }else{

                   q.add(neighbor);

                   Node n = new Node(neighbor.val);
                   visited.put(neighbor,n);
                    copy.neighbors.add(n);
               }
           }


       }

       return resNode;
        
    }

    
}
