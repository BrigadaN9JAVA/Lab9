package lab9.task3;

import java.util.Stack;

public class StackReverser implements ReverserString{

    @Override
    public String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for (Character character : str.toCharArray()) {
            stack.add(character);
        }
        while(!stack.isEmpty()){
            result = result + stack.pop();
        }
        return result;
    }
}
