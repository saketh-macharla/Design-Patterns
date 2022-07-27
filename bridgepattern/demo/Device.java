package bridgepattern.demo;

public interface Device {
    Boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percent);
    int  getChannel();
    void setChannel(int channel);
}
