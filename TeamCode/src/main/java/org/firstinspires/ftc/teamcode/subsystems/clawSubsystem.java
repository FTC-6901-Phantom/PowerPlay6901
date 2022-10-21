package org.firstinspires.ftc.teamcode.subsystems;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Config
public class clawSubsystem extends BaseSubsytem{
    //values

    // create hardware variables
    public Servo clawLeft = null;
    public Servo clawRight = null;
    //Constructer
    public void clawSubsystem() {

    }

    //Initialize hardware variables
    public void init(HardwareMap hardwareMap, Telemetry telemetry) {
        clawLeft = hardwareMap.get(Servo.class, "clawLeft");
        clawRight = hardwareMap.get(Servo.class, "clawRight");

    }
}