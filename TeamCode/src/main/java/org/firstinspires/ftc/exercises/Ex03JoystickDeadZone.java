package org.firstinspires.ftc.exercises;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/*
    Occasionally, joystick controllers will have drift (https://www.makeuseof.com/what-is-joystick-drift/).
    We want to prevent our robot motors from getting very low amounts of power if our
    game-controller joysticks have a small amount of drift.

    Tasks:
    - Set the motor power based on the joystick input
    - IGNORE joystick inputs if they are smaller than 10%
    - Log joystick input and motor power to telemetry

    When the joystick is not active (or in the dead-zone), the motor should not spin.
    When the joystick is fully forward (or backward) the motor should be spinning at max power.

    See:
    - https://ftctechnh.github.io/ftc_app/doc/javadoc/com/qualcomm/robotcore/hardware/Gamepad.html
    - https://ftctechnh.github.io/ftc_app/doc/javadoc/com/qualcomm/robotcore/hardware/DcMotorSimple.html#setPower-double-
*/

@TeleOp(name = "Exercise 03: Joystick Dead-zone", group = "Exercises")
public class Ex03JoystickDeadZone extends LinearOpMode {
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

            // BEGIN EDITING CODE

            // END EDITING CODE

            telemetry.update();
        }
    }
}
