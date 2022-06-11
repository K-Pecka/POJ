package zjazd5.zad5_2;

public class MovablePoint implements Movable{
    private int y;
    private int x;
    public MovablePoint(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public void moveUp() {this.y++;System.out.println("UP");}
    @Override
    public void moveDown() {this.y--;System.out.println("DOWN");}
    @Override
    public void moveLeft() {this.x--;System.out.println("LEFT");}
    @Override
    public void moveRight() {this.x++;System.out.println("RIGHT");}
    public String toString()
    {
        System.out.println("x: "+this.x+", y: "+this.y);
        return "";
    }
}
