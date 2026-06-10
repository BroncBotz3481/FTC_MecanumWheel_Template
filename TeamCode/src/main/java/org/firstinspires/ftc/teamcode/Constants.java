package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;

import com.qualcomm.robotcore.hardware.HardwareMap;

// the following constants are simply examples of possible constants and might not be used! this is is simply a proof of concept
public class Constants {

    public class AutoTimeBasedConstants {
        public static final AutoName = "Team4008AutoTimeBased"
        public static final group = "4008"
    }

    public class movementMethods {
        Team4008HM2025 robot = new Team4008HM2025();
        HardwareMap hwMap = null;
        hwMap = hardwareMap;
        public void moveLeft(double power) {
            robot.DriveLeftFront.setPower(power);
            robot.DriveRightFront.setPower(-power);
            robot.DriveLeftBack.setPower(-power);
            robot.DriveRightBack.setPower(power);
        }
//
        public void moveRight(double power) {
            // Left Wheels                         //Right Wheels
            robot.DriveLeftFront.setPower(-power);
            robot.DriveRightFront.setPower(power);
            robot.DriveLeftBack.setPower(power);
            robot.DriveRightBack.setPower(-power);
        }

        public void moveForward(double power) {
            // Left Wheels                         //Right Wheels
            robot.DriveLeftFront.setPower(power);
            robot.DriveRightFront.setPower(power);
            robot.DriveLeftBack.setPower(power);
            robot.DriveRightBack.setPower(power);
        }

        public void moveBackward(double power) {
            // Left Wheels                         //Right Wheels
            robot.DriveLeftFront.setPower(-power);
            robot.DriveRightFront.setPower(-power);
            robot.DriveLeftBack.setPower(-power);
            robot.DriveRightBack.setPower(-power);
        }

        public void stopDriveTrainMotors() {
            // Left Wheels                         //Right Wheels
            robot.DriveLeftFront.setPower(0);
            robot.DriveRightFront.setPower(0);
            robot.DriveRightBack.setPower(0);
            robot.DriveLeftBack.setPower(0);

        }

    }
}
