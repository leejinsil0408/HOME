package Interface_Ex;

import Interface_Ex.RemoteControl;

public class Television implements RemoteControl {
     private int volume; //필드

    public void turnOn() {  //추상메소드의 실체 메소드
        System.out.println("티비를 켭니다");
    }
    public void turnOff() {
        System.out.println("티비를 끕니다");
    }
    public void setVolume(int Volume) {
        if(volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume =volume;
        } System.out.println("현재 볼륨 : " + this.volume);
    }
}