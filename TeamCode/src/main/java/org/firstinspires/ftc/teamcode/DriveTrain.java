//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//
//@TeleOp (name = "TeleOp69")
//public class DriveTrain extends OpMode {
//
//
//    Devices devices = new Devices(hardwareMap);
//
//    @Override
//    public void init() {
//        devices.init();
//    }
//
//    @Override
//    public void loop() {
//
//        //power, turning, strafing
//        devices.leftFront.setPower (- gamepad1.left_stick_y + gamepad1.right_stick_x + gamepad1.left_stick_x);
//        devices.leftRear.setPower  (- gamepad1.left_stick_y + gamepad1.right_stick_x - gamepad1.left_stick_x);
//        devices.rightRear.setPower (- gamepad1.left_stick_y - gamepad1.right_stick_x + gamepad1.left_stick_x);
//        devices.rightFront.setPower(- gamepad1.left_stick_y - gamepad1.right_stick_x - gamepad1.left_stick_x);
//
//    }
//}
