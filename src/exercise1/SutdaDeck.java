package exercise1;

public class SutdaDeck {
    final int CARD_NUM =20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for(int i=0;i< cards.length/2;i++){
            boolean isKwang = false;
            if(i+1==1||i+1==3||i+1==8){
                isKwang= true;
            }
            cards[i]=new SutdaCard(i+1,isKwang);
        }

        for(int i=0;i< cards.length/2;i++){
            cards[cards.length/2+i]= new SutdaCard(i+1,false);
        }
    }
    public void shuffle(){
        for(int i =0; i <cards.length;i++){
            int j = (int) (Math.random()*cards.length);
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }
    public SutdaCard pick(int index){
        if(index<0 || index>=cards.length) return null;
        return cards[index];
    }
    public SutdaCard pick(){
        return cards[(int) (Math.random()* cards.length)];
    }

    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i = 0; i<deck.cards.length; i++){
            System.out.print(deck.cards[i]+ ",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }
    SutdaCard(int num , boolean isKwang){
        this.num= num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num+ (isKwang ? "K" :"");
    }
}
