package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light kitchenlight = new Light();
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenlight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenlight);
        Light LRlight = new Light();
        LightOnCommand LRLightOn = new LightOnCommand(LRlight);
        LightOffCommand LRLightOff = new LightOffCommand(LRlight);
        Fan fan = new Fan();
        FanOn fanon = new FanOn(fan);
        FanOff fanoff = new FanOff(fan);
        Garage garage = new Garage();
        GarageOpen garageopen = new GarageOpen(garage);
        GarageClose garageclose = new GarageClose(garage);
        Stereo stereo = new Stereo();
        StereoOn stereoon = new StereoOn(stereo);
        StereoOff stereooff = new StereoOff(stereo);


        System.out.println("Kitchen: ");
        remote.setCommand(kitchenLightOn);
        remote.buttonWasPressed();
        remote.setCommand(kitchenLightOff);
        remote.buttonWasPressed();

        System.out.println("Living Room: ");
        remote.setCommand(LRLightOn);
        remote.buttonWasPressed();
        remote.setCommand(LRLightOff);
        remote.buttonWasPressed();

        System.out.println("Fan: ");
        remote.setCommand(fanon);
        remote.buttonWasPressed();
        remote.setCommand(fanoff);
        remote.buttonWasPressed();

        System.out.println("Stereo: ");
        remote.setCommand(stereoon);
        remote.buttonWasPressed();
        remote.setCommand(stereooff);
        remote.buttonWasPressed();

        System.out.println("Garage: ");
        remote.setCommand(garageopen);
        remote.buttonWasPressed();
        remote.setCommand(garageclose);
        remote.buttonWasPressed();

    }
}
