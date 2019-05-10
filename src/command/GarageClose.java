package command;

public class GarageClose implements Command {
    Garage garage;

    public GarageClose(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.close();
    }
}
