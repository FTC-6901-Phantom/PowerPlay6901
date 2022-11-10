package org.firstinspires.ftc.teamcode.subsystems;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Config
public class ArmSubsystem {
    //set positions
    public static double ARM_UP = .4;
    public static double ARM_DOWN = 0.2;

    //create hardware variables
    private Servo armLeft;
    private Servo armRight;

//    private final HardwareMap hardwareMap;
    private Gamepad gamepad2;


    //Constructer
    public ArmSubsystem(OpMode opMode) {
//        hardwareMap = opMode.hardwareMap;

    }

    //Initialize hardware variables
    public void init(Servo armLeft, Servo armRight, HardwareMap hw, OpMode opMode) {
        gamepad2 = opMode.gamepad2;
        this.armLeft = armLeft;
        this.armRight = armRight;
        this.armLeft = hw.get(Servo.class, "armLeft");
        this.armRight = hw.get(Servo.class, "armRight");
        this.armLeft.setDirection(Servo.Direction.REVERSE);
        this.armRight.setDirection(Servo.Direction.FORWARD);
    }

    public void teleOpCommand() {
        //up
        if (gamepad2.a){
            armLeft.setPosition(ARM_UP);
            armRight.setPosition(ARM_UP);
        }
        //down
        else if (gamepad2.b){
            armLeft.setPosition(ARM_DOWN);
            armRight.setPosition(ARM_DOWN);
        }
//        armLeft.setPosition(ARM_UP);
//        armRight.setPosition(ARM_UP);
//        armLeft.setPosition(ARM_DOWN);
//        armRight.setPosition(ARM_DOWN);
    }
}
