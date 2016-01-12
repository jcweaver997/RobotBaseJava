package org.usfirst.frc.team1296.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotBase;

public abstract class RhsRobotBase extends RobotBase{
	
	private RobotOpMode currentRobotState;
	private RobotOpMode previousRobotState;
	private int loop;
	
	protected RobotMessage robotMessage;
	protected abstract void init();
	protected abstract void onStateChange();
	protected abstract void run();
	
	public enum RobotOpMode
	{
		ROBOT_STATE_DISABLED,
		ROBOT_STATE_AUTONOMOUS,
		ROBOT_STATE_TELEOPERATED,
		ROBOT_STATE_TEST,
		ROBOT_STATE_UNKNOWN
	}
	
	public RhsRobotBase(){
		RobotParams.robotBase = this;
		
		previousRobotState = RobotOpMode.ROBOT_STATE_UNKNOWN;
		currentRobotState = RobotOpMode.ROBOT_STATE_UNKNOWN;
		
		loop = 0;
	}
	
	public void startCompetition(){
		DriverStation ds = DriverStation.getInstance();
		init();
		while(true){
			if(ds.isNewControlData())
			{
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {e.printStackTrace();}
				continue;
			}
			
			if(isDisabled())
			{
				currentRobotState = RobotOpMode.ROBOT_STATE_DISABLED;
			}
			else if(isEnabled() && isAutonomous())
			{
				currentRobotState = RobotOpMode.ROBOT_STATE_AUTONOMOUS;
			}
			else if(isEnabled() && isOperatorControl())
			{
				currentRobotState = RobotOpMode.ROBOT_STATE_TELEOPERATED;
			}
			else if(isEnabled() && isTest())
			{
				currentRobotState = RobotOpMode.ROBOT_STATE_TEST;
			}
			else
			{
				currentRobotState = RobotOpMode.ROBOT_STATE_UNKNOWN;
			}
			
			if(hasStateChanged())
			{
				switch(getCurrentRobotState())
				{
				case ROBOT_STATE_DISABLED:
					System.out.print("ROBOT_STATE_DISABLED\n");
					robotMessage.command = RobotMessage.MessageCommand.COMMAND_ROBOT_STATE_DISABLED;
					break;
				case ROBOT_STATE_AUTONOMOUS:
					System.out.print("ROBOT_STATE_AUTONOMOUS\n");
					robotMessage.command = RobotMessage.MessageCommand.COMMAND_ROBOT_STATE_AUTONOMOUS;
					break;
				case ROBOT_STATE_TELEOPERATED:
					System.out.print("ROBOT_STATE_TELEOPERATED\n");
					robotMessage.command = RobotMessage.MessageCommand.COMMAND_ROBOT_STATE_TELEOPERATED;
					break;
				case ROBOT_STATE_TEST:
					System.out.print("ROBOT_STATE_TEST\n");
					robotMessage.command = RobotMessage.MessageCommand.COMMAND_ROBOT_STATE_TEST;
					break;
				case ROBOT_STATE_UNKNOWN:
					System.out.print("ROBOT_STATE_UNKNOWN\n");
					robotMessage.command = RobotMessage.MessageCommand.COMMAND_ROBOT_STATE_UNKNOWN;
					break;
				}

				onStateChange();			//Handles the state change
			}
			
			if(isEnabled())
			{
				if((currentRobotState == RobotOpMode.ROBOT_STATE_TELEOPERATED) || 
						(currentRobotState == RobotOpMode.ROBOT_STATE_TEST) ||
						(currentRobotState == RobotOpMode.ROBOT_STATE_AUTONOMOUS))
				{
					run();			//Robot logic
				}
			}
			
			previousRobotState = currentRobotState;
			
			++loop;
		}
	}
	
	public RobotOpMode getCurrentRobotState(){
		return currentRobotState;
	}
	
	public RobotOpMode getPreviousRobotState(){
		return previousRobotState;
	}
	
	public boolean hasStateChanged(){
		return (previousRobotState != currentRobotState);
	}
	
	public int getLoop(){
		return loop;
	}

	
}
