package zjazd5.zad5_2;

public class TestMovablePoint {
    public static void main(String[] args) {
        System.out.println("\n\n===========================================================\n");
        MovablePoint p1 = new MovablePoint(0, 0);
        MovablePoint p2 = new MovablePoint(54, 77);
        System.out.println("p1:");
        p1.toString();
        p1.moveDown();
        p1.moveLeft();
        p1.moveLeft();
        p1.moveRight();
        p1.toString();
        System.out.println("p2:");
        p2.toString();
        p2.moveUp();
        p2.moveRight();
        p2.moveRight();
        p2.toString();
    }
}
