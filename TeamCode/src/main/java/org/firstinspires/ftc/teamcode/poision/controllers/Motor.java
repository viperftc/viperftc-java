package org.firstinspires.ftc.teamcode.poision.controllers;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class Motor extends LinearOpMode{
    Motor(String map, NuetralMode mode, Direction direction)
    {
        DcMotor motor = hardwareMap.get(DcMotor.class, map);
        if(mode == NuetralMode.BRAKE) {

        } else {
            
        } if(direction == Direction.FORWARD) {
            motor.setDirection(DcMotor.Direction.FORWARD);
        } else{
            motor.setDirection(DcMotor.Direction.REVERSE);
        }
    }

    @Override
    public void runOpMode() throws InterruptedException {

    }
}
