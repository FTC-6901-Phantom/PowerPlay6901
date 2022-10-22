package org.firstinspires.ftc.teamcode.subsystems;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Config
public class armSubsystem extends BaseSubsytem {
    //set positions
    public static double ARM_UP = .4;
    public static double ARM_DOWN = 0.2;

    //create hardware variables
    public Servo armLeft = null;
    public Servo armRight = null;


    //Constructer
    public armSubsystem() {

    }

    //Initialize hardware variables
    public void init(HardwareMap hardwareMap, Telemetry telemetry) {
        super.init(hardwareMap, telemetry);
        armLeft = hardwareMap.get(Servo.class, "armLeft");
        armRight = hardwareMap.get(Servo.class, "armRight");
        armLeft.setDirection(Servo.Direction.REVERSE);

    }
    public void defaultCommand(Gamepad gamepad1, Gamepad gamepad2) {
        super.gamepadInit(gamepad1, gamepad2);
        //up
        if (gamepad2.a){
            armLeft.setPosition(ARM_UP);
            armRight.setPosition(ARM_UP);
        }
        //down
        if (gamepad2.b){
            armLeft.setPosition(ARM_DOWN);
            armRight.setPosition(ARM_DOWN);
        }
        armLeft.setPosition(ARM_UP);
        armRight.setPosition(ARM_UP);
        armLeft.setPosition(ARM_DOWN);
        armRight.setPosition(ARM_DOWN);
    }
}
