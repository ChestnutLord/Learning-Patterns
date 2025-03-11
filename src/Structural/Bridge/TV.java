package Structural.Bridge;

public class TV implements Device{

    private boolean status=false;
    private int volume=0;
    private int channel=0;


    @Override
    public void setStatus(boolean status) {
        this.status=status;
    }

    @Override
    public void setVolume(int volume) {
       this.volume=volume;
    }

    @Override
    public boolean getStatus() {
        return status;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setChannel(int channel) {
        this.channel=channel;
    }

    @Override
    public String getInfo() {
        return "Status= "+status+"\nVolume= "+volume+"\nChannel= "+channel;
    }
}
