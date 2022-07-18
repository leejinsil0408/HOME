package Interface_Ex;

public class SmartTelevion implements RemoteControl,Searchable {
    private int Volume;

    public void turnOn() {
        System.out.println("TV를 켭니다");
    }
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }
    public void setVolume(int volume) {
        if(Volume>RemoteControl.MAX_VOLUME) {
            this.Volume = RemoteControl.MAX_VOLUME;
        } else if (Volume<RemoteControl.MIN_VOLUME) {
            this.Volume = RemoteControl.MIN_VOLUME;
        }else {
            this.Volume = Volume;
        }System.out.println("현재 TV 볼륨 : " + this.Volume);
    }

    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
