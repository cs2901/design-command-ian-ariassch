package command;

public class StereoOn implements Command{
    Stereo stereo;

    public StereoOn(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }
}
