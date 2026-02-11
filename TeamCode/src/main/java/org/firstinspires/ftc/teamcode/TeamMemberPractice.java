package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeamMemberPractice extends OpMode {
    boolean initDone;
    @Override
    public void loop() {
        double yAxis = gamepad1.left_stick_y;

        telemetry.addData("left stick Normal", yAxis);

        yAxis = squareInputWithSign(yAxis);

        telemetry.addData("left stick modified", yAxis);
    }
    double squareInputWithSign(double input){
        double output = input * input;
        if (input < 0){
            output *=-1;
        }
        return output;
    }
    @Override
    public void init() {
        telemetry.addData("init", initDone);
        initDone = true;
    }
}
