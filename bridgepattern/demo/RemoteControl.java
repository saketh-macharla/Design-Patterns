package bridgepattern.demo;

public class RemoteControl {
    protected  Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    void togglePower(){
        if(device.isEnabled()){
            System.out.println("Turning Off");
            device.disable();
        }
        else {
            device.enable();
            System.out.println("Turning On");
        }
    }

    void volumeDown(){
        device.setVolume(device.getVolume()-10);
    }
    void volumeUp(){
        device.setVolume(device.getVolume()+10);
    }

    void channelDown(){
        device.setChannel(device.getChannel()-1);
    }
    void channelUp(){
        device.setChannel(device.getChannel()+1);
    }
}
