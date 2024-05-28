package org.firstinspires.ftc.solutions;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Solution 03: Joystick Dead-zone", group = "Solutions")
@Disabled
public class So03JoystickDeadZone extends LinearOpMode {
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
            double motorPower = 0;

            if (leftStickInput > 0.1 || leftStickInput < -0.1) {
                motor.setPower(leftStickInput);
            }

            motor.setPower(motorPower);

            telemetry.addData("Left Joystick Y", leftStickInput);
            telemetry.addData("Motor power", motorPower);

            telemetry.update();
        }
    }
}
