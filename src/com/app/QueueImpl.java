package com.app;

/**
 * Queue implementation using an Array.
 * Queue is FIFO.
 * 3 methods
 * push : to push a value
 * pop : is to remove a first value
 * peek : is to get the first value that is entered.
 */
public class QueueImpl {
    int size;
    int[] a;
    int pointer1;
    int pointer2;
    QueueImpl(int size){
        this.size = size;
        a = new int[size];
        this.pointer1 = -1;
        this.pointer2 = 0;
    }

    public void push(int data){
        if(pointer1 >= size){
            System.out.println("queue is full");
        }else{
            a[++pointer1]= data;
        }
    }

    public void pop(){
        if(pointer1 < 0){
            System.out.println("queue is empty");
        }else{
            System.out.println(a[pointer2++]);
        }
    }

    public void peek(){
        System.out.println(a[pointer2]);
    }
}
