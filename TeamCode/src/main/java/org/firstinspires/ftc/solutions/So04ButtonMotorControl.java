package org.firstinspires.ftc.solutions;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Solution 04: Button Motor Control", group = "Solutions")
@Disabled
public class So04ButtonMotorControl extends LinearOpMode {
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        DcMotor motor = hardwareMap.dcMotor.get("motor_0");

        // Wait for the game to start (driver presses PLAY)
        waitForStart();


        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            double motorPower = 0.0;

            if (gamepad1.a) {
                motorPower = 0.5;
            } else if (gamepad1.b) {
                motorPower = -0.5;
            }

            motor.setPower(motorPower);

            telemetry.addData("Button A pressed", gamepad1.a);
            telemetry.addData("Button B pressed", gamepad1.b);
            telemetry.addData("Motor speed", motorPower);

            telemetry.update();
        }
    }
}
