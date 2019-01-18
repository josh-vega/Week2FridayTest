package com.example.week2fridaytest;

import java.util.Stack;

public class Queue{
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    static void enQueue(int n){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        stack1.push(n);
        System.out.println(n + " has enter the queue.");

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    static void deQueue(){
        if(stack1.isEmpty()){
            System.out.println("Queue is Empty!");
        } else {
            System.out.println(stack1.peek() + " has left the queue.");
            stack1.pop();
        }
    }
}