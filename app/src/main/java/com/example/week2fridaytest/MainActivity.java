package com.example.week2fridaytest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MainActivity {

    public static void main(String[] args) {
        //Problem 1 Driver
        System.out.println("Problem 1");
        String string = "testerstring";
        LinkedList list = new LinkedList();
        for (int i = 0; i < string.length(); i++) {
            list = LinkedList.insert(list, string.charAt(i));
        }
        LinkedList.printList(list);
        LinkedList.delete(list, 's');
        LinkedList.printList(list);
        LinkedList.delete(list, 't');
        LinkedList.printList(list);
        LinkedList.delete(list, 'z');
        LinkedList.printList(list);
        System.out.println();

        //Problem 2 Driver
        System.out.println("Problem 2:");
        GenericArray<String> array = new GenericArray<String>();
        array.add("Cool");
        array.add("Cool");
        array.add("Cool");
        array.add("Cool");
        array.add("Cool");
        array.add("Cool");
        array.add("Cool");
        array.add("Cool");
        array.add("Cool");
        array.add("Cool");
        array.add("Cool");
        array.add("Cool");
        System.out.println();



        //Problem 3 Driver
        System.out.println("Problem 3");
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        System.out.println();

        //Problem 4 Driver
        System.out.println("Problem 4");
        System.out.println();
        System.out.println("BinaryTree Preorder Results: ");
        BinaryTree binaryTree = new BinaryTree();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(50, 32, 13, 65, 34, 22, 3, 76, 90));
        for (int i = 0; i < numbers.size(); i++) {
            binaryTree.add(numbers.get(i));
        }
        BinaryTree.printPreorder(binaryTree.root);
        System.out.println();
    }


}


