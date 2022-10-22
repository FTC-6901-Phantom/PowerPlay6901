package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class clawServoTest extends OpMode {
    public static double initialPosition = 0;
    public double Left_claw_position = initialPosition;
    public double Right_claw_position = initialPosition;
    private static final double changePos = 0.0003;
    //initilalize hardware
    Servo clawLeft = null;
    Servo clawRight = null;

    @Override
    public void init() {
        clawLeft = hardwareMap.get(Servo.class, "clawLeft");
        clawRight = hardwareMap.get(Servo.class, "clawRight");
        clawLeft.setDirection(Servo.Direction.REVERSE);


    }

    @Override
    public void loop() {
        if(gamepad1.a){
            Left_claw_position+=changePos;
        }
        else if(gamepad1.b){
            Left_claw_position-=changePos;
        }
        if(gamepad1.x){
            Right_claw_position+=changePos;
        }
        else if(gamepad1.y){
            Right_claw_position-=changePos;
        }
        clawLeft.setPosition(Left_claw_position);
        clawRight.setPosition(Right_claw_position);
        telemetry.addData("left claw position", Left_claw_position);
        telemetry.addData("right claw position", Right_claw_position);

    }
}