package exercise4;

public class Circle extends Shape{
    double r=0.0;

    Circle(){
        this(new Point(0,0),0.0);
    }
    Circle(Point p, double r){
        super(p);
        if(r>0){
            this.r=r;
        }
    }
    @Override
    double calcArea() {
        return r*r*Math.PI;
    }
}
