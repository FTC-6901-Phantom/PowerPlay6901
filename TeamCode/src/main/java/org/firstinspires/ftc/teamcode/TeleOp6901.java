package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp (name = "TeleOp6901")
public class TeleOp6901 extends OpMode {


    Robot robot = new Robot(hardwareMap);

    @Override
    public void init() {
        robot.init();
    }

    @Override
    public void loop() {

        //power, turning, strafing
        //drive
        robot.leftFront.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x + gamepad1.left_stick_x);
        robot.leftRear.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x - gamepad1.left_stick_x);
        robot.rightRear.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x + gamepad1.left_stick_x);
        robot.rightFront.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x - gamepad1.left_stick_x);

        //slide motors
        if (gamepad2.dpad_up) {
            robot.leftSlide.setPower(1);
            robot.leftSlide.setTargetPosition(0);
            robot.rightSlide.setPower(1);
            robot.rightSlide.setTargetPosition(0);
        }
        if (gamepad2.dpad_down) {
            robot.leftSlide.setPower(-1);
            robot.leftSlide.setTargetPosition(0);
            robot.rightSlide.setPower(-1);
            robot.rightSlide.setTargetPosition(0);

        }
    }
}
