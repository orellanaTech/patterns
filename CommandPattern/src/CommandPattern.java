import comand.*;
import object.Fan;
import object.GarageDoor;
import object.Light;
import object.Stereo;
import remoteControl.FanRemoteControl;
import remoteControl.RemoteControl;
import remoteControl.SimpleRemoteControl;

public class CommandPattern {

    public static void main(String[] args) throws InterruptedException {

        //Simple remote
//        Light light = new Light();
//        SimpleRemoteControl  simpleRemoteControl = new SimpleRemoteControl();
//        simpleRemoteControl.setSlot(new LightOnCommand(light));
//        simpleRemoteControl.buttonPressed();

        //Multiple RemoteCOntrol

        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();
        GarageDoor garageDoor = new GarageDoor();

        remoteControl.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        remoteControl.setCommand(1, new OpenGarageDoor(garageDoor), new CloseGarageDoor(garageDoor));
        remoteControl.setCommand(2, new OnStereoWithCd(stereo), new OffStereo(stereo));
        remoteControl.setCommand(3, new UpStereoVolume(stereo), new DownStereoVolume(stereo));

        System.out.println(remoteControl.toString());
//
//        remoteControl.onButtonPressed(0);
//        remoteControl.onButtonPressed(1);
//        remoteControl.offButtonPressed(1);
//
//        remoteControl.onButtonPressed(2);
//        remoteControl.onButtonPressed(3);
//        remoteControl.onButtonPressed(3);
//        remoteControl.onButtonPressed(3);
//        remoteControl.offButtonPressed(3);
//        remoteControl.offButtonPressed(2);

        //WITH lambda expression



        //Commands with undo

        remoteControl.setCommand(4, light::on, light::off);
        remoteControl.onButtonPressed(4);
        remoteControl.offButtonPressed(4);

//        Fan fan = new Fan();
//        FanRemoteControl fanRemoteControl = new FanRemoteControl(fan);
//
//        fanRemoteControl.pressOnButton();
//        fanRemoteControl.pressUpSpeedButton();
//        fanRemoteControl.pressUpSpeedButton();
//        fanRemoteControl.pressUndoButton();
//        System.out.println("----");
//        fanRemoteControl.pressDOwnSpeedButton();
//        fanRemoteControl.pressUndoButton();
//        fanRemoteControl.pressOffButton();
//        fanRemoteControl.pressUndoButton();
//        System.out.println("----");
//        fanRemoteControl.pressOnButton();
//        fanRemoteControl.pressUndoButton();
    }
}
