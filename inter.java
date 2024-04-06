class rectangle {
    int length;
    int width;

    public rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }

}

public class inter {

    public static void main(String args[]) {
        rectangle rec = new rectangle(4, 3);
        System.out.println("Area is: " + rec.calculateArea());
        System.out.println("Area is: " + rec.calculatePerimeter());

    }
}