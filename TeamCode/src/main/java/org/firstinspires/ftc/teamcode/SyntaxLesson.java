package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "SyntaxLesson", group = "4008")
public class SyntaxLesson extends LinearOpMode {
    Team4008HM2025 robot = new Team4008HM2025();

    @Override
    public void runOpMode() {
        robot.Map(hardwareMap);

        telemetry.addData("Say", "TeleOp Starting");
        telemetry.update();

        //Set encoder modes here

        double number = 0;

        waitForStart();

        while (opModeIsActive()) {

            robot.motor.setPower(0.5);

            //Data Types
            int eger = 1;
            double orNothing = 0.462;
            float point = 3.54f;    //f is needed to specify it is a float and not a double
            boolean trueFalse = true;
            String words = "Isabella is super cool and awesome";

            DcMotor motor = null;

            //Java is case sensitive so make sure you capitalize everything correctly
            // = assigns a value
            orNothing = 0.3481;

            //You can do Math with varables!!
            double num1 = 3.0;
            double num2 = 6.0;

            System.out.println(num1 + num2); //Outputs 9.0
            System.out.println(num1 - num2); //Outputs -3.0
            System.out.println(num1 * num2); //Outputs 18.0
            System.out.println(num1 / num2); //Outputs 0.5
            System.out.println(words);

            double num3 = num1 + num2/2;
            num3++;

            //Pop quiz!
            /*
                ----------------------------------------------------------------------------------------------
                Match the according datatype with the number it can store. Some numbers have multiple answers!

                a) int                     1) -0.38
                b) double                  2) false
                c) String                  3) "465"
                D) boolean                 4) 100

                ---------------------------------------------------------------------------------------------
                What would these output?

                double myDouble = 5.0;
                System.out.println(myDouble + 3 * 2);

                a) 5.0      b) 16.0     c) 11.0     d) 11

                ---------------------------------------------------------------------------------------------

             */


            //If Statements

            if(gamepad1.a){
               System.out.println("Robot Move");
            }


            if(gamepad1.b){
                number = number + 1;
                //number++; does the same thing
            } else if (gamepad1.x){
                number = number - 1;
                //number--; does the same thing
            }

            //Short Hand If Statement
            boolean speedslow = gamepad1.right_bumper;
             //                 What         T     F
            double motorSpeed = speedslow ? 0.5 : 1.0;


            //Loops
            for (int i = 0; i < 5; i++){
                System.out.println("this repeated " + i + "time");
            }

            Boolean isPressed = false;
            while (gamepad2.b){
                isPressed = true;
            }

            //show methods in the autos
        }
    }
}