package Interface_Ex;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(true);

        RemoteControl.changeBattery();

    }

        //    SmartTelevion tv = new SmartTelevion();
//
//
//    RemoteControl rc = tv;
//    Searchable searchable = tv;
//
//    rc.turnOn();
//    rc.turnOff();
//    rc.setVolume(10);
//
//    searchable.search("네이버");
//    }
//    RemoteControl rc;



}
