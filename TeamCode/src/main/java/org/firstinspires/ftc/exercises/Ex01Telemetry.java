package org.firstinspires.ftc.exercises;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

/*
    Task:
    - Log the amount of elapsed time (seconds) to telemetry

    See:
    - https://ftctechnh.github.io/ftc_app/doc/javadoc/com/qualcomm/robotcore/util/ElapsedTime.html
    - https://ftctechnh.github.io/ftc_app/doc/javadoc/org/firstinspires/ftc/robotcore/external/Telemetry.html
*/

@TeleOp(name = "Exercise 01: Telemetry", group = "Exercises")
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

            String elapsedTimeSeconds = "";

            // END EDITING CODE

            telemetry.update();
        }
    }
}
