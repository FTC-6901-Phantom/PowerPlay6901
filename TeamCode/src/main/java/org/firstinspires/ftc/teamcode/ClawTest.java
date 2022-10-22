package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp

public class ClawTest extends LinearOpMode {
    private Servo armLeft;
    private Servo armRight;

    @Override
    public void runOpMode() throws InterruptedException {
        armLeft = hardwareMap.get(Servo.class, "armLeft");
        armRight = hardwareMap.get(Servo.class, "armRight");
        armLeft.setDirection(Servo.Direction.REVERSE);
        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.x) {
                armLeft.setPosition(1);
                armRight.setPosition(1);
            }
            if (gamepad1.y) {
                armLeft.setPosition(0);
                armRight.setPosition(0);
            }
        }
    }
}