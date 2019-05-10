package command;

public class FanOn implements Command {
    Fan fan;

    public FanOn(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }

}
