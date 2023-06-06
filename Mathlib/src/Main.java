public class Main {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        double roomArea = livingRoom.area();
        System.out.println("Luas ruang tamu: " + roomArea);

        Circle circle = new Circle(3.0);
        double circleArea = circle.calculateArea();
        System.out.println("Luas lingkaran: " + circleArea);
    }
}