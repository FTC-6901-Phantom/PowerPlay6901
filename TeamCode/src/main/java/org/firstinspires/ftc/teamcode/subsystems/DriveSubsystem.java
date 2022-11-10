package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DriveSubsystem {

    private DcMotor leftFront;
    private DcMotor leftRear;
    private DcMotor rightFront;
    private DcMotor rightRear;

    private  Gamepad gamepad1;
    private final HardwareMap hardwareMap;


    public DriveSubsystem(OpMode opMode){
        gamepad1 = opMode.gamepad1;
        hardwareMap = opMode.hardwareMap;

    }
    public void init(DcMotor leftFront, DcMotor rightFront, DcMotor leftRear, DcMotor rightRear, HardwareMap hw, OpMode opMode){
        gamepad1 = opMode.gamepad1;
        this.leftFront = leftFront;
        this.leftRear = leftRear;
        this.rightFront = rightFront;
        this.rightRear = rightRear;


        this.leftFront = hw.get(DcMotor.class, "leftFront");
        this.leftRear = hw.get(DcMotor.class, "leftRear");
        this.rightFront = hw.get(DcMotor.class, "rightFront");
        this.rightRear = hw.get(DcMotor.class, "rightRear");

        this.rightFront.setDirection(DcMotorSimple.Direction.FORWARD);
        this.rightRear.setDirection(DcMotorSimple.Direction.FORWARD);
        this.leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
        this.leftRear.setDirection(DcMotorSimple.Direction.FORWARD);

        this.leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.leftRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.rightRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void teleOpCommand(){
        leftFront.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x - gamepad1.left_stick_x);
        leftRear.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x + gamepad1.left_stick_x);
        rightRear.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x - gamepad1.left_stick_x);
        rightFront.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x + gamepad1.left_stick_x);
    }
}
