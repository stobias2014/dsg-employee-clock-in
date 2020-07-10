package com.tobias.saul.time;

import org.joda.time.DateTime;

import com.tobias.saul.model.DsgEmployee;

public class DsgEmployeeTimer {
	
	public void clockIn(DsgEmployee employee) {
		DateTime clockInTime = DateTime.now();
		employee.setClockInTime(clockInTime);
	}
	
	public void lunchOut(DsgEmployee employee) {
		DateTime lunchOutTime = DateTime.now();
		employee.setLunchOutTime(lunchOutTime);
	}
	
	public void lunchIn(DsgEmployee employee) {
		DateTime lunchInTime = DateTime.now();
		employee.setLunchInTime(lunchInTime);
	}
	
	public void clockOut(DsgEmployee employee) {
		DateTime clockOutTime = DateTime.now();
		employee.setClockOutTime(clockOutTime);
	}
	
	public void calculateTotalHoursforWeek() {
		// TODO calculate the hours of employee for the week
	}

}
