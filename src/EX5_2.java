class Point {
    private int x, y;

    public Point() {
        this.x = x;
        this.y = y;
    }

    public Point(intx, int y){
        System.out.println("("+ x +","+ y +")");
    } 
}

    class ColorPoint extends Point {
        private String color;

        public ColorPoint(int x, int y, String color) {
            super(x, y);
            this.color = color;
        }

        public void showColorPoint() {
            System.out.print(color);
            showPoint();
        }
    }

public class EX5_2{
    public static void main(String[] args){
        ColorPoint cp = new ColorPoint(5,6, "blue");
        cp.showColorPoint();
    }
}