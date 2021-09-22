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

    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for(int i = 0; i<deck.cards.length; i++){
            System.out.print(deck.cards[i]+ ",");
        }
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
