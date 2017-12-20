package com.zzq.inter;

public class CheckDatabase implements Check {
	
	private String output;
	
	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String check() {
		// TODO Auto-generated method stub
		return output + " Database check passes";
	}

}
