package com.nanospark.cnc;

import java.util.ArrayList;

public class GlobalData {
	private static GlobalData instance = null;
	
	//ArrayLists of Data.
	public ArrayList<MachineProfile> machineProfileList = new ArrayList<MachineProfile>();

	protected GlobalData() {
		// Exists only to defeat instantiation.
	}

	public static GlobalData getInstance() {
		if (instance == null) {
			instance = new GlobalData();
		}
		return instance;
	}

	public ArrayList<MachineProfile> getMachineProfileList() {
		return machineProfileList;
	}

	public void setMachineProfileList(ArrayList<MachineProfile> machineProfileList) {
		this.machineProfileList = machineProfileList;
	}
	
	
}