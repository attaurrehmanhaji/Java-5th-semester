class test {
    void show() {
        System.out.println("this is first show method.");
    }

    void show(int z) {
        System.out.println("this is second show method.");
    }

}

public class polymorphism {
    public static void main(String[] args) {
        test t = new test();
        t.show();
    }
}
