package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class DriveTrain extends OpMode {

    DcMotor leftFront;
    DcMotor leftBack;
    DcMotor rightFront;
    DcMotor rightBack;
    Servo gripperLeft;
    Servo gripperRight;

    @Override
    public void init() {

        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        leftBack = hardwareMap.get(DcMotor.class, "leftBack");
        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        rightBack = hardwareMap.get(DcMotor.class, "rightBack");
        gripperLeft = hardwareMap.get(Servo.class, "gripperLeft");
        gripperRight = hardwareMap.get(Servo.class, "gripperRight");
        rightFront.setDirection(DcMotorSimple.Direction.REVERSE);
        rightBack.setDirection(DcMotorSimple.Direction.REVERSE);
        leftFront.setDirection(DcMotorSimple.Direction.FORWARD);
        leftBack.setDirection(DcMotorSimple.Direction.FORWARD);
        gripperLeft.setDirection(Servo.Direction.FORWARD);
        gripperRight.setDirection(Servo.Direction.FORWARD);

    }

    @Override
    public void loop() {

        //power, turning, strafing
        leftFront.setPower (- gamepad1.left_stick_y + gamepad1.right_stick_x + gamepad1.left_stick_x);
        leftBack.setPower  (- gamepad1.left_stick_y + gamepad1.right_stick_x - gamepad1.left_stick_x);
        rightBack.setPower (- gamepad1.left_stick_y - gamepad1.right_stick_x + gamepad1.left_stick_x);
        rightFront.setPower(- gamepad1.left_stick_y - gamepad1.right_stick_x - gamepad1.left_stick_x);
        gripperLeft.setPosition(1);
        gripperRight.setPosition(1);
        if (gamepad1.b == true) {
            gripperLeft.setPosition(1);
        }
        if (gamepad1.a == true) {
            gripperLeft.setPosition(0);
        }

    }
}
