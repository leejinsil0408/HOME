package Interface_Ex;

public class Audio implements RemoteControl {
    private int Volume;
    private boolean mute;

    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
    public void turnOff() {
        System.out.println("Audio를 끕니다");
    }

    public void setVolume(int Volume) {
        if(Volume>RemoteControl.MAX_VOLUME) {
            this.Volume = RemoteControl.MAX_VOLUME;
        }else if(Volume<RemoteControl.MIN_VOLUME) {
            this.Volume = RemoteControl.MIN_VOLUME;
        }else {
            this.Volume = Volume;
        }System.out.println("현재 Audio 볼륨: " + this.Volume);
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if (mute) {
            System.out.println("무음처리합니다");
        } else {
            System.out.println("무음 해제합니다");
        }
    }

    }
}
