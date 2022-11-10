package org.firstinspires.ftc.teamcode.subsystems;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Config
public class ClawSubsystem{
    //values

    // create hardware variables
    private Servo clawLeft;
    private Servo clawRight;

    private final HardwareMap hardwareMap;
    private  Gamepad gamepad2;

    //Constructer
    public ClawSubsystem(OpMode opMode) {
        hardwareMap = opMode.hardwareMap;
        gamepad2 = opMode.gamepad2;

    }

    //Initialize hardware variables
    public void init(Servo clawLeft, Servo clawRight, HardwareMap hw, OpMode opMode) {
        gamepad2 = opMode.gamepad2;
        this.clawLeft = clawLeft;
        this.clawRight = clawRight;
        this.clawLeft = hw.get(Servo.class, "clawLeft");
        this.clawRight = hw.get(Servo.class, "clawRight");
        this.clawLeft.setDirection(Servo.Direction.REVERSE);
        this.clawRight.setDirection(Servo.Direction.FORWARD);
    }
    public void teleOpCommand() {

        //close
        if (gamepad2.right_bumper){
            clawLeft.setPosition(0.4);
            clawRight.setPosition(0.4);
        }
        //open
        if (gamepad2.left_bumper){
            clawLeft.setPosition(0.3);
            clawRight.setPosition(0.3);
        }
    }
}