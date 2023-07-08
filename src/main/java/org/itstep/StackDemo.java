package org.itstep;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // LIFO - Last In, First Out
        // Останній прийшов - перший вийшов
        
        // Vector, Stack, HashTable - застарілі класи
        // замість них краще застосовувати ArrayList/LinkedList, ArrayDeque, HashMap
        
        /*
        Stack<String> stack = new Stack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        System.out.println(stack);
        System.out.println("peek: " + stack.peek());
        while (!stack.empty()) {
            System.out.println(stack.pop() + " size: " + stack.size());
        } */
        System.out.println("-= linked list =-");
        LinkedList<String> listAsStack = new LinkedList<>();
        listAsStack.push("one");
        listAsStack.push("two");
        listAsStack.push("three");
        System.out.println(listAsStack);
        System.out.println("peek: " + listAsStack.peek());
        while (listAsStack.size() > 0) {
            System.out.println(listAsStack.pop() + " size: " + listAsStack.size());
        }
        System.out.println("-= deque =-");
        ArrayDeque<String> deque = new ArrayDeque<>(); // deque - double equal queue
        // as stack
        deque.push("one");
        deque.push("two");
        deque.push("three");
        System.out.println(deque);
        System.out.println("peek: " + deque.peek());
        while (deque.size() > 0) {
            System.out.println(deque.pop() + " size: " + deque.size());
        }

        System.out.println("* Queue *");
        // FIFO - First In, First Out
        // Перший прийшов - перший вийшов
        LinkedList<String> listAsQueue = new LinkedList<>();
        listAsQueue.addLast("first");
        listAsQueue.addLast("second");
        listAsQueue.add("third");
        while (!listAsQueue.isEmpty()) {
            System.out.println(listAsQueue.poll());
        }

        //
        System.out.println("-= Deque =-");
        deque.add("first");
        deque.add("second");
        deque.add("third");
        while (!deque.isEmpty()) {
            System.out.println(deque.poll());
        }

    }
}
