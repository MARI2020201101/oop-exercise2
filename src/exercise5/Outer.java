package exercise5;


public class Outer {

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner inner = o.new Inner();
        inner.method1();
    }

    int value =10;

    class Inner{
        int value=20;
        void method1(){
            int value= 30;
            System.out.println(value);
            System.out.println(this.value);
            Outer o = new Outer();
            System.out.println(o.value);
        }
    }
}
