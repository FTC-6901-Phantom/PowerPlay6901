package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.subsystems.armSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.clawSubsystem;

@TeleOp (name = "TeleOp6901")
public class TeleOp6901 extends OpMode {
    Robot robot = new Robot(hardwareMap);

    //declare subsystems
    armSubsystem arm = new armSubsystem();
    clawSubsystem claw = new clawSubsystem();
//    private Servo armRight, armLeft;

    @Override
    public void init() {
        robot = new Robot(hardwareMap);
        robot.init();
        //init subsystems
//        arm.init(armRight, armLeft, hardwareMap, telemetry);
        arm.init(hardwareMap,telemetry);
        claw.init(hardwareMap, telemetry);
    }

    @Override
    public void loop() {

//        telemetry.addData("Servo1Pos: ",         arm.armRight.getPosition());
//        telemetry.addData("Servo2Pos: ",         arm.armLeft.getPosition());


        //power, turning, strafing
        //drive
        robot.leftFront.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x + gamepad1.left_stick_x);
        robot.leftRear.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x - gamepad1.left_stick_x);
        robot.rightRear.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x + gamepad1.left_stick_x);
        robot.rightFront.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x - gamepad1.left_stick_x);

        //slide motors
        //up
        if (gamepad1.dpad_down) {
            robot.leftSlide.setPower(.5);
            robot.leftSlide.setTargetPosition(0);
            robot.rightSlide.setPower(.5);
            robot.rightSlide.setTargetPosition(0);
        }
        //down
        else if (gamepad1.dpad_up) {
            robot.leftSlide.setPower(-.5);
            robot.leftSlide.setTargetPosition(150);
            robot.rightSlide.setPower(-.5);
            robot.rightSlide.setTargetPosition(150);
        }
        else  {
            robot.leftSlide.setPower(0);
            robot.rightSlide.setPower(0);
        }

        //arm positions
        //up
        if (gamepad2.a) {
            arm.armLeft.setPosition(armSubsystem.ARM_UP);
            arm.armRight.setPosition(armSubsystem.ARM_UP);
        }
        if (gamepad2.b) {
            arm.armLeft.setPosition(armSubsystem.ARM_DOWN);
            arm.armRight.setPosition(armSubsystem.ARM_DOWN);
        }

        //claw positions
        //close
        if (gamepad2.x) {
            claw.clawLeft.setPosition(0);
            claw.clawRight.setPosition(0);
        }
        //open
        if (gamepad2.y) {
            claw.clawLeft.setPosition(0.22);
            claw.clawRight.setPosition(0.17);
        }
    }
}
