package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariableExamples extends OpMode {
    @Override
    public void init(){
        int TeamNumber = 21788;
        String teamName = "Beta Rocks";
        int motorAngle = 100;
        telemetry.addData("Team Number", TeamNumber);
        telemetry.addData("Name", teamName);
        telemetry.addData("motor's Angle is ", motorAngle );
    }
    @Override
    public void loop(){

    }

}
