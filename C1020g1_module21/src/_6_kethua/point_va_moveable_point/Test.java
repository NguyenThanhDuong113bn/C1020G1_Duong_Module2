package _6_kethua.point_va_moveable_point;


public class Test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint.toString());
        moveablePoint.setSpeed(3, 4);
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
