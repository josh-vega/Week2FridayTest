package com.example.week2fridaytest;

public class LinkedList {
    Node head;

    static class Node {
        char value;
        Node next;

        Node(char c) {
            value = c;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, char c) {
        Node newNode = new Node(c);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node end = list.head;
            while (end.next != null) {
                end = end.next;
            }
            end.next = newNode;
        }
        return list;
    }

    public static void printList(LinkedList list) {
        Node current = list.head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println();
    }

    public static LinkedList delete(LinkedList list, char c) {
        Node current = list.head;
        Node prevous = null;

        if (current != null && current.value == c) {
            list.head = current.next;
            System.out.println(c + " was deleted.");
            return list;
        }

        while (current != null && current.value != c) {
            prevous = current;
            current = current.next;
        }

        if (current != null) {
            prevous.next = current.next;
            System.out.println(c + " was deleted.");
        }

        if (current == null) {
            System.out.println(c + " was not found.");
        }
        return list;
    }
}