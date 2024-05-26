package org.firstinspires.ftc.exercises;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name="Exercise 01: Telemetry", group="Exercises")
public class Ex01Telemetry extends LinearOpMode {
    private final ElapsedTime elapsedTime = new ElapsedTime();

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        elapsedTime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            // BEGIN EDITING CODE
            // See https://ftctechnh.github.io/ftc_app/doc/javadoc/com/qualcomm/robotcore/util/ElapsedTime.html
            // See ElapsedTime#seconds

            String elapsedTimeSeconds = "-1 seconds";

            // END EDITING CODE

            telemetry.addData("Elapsed Time", elapsedTimeSeconds);
            telemetry.update();
        }
    }
}
