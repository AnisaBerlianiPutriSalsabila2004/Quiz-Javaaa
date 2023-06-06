public class Room {
    public final double area() {
        double length = getLength();
        double width = getWidth();
        return length * width;
    }

    protected double getLength() {
        // implementasi untuk mendapatkan panjang ruangan
        return 0;
    }

    protected double getWidth() {
        // implementasi untuk mendapatkan lebar ruangan
        return 0;
    }
}