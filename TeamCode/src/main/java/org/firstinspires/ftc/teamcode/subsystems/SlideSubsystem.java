package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class SlideSubsystem {
    private DcMotor leftSlide;
    private DcMotor rightSlide;

    private final HardwareMap hardwareMap;
    private Gamepad gamepad1;

    public SlideSubsystem(OpMode opMode){
        gamepad1 = opMode.gamepad1;
        hardwareMap = opMode.hardwareMap;
    }
    public void init(DcMotor leftSlide, DcMotor rightSlide, HardwareMap hw, OpMode opMode){
        gamepad1 = opMode.gamepad1;
        this.leftSlide = hw.get(DcMotor.class, "leftSlide");
        this.rightSlide = hw.get(DcMotor.class, "rightSlide");

        this.rightSlide.setDirection(DcMotorSimple.Direction.FORWARD);
        this.leftSlide.setDirection(DcMotorSimple.Direction.REVERSE);

        this.leftSlide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.rightSlide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void teleOpCommand(){
        if (gamepad1.dpad_down) {
            leftSlide.setPower(-.5);
            leftSlide.setTargetPosition(0);
            rightSlide.setPower(-.5);
            rightSlide.setTargetPosition(0);
        }
        //down
        else if (gamepad1.dpad_up) {
            leftSlide.setPower(.5);
            leftSlide.setTargetPosition(150);
            rightSlide.setPower(.5);
            rightSlide.setTargetPosition(150);
        }
        else  {
            leftSlide.setPower(0);
            rightSlide.setPower(0);
        }
    }
}
