package org.usfirst.frc.team1296.robot;

public class RobotMessage {
	
	public MessageCommand command;
	public String replyQ;
	MessageParams params;
	
public enum MessageCommand{
	COMMAND_UNKNOWN,					//COMMAND_UNKNOWN
	COMMAND_SYSTEM_MSGTIMEOUT,			//COMMAND_SYSTEM_MSGTIMEOUT
	COMMAND_SYSTEM_OK,					//COMMAND_SYSTEM_OK
	COMMAND_SYSTEM_ERROR,				//COMMAND_SYSTEM_ERROR

	COMMAND_ROBOT_STATE_DISABLED,		//Tells all components that the robot is disabled
	COMMAND_ROBOT_STATE_AUTONOMOUS,		//Tells all components that the robot is in auto
	COMMAND_ROBOT_STATE_TELEOPERATED,	//Tells all components that the robot is in teleop
	COMMAND_ROBOT_STATE_TEST,			//Tells all components that the robot is in test
	COMMAND_ROBOT_STATE_UNKNOWN,		//Tells all components that the robot's state is unknown

	COMMAND_AUTONOMOUS_RUN,				//Tells Autonomous to run
	COMMAND_AUTONOMOUS_COMPLETE,		//Tells all components that Autonomous is done running the script
	COMMAND_AUTONOMOUS_RESPONSE_OK,		//Tells Autonomous that a command finished running successfully
	COMMAND_AUTONOMOUS_RESPONSE_ERROR,	//Tells Autonomous that a command had a error while running
	COMMAND_CHECKLIST_RUN,				//Tells CheckList to run

	COMMAND_DRIVETRAIN_STOP,			//Tells Drivetrain to stop moving
	COMMAND_DRIVETRAIN_DRIVE,


	COMMAND_COMPONENT_TEST,				//COMMAND_COMPONENT_TEST

	COMMAND_LAST                      //COMMAND_LAST 
}
public class DriveParams{
	float left, right;
}

public class AutonomousParams{
	int uMode;
	int uDelay;
	///how long a function can run, maximum
	float timeout;
	///how long until a function performs
	float timein;

	///used by drivetrain for straight driving
	float driveSpeed;
	float driveDistance;
	float turnAngle;
	float driveTime;
}

public class MessageParams{
	DriveParams drive;
	AutonomousParams autonomous;
}

}
