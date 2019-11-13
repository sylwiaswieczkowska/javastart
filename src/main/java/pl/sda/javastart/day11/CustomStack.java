package pl.sda.javastart.day11;

import java.util.EmptyStackException;

public class CustomStack<T> {
    private int size = 10;
    private int position = -1;//zawsze bedziemy inkrementować po psition++
    private Object[] container = new Object[size];

    public void push(T element) {
        if (element == null) {
            throw new RuntimeException();
        }
        position++;
        if (position > container.length - 1) {
            Object[] stackTab = new Object[container.length + size];
            for (int i = 0; i < container.length; i++) {
                stackTab[i] = container[i];
            }
            container = stackTab;
        }
        container[position] = element;
        System.out.println(position);
    }
    public T pop() {
        if (position == -1){
            throw new EmptyStackException();//przerywa działanie programu gdy stos jest pusty,
        }
        T element = (T) container[position];
        container[position] = null;
        position--;
        return element;
        }
    public T peek() {
        if (position == -1){
            throw new EmptyStackException();
    }
        return (T) container[position];
    }
    public boolean isEmpty() {
        return position == -1;
   }
}
