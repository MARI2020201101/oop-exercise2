package exercise3;

public class Buyer {

    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }

    int money = 1000;
    Product[] cart = new Product[3];
    int i =0;

    void buy(Product p){
        if(money<p.price){
            System.out.println("가진돈이 부족하여 "+p.toString() + " 을 살수없습니다.");
            return;
        }else{
            money-= p.price;
            add(p);
        }
    }
    void add(Product p){
        if(i>= cart.length){
            Product[] tmp = new Product[cart.length*2];
            System.arraycopy(cart,0,tmp,0,cart.length);
            this.cart = tmp;
            tmp=null;
        }
        cart[i]=p;
        i++;
    }
    void summary(){
        int sum =0;
        String str = "";
        for(int i =0; i< cart.length; i++){
            sum+=cart[i].price;
            str+=cart[i].toString()+",";
        }

        System.out.println("구입한 물건 : " +str);
        System.out.println("사용한 금액 : "+ sum);
        System.out.println("남은 금액 : " +money);

    }

}
class Product{
    int price;

    Product(int price){
        this.price = price;
    }

}
class Computer extends Product{
    Computer(){
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }

}
class Tv extends Product{
    Tv(){
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}
class Audio extends Product{
    Audio(){
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}