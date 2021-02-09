package comand;

import object.Stereo;

public class UpStereoVolume implements Command {

    private final Stereo stereo;

    public UpStereoVolume(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setVolume(stereo.getVolume() + 1);
    }
}
