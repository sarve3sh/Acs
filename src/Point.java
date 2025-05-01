
public class Point {

    private double x;
    private double y;
//constructors #1

    public Point() {
        this.x = 0;
        this.y = 0;
    }
//constructors #2

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point difference(Point point) {
        double defx = this.x - point.getX();
        double defy = this.y - point.getY();
        return new Point(defx, defy);
    }

    public void displayCoordinate() {
        System.out.println("the x coordinate is:"+this.x);
        System.out.println("the y coordinate is:"+this.y);
    }

    public double distance(Point point) {
        double fx = this.x - point.getX();
        double fy = this.y - point.getY();
        return Math.sqrt((fx * fx) + (fy * fy));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void linearEquation(Point point) {
        double m = (this.y-point.getY())/(this.x-point.getX());
        double b = this.y-m*this.x;
        System.out.println("the linear equation:y="+m+"x+"+b);
    }

    public Point midPoint(Point point) {
        double mx = (this.x + point.getX()) / 2;
        double my = (this.y + point.getY()) / 2;
        return new Point(mx, my);
    }


    public double slope(Point point) {
        double sx = this.x - point.getX();
        double sy = this.y - point.getY();
        return sy / sx;
    }

    public Point sum(Point point) {
        double ux = this.x + point.getX();
        double uy = this.y + point.getY();
        return new Point(ux, uy);

    }

    public double yintercept(Point point) {
        double slope = (this.y - point.getY()) / (this.x - point.getX());
        double b = y - slope;
        return b;
    }
}
