package org.firstinspires.ftc.teamcode.subsystems;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Config
public class clawSubsystem extends BaseSubsytem{
    //values

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
        clawLeft.setDirection(Servo.Direction.REVERSE);
    }
    public void defaultCommand(Gamepad gamepad1, Gamepad gamepad2) {
        super.gamepadInit(gamepad1, gamepad2);
        //close
        //1 is inward and 0 is outward
        if (gamepad2.x){
            clawLeft.setPosition(0);
            clawRight.setPosition(0);
        }
        //open
        if (gamepad2.y){
            clawLeft.setPosition(0.22);
            clawRight.setPosition(0.17);
        }
    }
}