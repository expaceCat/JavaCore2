package main.java.com.mikhail.javacore.chapter07;

public class Stack {
    private int[] stck;
    private int tos;

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if(tos == stck.length - 1) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if(tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class TestStack {
    public static void main(String[] args) {


        Stack stack1 = new Stack(5);
        Stack stack2 = new Stack(8);

        for (int i = 0; i < 5; i++) stack1.push(i);
        for (int i = 0; i < 8; i++) stack2.push(i);

        System.out.println("Stack in stack1:");
        for(int i = 0; i < 5; i++) {
            System.out.println(stack1.pop());
        }

        System.out.println("Stack in stack2:");
        for (int i = 0; i < 8; i++) {
            System.out.println(stack2.pop());
        }
    }
}
