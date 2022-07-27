package bridgepattern.demo;

public class BridgeDemo {
    public static void main(String[] args) {
        Tv tv = new Tv(10,100,true);
        RemoteControl remote = new RemoteControl(tv);

        System.out.println("tv.isEnabled: "+tv.isEnabled());
        remote.togglePower();
        System.out.println("tv.isEnabled: "+tv.isEnabled());

        System.out.println("Channel: "+tv.getChannel());
        remote.channelDown();
        System.out.println("Channel: "+tv.getChannel());

        System.out.println("Volume: "+tv.getVolume());
        remote.volumeDown();
        System.out.println("Volume: "+tv.getVolume());

    }
}
