package org.firstinspires.ftc.teamcode.subsystems;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Config

public class armSubsystem extends BaseSubsytem {
    //set positions
//    public static double ARM_UP = 0.0;
//    public static double ARM_DOWN = 0.0;

    //create hardware variables
    public Servo armLeft = null;
    public Servo armRight = null;

    //Constructer
    public armSubsystem() {

    }

    //Initialize hardware variables
    public void init(HardwareMap hardwareMap, Telemetry telemetry) {
        armLeft = hardwareMap.get(Servo.class, "armLeft");
        armRight = hardwareMap.get(Servo.class, "armRight");
    }
}
