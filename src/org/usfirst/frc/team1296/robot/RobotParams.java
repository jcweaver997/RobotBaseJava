package org.usfirst.frc.team1296.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotBase;

public class RobotParams {
	public static String ROBOT_NAME = "base";
	public static String ROBOT_NICKNAME = "base";
	public static String ROBOT_VERSION = "1.0";
	public static RobotBase robotBase;
	
	public static boolean isAuto(){return robotBase.isAutonomous();}
	public static boolean isTeleop(){return robotBase.isOperatorControl();}
	public static boolean isTest(){return robotBase.isTest();}
	public static boolean isEnabled(){return robotBase.isEnabled();}
	public static boolean isDisabled(){return robotBase.isDisabled();}
	
	public static Joystick controller1 = new Joystick(0);
	public static float getDriveLeft(){
		return (float) controller1.getRawAxis(JoystickLayout.L310.THUMBSTICK_LEFT_Y);}
	public static float getDriveRight(){
		return (float) controller1.getRawAxis(JoystickLayout.L310.THUMBSTICK_RIGHT_Y);}
	
	public static final int DEFAULT_PRIORITY = 150;
	public static final int COMPONENT_PRIORITY 	= DEFAULT_PRIORITY;
	public static final int DRIVETRAIN_PRIORITY 	= DEFAULT_PRIORITY;
	public static final int AUTONOMOUS_PRIORITY 	= DEFAULT_PRIORITY;
	public static final int AUTOEXEC_PRIORITY 		= DEFAULT_PRIORITY;
	public static final int AUTOPARSER_PRIORITY 	= DEFAULT_PRIORITY;
	
	public static final String COMPONENT_TASKNAME	= "tComponent";
	public static final String DRIVETRAIN_TASKNAME	= "tDrive";
	public static final String AUTONOMOUS_TASKNAME	= "tAuto";
	public static final String AUTOEXEC_TASKNAME	= "tAutoEx";
	public static final String AUTOPARSER_TASKNAME	= "tParse";
	
	public static final int COMPONENT_STACKSIZE	= 0x10000;
	public static final int DRIVETRAIN_STACKSIZE	= 0x10000;
	public static final int AUTONOMOUS_STACKSIZE	= 0x10000;
	public static final int AUTOEXEC_STACKSIZE		= 0x10000;
	public static final int AUTOPARSER_STACKSIZE	= 0x10000;
	
	public static final String COMPONENT_QUEUE 	= "/tmp/qComp";
	public static final String DRIVETRAIN_QUEUE 	= "/tmp/qDrive";
	public static final String AUTONOMOUS_QUEUE 	= "/tmp/qAuto";
	public static final String AUTOPARSER_QUEUE 	= "/tmp/qParse";
	
	public static final int PWM_DRIVETRAIN_LEFT_MOTOR = 1;
	public static final int PWM_DRIVETRAIN_RIGHT_MOTOR = 0;
	
	public static final int CAN_PDB = 0;
	public static final int CAN_DRIVETRAIN_LEFT_MOTOR = 2;
	public static final int CAN_DRIVETRAIN_RIGHT_MOTOR = 8;
	
	public static final int JOYSTICK_BUTTON_COUNT = 10;
	public static final int JOYSTICK_AXIS_COUNT = 5;
	
	public static final int POV_STILL = -1;
	
	
	
}
