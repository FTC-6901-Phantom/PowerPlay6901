package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name ="ServoTest")
public class servoTest extends OpMode {
    //initilalize hardware
    Servo servo;

    @Override
    public void init() {
        servo = hardwareMap.get(Servo.class, "servoTesting");
    }

    @Override
    public void loop() {
        if(gamepad1.a){
            servo.setPosition(.5);
        }
        else if(gamepad1.b){
            servo.setPosition(.9);
        }
    }
}