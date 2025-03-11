package Structural.Bridge;

public interface Device {
    void setChannel(int channel);

    void setStatus(boolean status);

    void setVolume(int volume);

    boolean getStatus();

    int getChannel();

    int getVolume();

    String getInfo();
}
