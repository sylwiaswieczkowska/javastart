package pl.sda.javastart.day11;

public class CustomList<X> {
    private final int pool = 10;
    private Object[] handler = new Object[pool];
    private int position = 0;

    public int add(X element) {
        handler[position] = element;
//        position = position + 1;
        int p = position;
        position = position + 1;
        if (handler.length - 1 < position) {
            Object[] customerHandler = new Object[handler.length + pool];
            for (int i = 0; i < handler.length; i++) {
                customerHandler[i] = handler[i];
            }
            handler = customerHandler;
        }
        return p;
    }

    public X get(int p) {
        if (p > position) {
            throw new RuntimeException();
        }
        return (X) handler[p];
    }

    public void clear() {
        handler = new Object[0];
        position = 0;
    }

    public int size() {
//        int size = 0;
//        for (int i = 0; i < handler.length; i++) {
//            if (handler[i] != null) {
//                size++;
//            }
        return position;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void remove(int element) {
        if (element > position) {
            throw new RuntimeException();
        }
        handler[element] = null;
        Object[] tabb = new Object[handler.length];
        int j = 0;
        for (int i = 0; i < handler.length; i++) {
            if (handler[i] != null) {
                tabb[j] = handler[i];
                j++;
            }
        }
        position--;
        handler = tabb;
    }
}

