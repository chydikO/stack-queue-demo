package org.itstep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Practice {
    /*
    Черга з пріоритетами:
    Створіть клас, що реалізує чергу з пріоритетами. Кожен елемент черги повинен мати пріоритет, і при видачі
    елементів з черги вони повинні впорядковуватися за спаданням пріоритету.
     */

    public static void main(String[] args) {
        PriorityQueue<String> tasks = new PriorityQueue<>();
        tasks.enqueue("first task", 1);
        tasks.enqueue("second task", 3);
        tasks.enqueue("third task", 2);
        tasks.enqueue("highest priority task", 10);
//        for (String task : tasks) {
//            System.out.println(task);
//        }
        while (!tasks.isEmpty()) {
            System.out.println(tasks.dequeue());
        }
    }
}

class PriorityQueue<T> implements Iterable<T> {
    private record Item<T>(T data, int priority) {
    }

    private final LinkedList<Item<T>> queue = new LinkedList<>();

    public void enqueue(T value, int priority) {
        Item<T> newItem = new Item<>(value, priority);
        if (queue.isEmpty()) {
            queue.add(newItem);
            return;
        }
        int index = 0;
        for (Item<T> item : queue) {
            if (priority > item.priority) {
                break;
            }
            index++;
        }
        if (index >= queue.size()) {
            queue.add(newItem);
        } else {
            queue.add(index, newItem);
        }
    }

    public T peek() {
        return queue.peekFirst().data;
    }

    public T dequeue() {
        return queue.poll().data;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        List<T> datas = new ArrayList<>();
        for (Item<T> item: queue) {
            datas.add(item.data);
        }
        return datas.iterator();
    }
}
