package pl.sda.javastart.day10;

public class StackExample {
    private int size = 100;
    private int top = -1;

    private Object[] stackArr = new Object[size];

    public boolean isEmpty() {
        return stackArr == null || stackArr.length == 0 ? true : false;
    }
    public boolean push(Object o) {
        if (top >= (size - 1)) {
            System.out.println("Stack is Full");
            return false;
        }
        stackArr[++top] = o;
        System.out.println(o + " push into stack");
        return true;
    }
    public Object pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            Object x = stackArr[top--];
            return x;
        }
    }
    public void peek() {
        if (!isEmpty()) {
            System.out.println(stackArr[top]);
        } else {
            System.out.println("Stack is empty");
        }
    }
}
