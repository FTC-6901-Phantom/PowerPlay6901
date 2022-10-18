//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//
//public class Devices {
//    DcMotor leftFront;
//    DcMotor leftRear;
//    DcMotor rightFront;
//    DcMotor rightRear;
//    HardwareMap hardwareMap;
//
//    public Devices(HardwareMap hardwareMap) {
//        this.hardwareMap = hardwareMap;
//    }
//
//    public void init() {
//        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
//        leftRear = hardwareMap.get(DcMotor.class, "leftRear");
//        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
//        rightRear = hardwareMap.get(DcMotor.class, "rightRear");
//
//        rightFront.setDirection(DcMotorSimple.Direction.REVERSE);
//        rightRear.setDirection(DcMotorSimple.Direction.REVERSE);
//        leftFront.setDirection(DcMotorSimple.Direction.FORWARD);
//        leftRear.setDirection(DcMotorSimple.Direction.FORWARD);
//    }
//}
