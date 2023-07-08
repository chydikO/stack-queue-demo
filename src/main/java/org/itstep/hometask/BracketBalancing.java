package org.itstep.hometask;

import java.util.Stack;

public class BracketBalancing {
    public static void main(String[] args) {
        String sequence1 = "([])";
        String sequence2 = "[{]}";

        System.out.println("Послідовність 1: " + sequence1);
        System.out.println("Збалансована? " + isBalanced(sequence1));

        System.out.println("Послідовність 2: " + sequence2);
        System.out.println("Збалансована? " + isBalanced(sequence2));
    }

    public static boolean isBalanced(String sequence) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < sequence.length(); i++) {
            char current = sequence.charAt(i);

            if (isOpenBracket(current)) {
                stack.push(current);
            } else if (isCloseBracket(current)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();

                if (!isMatchingBracket(top, current)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpenBracket(char bracket) {
        return bracket == '(' || bracket == '[' || bracket == '{';
    }

    private static boolean isCloseBracket(char bracket) {
        return bracket == ')' || bracket == ']' || bracket == '}';
    }

    private static boolean isMatchingBracket(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
