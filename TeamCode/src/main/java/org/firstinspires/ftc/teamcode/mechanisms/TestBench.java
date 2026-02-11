package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    private DcMotor motor;
    private double ticksPerRev; // revolution

    public void init(HardwareMap hwMap){
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        ticksPerRev = motor.getMotorType().getTicksPerRev();
    }

    public void setMotorSpeed(double speed){
        motor.setPower(speed);
    }
    public double getMotorRevs() {
        return motor.getCurrentPosition() / ticksPerRev;
    }
    public void setMotorZeroBehavior(DcMotor.ZeroPowerBehavior zeroPowerBehavior){
        motor.setZeroPowerBehavior(zeroPowerBehavior);
    }
}
