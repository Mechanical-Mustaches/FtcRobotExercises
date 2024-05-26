package org.firstinspires.ftc.solutions;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name="Solution 01: Telemetry", group="Solutions")
@Disabled
public class So01Telemetry extends LinearOpMode {
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
            String elapsedTimeSeconds = elapsedTime.seconds() + " seconds";
            telemetry.addData("Elapsed Time", elapsedTimeSeconds);
            telemetry.update();
        }
    }
}
