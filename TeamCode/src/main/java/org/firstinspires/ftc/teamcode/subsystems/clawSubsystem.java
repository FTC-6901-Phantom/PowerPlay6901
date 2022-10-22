package org.firstinspires.ftc.teamcode.subsystems;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Config
public class clawSubsystem extends BaseSubsytem{
    //values
    public static double CLAW_OPEN = 0.8;
    public static double ClAW_CLOSED = 0.4;

    // create hardware variables
    public Servo clawLeft = null;
    public Servo clawRight = null;

    //Constructer
    public void clawSubsystem() {

    }

    //Initialize hardware variables
    public void init(HardwareMap hardwareMap, Telemetry telemetry) {
        clawLeft = hardwareMap.get(Servo.class, "clawLeft");
        clawRight = hardwareMap.get(Servo.class, "clawRight");
    }
    public void defaultCommand(Gamepad gamepad1, Gamepad gamepad2) {
        super.gamepadInit(gamepad1, gamepad2);
        //up
        if (gamepad2.x){
            clawLeft.setPosition(CLAW_OPEN);
            clawRight.setPosition(CLAW_OPEN);
        }
        //down
        if (gamepad2.x){
            clawLeft.setPosition(ClAW_CLOSED);
            clawRight.setPosition(ClAW_CLOSED);
        }
        clawLeft.setPosition(CLAW_OPEN);
        clawRight.setPosition(CLAW_OPEN);
        clawLeft.setPosition(ClAW_CLOSED);
        clawRight.setPosition(ClAW_CLOSED);

    }
}