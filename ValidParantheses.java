mport java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            switch(curr){
                case '(':
                case '{':
                case '[':
                    stack.push(curr);
                    break;
                case ')': {if(stack.isEmpty()) return false;
                    char popped = (char)stack.pop();
                        if(popped != '(')
                            return false;
                        break;
                }
                case '}':{if(stack.isEmpty()) return false;
                    char popped = (char)stack.pop();
                        if(popped != '{')
                            return false;
                        break;
                }

                case ']':{
                    if(stack.isEmpty()) return false;
                    char popped = (char)stack.pop();
                        if(popped != '[')
                            return false;
                        break;
                }
                }
            }


            return stack.isEmpty();
        }
    }
