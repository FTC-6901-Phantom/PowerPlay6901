package org.firstinspires.ftc.teamcode.tests;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class ClawServoTest extends OpMode {
    public static double initialPosition = 0;
    public double leftClawPosition = initialPosition;
    public double rightClawPosition = initialPosition;
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
            leftClawPosition +=changePos;
        }
        else if(gamepad1.b){
            leftClawPosition -=changePos;
        }
        if(gamepad1.x){
            rightClawPosition +=changePos;
        }
        else if(gamepad1.y){
            rightClawPosition -=changePos;
        }
        clawLeft.setPosition(leftClawPosition);
        clawRight.setPosition(rightClawPosition);
        telemetry.addData("left claw position", leftClawPosition);
        telemetry.addData("right claw position", rightClawPosition);

    }
}