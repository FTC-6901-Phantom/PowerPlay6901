package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.armSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.clawSubsystem;

@TeleOp (name = "TeleOp6901")
public class TeleOp6901 extends OpMode {
    Robot robot;

    //declare subsystems
    armSubsystem arm = new armSubsystem();
    clawSubsystem claw = new clawSubsystem();

    @Override
    public void init() {
        robot = new Robot(hardwareMap);
        robot.init();
        arm.init(hardwareMap, telemetry);
        claw.init(hardwareMap, telemetry);
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
        //up
        if (gamepad1.dpad_up) {
            robot.leftSlide.setPower(.5);
            robot.leftSlide.setTargetPosition(150);
            robot.rightSlide.setPower(.5);
            robot.rightSlide.setTargetPosition(150);
        }
        //down
        if (gamepad1.dpad_down) {
            robot.leftSlide.setPower(-.5);
            robot.leftSlide.setTargetPosition(0);
            robot.rightSlide.setPower(-.5);
            robot.rightSlide.setTargetPosition(0);
        }
        if (!gamepad2.dpad_up && !gamepad2.dpad_down) {
            robot.leftSlide.setPower(0);
            robot.rightSlide.setPower(0);
            //arm positions
        }
        //up
        if (gamepad2.a) {
            arm.armLeft.setPosition(0);
            arm.armRight.setPosition(0);
        }
        //rest
        if (gamepad2.b) {
            arm.armLeft.setPosition(0);
            arm.armRight.setPosition(0);
        }
        //claw positions
    }
}
