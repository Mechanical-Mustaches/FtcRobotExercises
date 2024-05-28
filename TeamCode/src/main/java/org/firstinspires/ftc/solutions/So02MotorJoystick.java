package org.firstinspires.ftc.solutions;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Solution 02: Motor Joystick", group = "Solutions")
@Disabled
public class So02MotorJoystick extends LinearOpMode {
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        DcMotor motor = hardwareMap.dcMotor.get("motor_0");

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            double leftStickInput = gamepad1.left_stick_y;
            double motorPower = leftStickInput;
            // double motorPower = leftStickInput / 2;
            // double motorPower = Math.pow(leftStickInput, 3);

            telemetry.addData("Left Joystick Y", leftStickInput);
            telemetry.addData("Motor power", motorPower);

            motor.setPower(motorPower);

            telemetry.update();
        }
    }
}
