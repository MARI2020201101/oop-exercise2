package exercise2;

public class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH : " + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL : " + t.getVolume());
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        if(volume<MIN_VOLUME) this.volume = MIN_VOLUME;
        else if(volume>MAX_VOLUME) this.volume =MAX_VOLUME;
        else this.volume = volume;
    }

    public void setChannel(int channel) {
        if(channel<MIN_CHANNEL) this.channel = MIN_CHANNEL;
        else if(channel>MAX_CHANNEL) this.channel =MAX_CHANNEL;
        else this.channel = channel;
    }

    public int getChannel() {
        return this.channel;
    }
}
