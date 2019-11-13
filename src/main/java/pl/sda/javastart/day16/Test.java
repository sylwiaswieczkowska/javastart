package pl.sda.javastart.day16;

public class Test {
    String name;

    public Test(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws InterruptedException {
        Test firstWord = new Test("nothing");
        Test secondWord = new Test("something");
        firstWord = null;
        System.gc();
        secondWord = null;
        System.gc();

        Thread.sleep(50000);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name);
    }
}
