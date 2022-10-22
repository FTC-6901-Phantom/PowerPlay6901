package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class armServoTest extends OpMode {


    public static double initialPostition = 0.4;
    public double arm_left_position = initialPostition;
    public double arm_rigth_position = initialPostition;
    private static final double changePos = 0.0003;
    //initilalize hardware
    Servo armLeft = null;
    Servo armRight = null;

    @Override
    public void init() {
        armLeft = hardwareMap.get(Servo.class, "armLeft");
        armRight = hardwareMap.get(Servo.class, "armRight");
        armLeft.setDirection(Servo.Direction.REVERSE);


    }

    @Override
    public void loop() {
        if(gamepad1.a){
            arm_left_position +=changePos;
        }
        else if(gamepad1.b){
            arm_left_position -=changePos;
        }
        if(gamepad1.x){
            arm_rigth_position +=changePos;
        }
        else if(gamepad1.y){
            arm_rigth_position -=changePos;
        }
        armLeft.setPosition(arm_left_position);
        armRight.setPosition(arm_rigth_position);
        telemetry.addData("left claw position", arm_left_position);
        telemetry.addData("right claw position", arm_rigth_position);

    }
}