package bridgepattern.demo;

public class Tv implements Device{


    int channel;
    int volume;
    boolean enable;

    public Tv(int channel, int volume, boolean enable) {
        this.channel = channel;
        this.volume = volume;
        this.enable = enable;
    }

    @Override
    public Boolean isEnabled() {
        return enable;
    }

    @Override
    public void enable() {
        this.enable=true;
    }

    @Override
    public void disable() {
        this.enable=false;

    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel=channel;
    }
}
