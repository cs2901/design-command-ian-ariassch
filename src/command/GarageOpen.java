package command;

public class GarageOpen implements Command {
    Garage garage;

    public GarageOpen(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.open();
    }
}
