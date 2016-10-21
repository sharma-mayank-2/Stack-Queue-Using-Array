package com.app;

/**
 * Here is my main class which calls Stack and Queue Class.
 */
public class Lesson1 {
    public static void main(String[] args){
        System.out.println("stack called");
        StackImpl stack = new StackImpl(5);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        stack.pop();
        stack.peek();

        System.out.println("queue called");
        QueueImpl queue = new QueueImpl(5);
        queue.push(30);
        queue.push(20);
        queue.push(10);
        queue.pop();
        queue.peek();
    }
}
