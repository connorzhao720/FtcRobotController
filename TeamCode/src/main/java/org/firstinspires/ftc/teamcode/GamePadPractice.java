package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamePadPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double sumOfTriggers = gamepad1.left_trigger - gamepad1.right_trigger;
        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData("y", speedForward);
        telemetry.addData("Difference of left x and right x", gamepad1.left_stick_x - gamepad1.right_stick_x);
        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b button", gamepad1.b);
        telemetry.addData("right joystick x", gamepad1.right_stick_x);
        telemetry.addData("right joystick y", gamepad1.right_stick_y);
        telemetry.addData("sumofTriggers", sumOfTriggers);
    }
}
