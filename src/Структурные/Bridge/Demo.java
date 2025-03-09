package Структурные.Bridge;

public class Demo {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        Remote tvRemote = new Remote(tv);
        Remote radioRemote = new Remote(radio);

        System.out.println(tv.getInfo());
        System.out.println(radio.getInfo());

        tvRemote.togglePower();
        tvRemote.volumeUp();
        tvRemote.channelUp();

        radioRemote.togglePower();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.channelUp();
        radioRemote.channelUp();
        radioRemote.channelUp();

        System.out.println();
        System.out.println(tv.getInfo());
        System.out.println(radio.getInfo());

    }
}
