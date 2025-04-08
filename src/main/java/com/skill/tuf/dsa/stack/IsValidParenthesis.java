package com.skill.tuf.dsa.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsValidParenthesis {

    public boolean isValid(String s) {

        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        Stack<Character> stack = new Stack<>();

        for(int i=0; i< s.length();i++){
            char curChar = s.charAt(i);
            if(curChar == '{' || curChar == '[' || curChar == '('){
                stack.push(map.get(curChar));
            }else{

                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if(top != curChar){
                    return false;
                }
            }
        }
        /*
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
        ̵*/
        return stack.isEmpty();
    }
}
