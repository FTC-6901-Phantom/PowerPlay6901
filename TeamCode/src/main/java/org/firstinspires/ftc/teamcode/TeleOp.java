package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class TeleOp extends OpMode {
    DcMotor leftFront;
    DcMotor leftRear;
    DcMotor rightFront;
    DcMotor rightRear;


    @Override
    public void init() {
        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        leftRear = hardwareMap.get(DcMotor.class, "leftRear");
        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        rightRear = hardwareMap.get(DcMotor.class, "rightRear");

        rightFront.setDirection(DcMotorSimple.Direction.REVERSE);
        rightRear.setDirection(DcMotorSimple.Direction.REVERSE);
        leftFront.setDirection(DcMotorSimple.Direction.FORWARD);
        leftRear.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    @Override
    public void loop() {

        //power, turning, strafing
        leftFront.setPower (- gamepad1.left_stick_y + gamepad1.right_stick_x + gamepad1.left_stick_x);
        leftRear.setPower  (- gamepad1.left_stick_y + gamepad1.right_stick_x - gamepad1.left_stick_x);
        rightRear.setPower (- gamepad1.left_stick_y - gamepad1.right_stick_x + gamepad1.left_stick_x);
        rightFront.setPower(- gamepad1.left_stick_y - gamepad1.right_stick_x - gamepad1.left_stick_x);

    }
}
