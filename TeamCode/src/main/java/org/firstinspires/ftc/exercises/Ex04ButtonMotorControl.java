package org.firstinspires.ftc.exercises;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/*
    Tasks:
    - Set motor speed to 50% power forward when "A" is pressed
    - Set motor speed to 50% power backwards when "B" is pressed
    - When nothing is pressed, the motor should not spin
    - Log the status of button A, button B, and motor power to telemetry

    See:
    - https://ftctechnh.github.io/ftc_app/doc/javadoc/com/qualcomm/robotcore/hardware/Gamepad.html
    - https://ftctechnh.github.io/ftc_app/doc/javadoc/com/qualcomm/robotcore/hardware/DcMotorSimple.html#setPower-double-
 */

@TeleOp(name = "Exercise 04: Button Motor Control", group = "Exercises")
public class Ex04ButtonMotorControl extends LinearOpMode {
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        DcMotor motor = hardwareMap.dcMotor.get("motor_0");

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            // BEGIN EDITING CODE

            // END EDITING CODE

            telemetry.update();
        }
    }
}
