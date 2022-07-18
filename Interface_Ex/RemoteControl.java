package Interface_Ex;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int Volume);

    default void setVolume(boolean mute) {
        if (mute) {
            System.out.println("무음처리합니다");
        } else {
            System.out.println("무음 해제합니다");
        }
    }

    static void changeBattery() {
        System.out.println("배터리를 교체합니다");
    }
}

