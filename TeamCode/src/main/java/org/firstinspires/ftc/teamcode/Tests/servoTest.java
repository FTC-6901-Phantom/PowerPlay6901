package org.firstinspires.ftc.teamcode.Tests;

//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.Servo;
//
//@TeleOp(name ="ServoTest")
//public class servoTest extends OpMode {
//
//    public static double BOX_HIGH = 0.8;
//    public static double BOX_LOW = 0.4;
//    //initilalize hardware
//    Servo servo = null;
//
//    @Override
//    public void init() {
//        servo = hardwareMap.get(Servo.class, "servoTesting");
//    }
//
//    @Override
//    public void loop() {
//        if(gamepad1.a){
//            servo.setPosition(BOX_HIGH);
//        }
//        else if(gamepad1.b){
//            servo.setPosition(BOX_LOW);
//        }
//    }
//}