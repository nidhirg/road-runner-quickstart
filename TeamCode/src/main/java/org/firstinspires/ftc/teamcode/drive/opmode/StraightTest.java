package org.firstinspires.ftc.teamcode.drive.opmode;

import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDriveBase;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDriveREV;
import org.firstinspires.ftc.teamcode.drive.SampleTankDriveBase;
import org.firstinspires.ftc.teamcode.drive.SampleTankDriveREVOptimized;

/*
 * This is a simple routine to test translational drive capabilities. If this is *consistently*
 * overshooting or undershooting by a significant amount, check the constants in the drive class.
 */
@Autonomous(group = "drive")
public class StraightTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        SampleTankDriveBase drive = new SampleTankDriveREVOptimized(hardwareMap);

        Trajectory trajectory = drive.trajectoryBuilder()
                .forward(6000)
                .build();

        waitForStart();

        if (isStopRequested()) return;

        drive.followTrajectorySync(trajectory);
    }
}
