package org.usfirst.frc.team1296.robot;

public class JoystickLayout {

	// Logitech 310
	public static class L310{
		public static int BUTTON_A				=	1;
		public static int BUTTON_B				=	2;
		public static int BUTTON_X				=	3;
		public static int BUTTON_Y				=	4;
		public static int BUTTON_BUMPER_LEFT	=	5;
		public static int BUTTON_BUMPER_RIGHT	=	6;
		public static int BUTTON_STOP			=	7;
		public static int BUTTON_START			=	8;
		public static int BUTTON_THUMB_LEFT		=	9;
		public static int BUTTON_THUMB_RIGHT	=	10;

		public static int THUMBSTICK_LEFT_X		=	0;
		public static int THUMBSTICK_LEFT_Y		=	1;
		public static int THUMBSTICK_RIGHT_X	=	4;
		public static int THUMBSTICK_RIGHT_Y	=	5;

		public static int POV					=	1;  //D-pad
		public static int TRIGGER_LEFT			=	2;	// value > 0
		public static int TRIGGER_RIGHT			=	3;	// value < 0
	}
	
	// Playstation Controller
	public static class PS{
		public static int BTN_SQR				=	1;
		public static int BTN_CRS				=	2;
		public static int BTN_CRCL				=	3;
		public static int BTN_TRNGL				=	4;
		public static int BTN_BMP_LFT			=	5;
		public static int BTN_BMP_RGHT			=	6;
		public static int BTN_TRGR_LFT			=	7;
		public static int BTN_TRGR_RGHT			=	8;
		public static int BTN_SLCT				=	9;
		public static int BTN_STRT				=	10;
		public static int BTN_STCK_LFT			=	11;		//Untested
		public static int BTN_STCK_RGHT			=	12;		//Untested
		public static int AXS_STCK_LFT_X		=	1;
		public static int AXS_STCK_LFT_Y		=	2;		//Inverted
		public static int AXS_STCK_RGHT_X		=	3;
		public static int AXS_STCK_RGHT_Y		=	4;		//Inverted
		public static int AXS_HT_X				=	5;
		public static int AXS_HT_Y				=	6;		//Inverted
	}
	
	// Xbox Controller
	public static class XBX{
		public static int BTN_A					=	1;
		public static int BTN_B					=	2;
		public static int BTN_X					=	3;
		public static int BTN_Y					=	4;
		public static int BTN_BMP_LFT			=	5;
		public static int BTN_BMP_RGHT			=	6;
		public static int BTN_BCK				=	7;
		public static int BTN_STRT				=	8;
		public static int BTN_STCK_LFT			=	9;
		public static int BTN_STCK_RGHT			=	10;
		public static int AXS_STCK_LFT_X		=	1;
		public static int AXS_STCK_LFT_Y		=	2;		//Inverted
		public static int AXS_TRGR				=	3;		//Untested
		public static int AXS_STCK_RGHT_X		=	4;
		public static int AXS_STCK_RGHT_Y		=	5;		//Inverted
		public static int AXS_HT_X				=	6;
		public static int AXS_HT_Y				=	7;		//Inverted
	}
	
	// Logitech Extreme 3D Pro
	public static class X3D{
		public static int BTN_TRGR				=	1;
		public static int BTN_STCK_SIDE			=	2;
		public static int BTN_STCK_BTM_LFT		=	3;
		public static int BTN_STCK_BTM_RGHT		=	4;
		public static int BTN_STCK_TP_LFT		=	5;
		public static int BTN_STCK_TP_RGHT		=	6;
		public static int BTN_BSE_FR_LFT		=	7;
		public static int BTN_BSE_FR_RGHT		=	8;
		public static int BTN_BSE_MD_LFT		=	9;
		public static int BTN_BSE_MD_RGHT		=	10;
		public static int BTN_BSE_CLS_LFT		=	11;
		public static int BTN_BSE_CLS_RGHT		=	12;
		public static int AXS_STCK_X			=	1;
		public static int AXS_STCK_Y			=	2;		//Inverted
		public static int AXS_STCK_TWIST		=	3;		//Untested
		public static int AXS_THRTL				=	4;		//Inverted
		public static int AXS_HT_X				=	5;
		public static int AXS_HT_Y				=	6;		//Inverted
	}
	
	// Logitech Attack 3
	public static class ATK{
		public static int BTN_TRGR				=	1;
		public static int BTN_STCK_BTM			=	2;
		public static int BTN_STCK_MDL			=	3;
		public static int BTN_STCK_LFT			=	4;
		public static int BTN_STCK_RGHT			=	5;
		public static int BTN_BSE_LFT_FR		=	6;
		public static int BTN_BSE_LFT_CLS		=	7;
		public static int BTN_BSE_MDL_LFT		=	8;
		public static int BTN_BSE_MDL_RGHT		=	9;
		public static int BTN_BSE_RGHT_CLS		=	10;
		public static int BTN_BSE_RGHT_FR		=	11;
		public static int AXS_STCK_X			=	1;
		public static int AXS_STCK_Y			=	2;		//Inverted
		public static int AXS_THRTL				=	3;		//Inverted
	}
	
	/* 
	DPAD works like this (not sure which channel)

	-1: No Thumbpad Button
	0: North Thumbpad Button
	45: North-East Thumbpad Button
	90: East Thumbpad Button
	135: South-East Thumbpad Button
	180: South Thumbpad Button
	225: South-West Thumbpad Button
	270: West Thumbpad Button
	315: North-West Thumbpad Button 
	*/
}
