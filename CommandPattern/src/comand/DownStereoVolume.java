package comand;

import object.Stereo;

public class DownStereoVolume implements Command {

    private final Stereo stereo;

    public DownStereoVolume(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setVolume(stereo.getVolume() - 1);
    }
}
