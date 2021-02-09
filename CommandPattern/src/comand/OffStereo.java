package comand;

import object.Stereo;

public class OffStereo implements Command {

    private final Stereo stereo;

    public OffStereo(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
