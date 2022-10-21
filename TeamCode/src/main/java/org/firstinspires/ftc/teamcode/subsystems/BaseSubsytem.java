package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class BaseSubsytem{
    public Gamepad gamepad1, gamepad2;
    public HardwareMap hardwareMap = null;
    public Telemetry telemetry;
    public ElapsedTime runtime  = new ElapsedTime();

    public void BaseSubsystem() {
    }

    // Initialize Hardware
    public void init(HardwareMap hardwareMap, Telemetry telemetry) {
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;
    }

    public void gamepadInit(Gamepad gamepad1, Gamepad gamepad2) {
        this.gamepad1 = gamepad1;
        this.gamepad2 = gamepad2;
    }
}
