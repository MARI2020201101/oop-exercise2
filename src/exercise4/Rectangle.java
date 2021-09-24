package exercise4;

public class Rectangle extends Shape{
    double width =0;
    double height=0;

    Rectangle(){
        super(new Point(0,0));

    }
    Rectangle(double width, double height){
        this(new Point(),width,height);
    }
    Rectangle(Point p, double width, double height){
        super(p);
        if(width<0 || height <0){
            this.width =0;
            this.height = 0;
        }else{
            this.width=width;
            this.height=height;
        }
    }
    boolean isSquare(){
        if(this.height==this.width) return true;
        return false;
    }
    @Override
    double calcArea() {
        return width*height;
    }
}
