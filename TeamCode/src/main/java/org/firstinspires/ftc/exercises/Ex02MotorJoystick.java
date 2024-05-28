package org.firstinspires.ftc.exercises;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/*
    Tasks:
    - Log joystick input to telemetry
    - Set the motor power based on the joystick input

    When the joystick is not active, the motor should not spin.
    When the joystick is fully forward (or backward) the motor should be spinning at max power.

    See:
    - https://ftctechnh.github.io/ftc_app/doc/javadoc/com/qualcomm/robotcore/hardware/Gamepad.html
    - https://ftctechnh.github.io/ftc_app/doc/javadoc/com/qualcomm/robotcore/hardware/DcMotorSimple.html#setPower-double-

    Follow-up Tasks:
    - Scale joystick input to set motor power to be 0 - 50%
    - Set motor power to be: joystick_input ^ 3 (cubed)
      - How does this change the motor behavior?
 */

@TeleOp(name = "Exercise 02: Motor Joystick", group = "Exercises")
public class Ex02MotorJoystick extends LinearOpMode {
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
