package com.example.week2fridaytest;

import java.util.Arrays;

public class GenericArray<T> {
    private int i = 0;
    private Object obj[];
    private T t;

    public GenericArray() {
        obj = new Object[5];
    }

    public void add(T t) {
        this.t = t;
        if (i == obj.length - 1) {
            obj = Arrays.copyOf(obj, obj.length*2);
            System.out.println("Array length is now: " + obj.length);
        }
        obj[i] = this.t;
        i++;
    }

    public Object get(int i) {
        if (obj[i] != null) {
            return obj[i];
        } else {
            throw new ArrayIndexOutOfBoundsException("index:" + i);
        }
    }

    public String toString() {
        String temp = "";
        for (Object ob : obj) {
            if (ob != null) {
                temp = temp + ob + ',';
            }
        }
        String temp1 = temp.substring(0, temp.length() - 1);
        return "[" + temp1 + "]";
    }


}