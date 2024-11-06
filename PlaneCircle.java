public class PlaneCircle extends Circle {
    public double cx,cy;
    private double r;
    
    public PlaneCircle(double r,double x,double y){
        //super(r);//change int(r)
        this.cx=x;
        this.cy=y;
    }
    public boolean isInside(double x,double y){
        double dx=x-cx,dy=y-cy;
        double distance=Math.sqrt(dx*dx);
        return (distance<r);
    }
    public static void main(String[] args) {
        PlaneCircle p=new PlaneCircle(PI, PI, PI);
        System.out.println(p.isInside(PI, PI));
        
    }
}
