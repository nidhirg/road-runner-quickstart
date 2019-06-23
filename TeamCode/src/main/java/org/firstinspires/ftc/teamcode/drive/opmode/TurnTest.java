package org.firstinspires.ftc.teamcode.drive.opmode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDriveBase;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDriveREV;
import org.firstinspires.ftc.teamcode.drive.SampleTankDriveBase;
import org.firstinspires.ftc.teamcode.drive.SampleTankDriveREVOptimized;

/*
 * This is a simple routine to test turning capabilities. If this is consistently overshooting or
 * undershooting by a significant amount, re-run OldTrackWidthTuner.
 */
@Autonomous(group = "drive")
public class TurnTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        SampleTankDriveBase drive = new SampleTankDriveREVOptimized(hardwareMap);

        waitForStart();

        if (isStopRequested()) return;

        drive.turnSync(Math.toRadians(90));
    }
}
