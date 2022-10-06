package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp (name = "TeleOp69")
public class DriveTrain extends OpMode {

    DcMotor leftFront;
    DcMotor leftBack;
    DcMotor rightFront;
    DcMotor rightBack;

    @Override
    public void init() {

        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        leftBack = hardwareMap.get(DcMotor.class, "leftBack");
        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        rightBack = hardwareMap.get(DcMotor.class, "rightBack");

        rightFront.setDirection(DcMotorSimple.Direction.REVERSE);
        rightBack.setDirection(DcMotorSimple.Direction.REVERSE);
        leftFront.setDirection(DcMotorSimple.Direction.FORWARD);
        leftBack.setDirection(DcMotorSimple.Direction.FORWARD);


    }

    @Override
    public void loop() {

        //power, turning, strafing
        leftFront.setPower (- gamepad1.left_stick_y + gamepad1.right_stick_x + gamepad1.left_stick_x);
        leftBack.setPower  (- gamepad1.left_stick_y + gamepad1.right_stick_x - gamepad1.left_stick_x);
        rightBack.setPower (- gamepad1.left_stick_y - gamepad1.right_stick_x + gamepad1.left_stick_x);
        rightFront.setPower(- gamepad1.left_stick_y - gamepad1.right_stick_x - gamepad1.left_stick_x);

    }
}
