package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.subsystems.ArmSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.ClawSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.DriveSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.SlideSubsystem;

@TeleOp (name = "TeleOp6901")
public class TeleOp6901 extends OpMode {

    Servo armLeft, armRight;
    Servo clawLeft, clawRight;
    DcMotor leftFront, leftRear, rightFront, rightRear, leftSlide, rightSlide;
    //declare subsystems
    ArmSubsystem arm = new ArmSubsystem(this);
    ClawSubsystem claw = new ClawSubsystem(this);
    DriveSubsystem drive = new DriveSubsystem(this);
    SlideSubsystem slide = new SlideSubsystem(this);
//    ClawSubsystem claw = new ClawSubsystem(this);
//    DriveSubsystem drive = new DriveSubsystem(this);
//    SlideSubsystem slide = new SlideSubsystem(this);

    @Override
    public void init() {
        //init subsystems
        arm.init(armLeft, armRight, hardwareMap, this);
        slide.init(leftSlide, rightSlide, hardwareMap, this);
        drive.init(leftFront, rightFront, leftRear, rightRear, hardwareMap, this);
        claw.init(clawLeft, clawRight, hardwareMap, this);
//        claw.init();
//        drive.init();
//        slide.init();
    }

    @Override
    public void loop() {
        //run subsystem loop command
        arm.teleOpCommand();
        claw.teleOpCommand();
        drive.teleOpCommand();
        slide.teleOpCommand();
    }
}
