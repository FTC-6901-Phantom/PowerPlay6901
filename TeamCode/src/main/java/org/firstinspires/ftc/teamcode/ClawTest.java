package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp

public class ClawTest extends LinearOpMode {
    private Servo clawLeft;
    private Servo clawRight;

    @Override
    public void runOpMode() throws InterruptedException {
        clawLeft = hardwareMap.get(Servo.class, "clawLeft");
        clawRight = hardwareMap.get(Servo.class, "clawRight");
        clawLeft.setDirection(Servo.Direction.REVERSE);
        waitForStart();
        //1 is inward and 0 is outward
        while (opModeIsActive()) {
            if (gamepad1.x) {
                clawLeft.setPosition(1);
                clawRight.setPosition(1);
            }
            if (gamepad1.y) {
                clawRight.setPosition(0);
                clawLeft.setPosition(0);
            }
        }
    }
}