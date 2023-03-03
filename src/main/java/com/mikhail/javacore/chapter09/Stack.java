package main.java.com.mikhail.javacore.chapter09;

public class Stack implements IntStack{
        private int[] stck;
        private int tos;

        Stack(int size) {
            stck = new int[size];
            tos = -1;
        }

        public void push(int item) {
            if(tos == stck.length - 1) {
                System.out.println("Stack is full");
            } else {
                stck[++tos] = item;
            }
        }

        public int pop() {
            if(tos < 0) {
                System.out.println("Stack is empty");
                return 0;
            } else {
                return stck[tos--];
            }
        }
}

class IFTest {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);
        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}

class DynStack implements IntStack {
    private int[] stck;
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if(tos==stck.length-1) {
            int[] temp = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++tos] = item;

        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if(tos < 0) {
            System.out.println("Stack is  not load");
        return 0;
        } else {
            return stck[tos--];
        }
    }
}

class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);

        for (int i = 0; i < 12; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            mystack2.push(i);
        }
        System.out.println("Stack in mystack1");
        for (int i = 0; i < 12; i++) {
            System.out.println(mystack1.pop());
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(mystack2.pop());
        }
    }
}