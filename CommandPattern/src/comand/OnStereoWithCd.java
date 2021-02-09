package comand;

import object.Stereo;

public class OnStereoWithCd implements Command {

    private final Stereo stereo;

    public OnStereoWithCd(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {

        stereo.on();
        stereo.setCD();
        stereo.play();
    }
}
