// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public final class DriveConstants {
        public static final int FRONT_LEFT = 15; //14
        public static final int BACK_LEFT = 14; //15
        public static final int BACK_RIGHT = 13; //12
        public static final int FRONT_RIGHT = 12; //13

        public static final double ks = 0;
        public static final double kv = 0;
        public static final double ka = 0;

        public static final double kP = 0;

        public static final double maxSpeedMetersPerSecond = 3;
        public static final double maxAccelerationMetersPerSecondSquared = 3;
        //public static final Translation2d FRONT_LEFT_LOCATION = new Translation2d(1, 1);
    }

    public static final class Misc {
        public static final int BACK_MOTOR = 41;
    }

    public static final class BuildConstants {
        public static final double WHEEL_TO_CENTER_SIDE_INCHES = 12.5; //From the side
        public static final double WHEEL_TO_CENTER_FRONT_INCHES = 9.75; //From the front
        public static final double INCHES_TO_METERS = 0.0254;
        public static final double GR = 12;
        public static final double WHEEL_CIRCUMFERENCE = 6 * Math.PI;
        public static final double INCHES_PER_REVOLUTION = WHEEL_CIRCUMFERENCE / GR;
    }

}