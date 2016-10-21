package com.app;

/**
 * Stack implementation using an Array.
 * Stack is LIFO or FILO. here i implemented LIFO.
 * 3 methods
 * push : to push a value
 * pop : is to remove a last value
 * peek : is to get the last value that is entered.
 */
public class StackImpl {
    int size;
    int[] a;
    int pointer;
    StackImpl(int size){
        this.size = size;
        a = new int[size];
        this.pointer = -1;
    }

    public void push(int data){
        if(pointer >= size){
            System.out.println("stack is full");
        }else{
            a[++pointer] = data;
        }
    }

    public void pop(){
        if(pointer < 0){
            System.out.println("stack is empty");
        }else{
            System.out.println(a[pointer--]);
        }
    }

    public void peek(){
        System.out.println(a[pointer]);
    }
}
