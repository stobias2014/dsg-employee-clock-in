package com.tobias.saul.model;

import org.joda.time.DateTime;

public class DsgEmployee {
	
	private Integer id;
	private String name;
	private DateTime clockInTime;
	private DateTime lunchOutTime;
	private DateTime lunchInTime;
	private DateTime clockOutTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public DateTime getClockInTime() {
		return clockInTime;
	}
	public void setClockInTime(DateTime clockInTime) {
		this.clockInTime = clockInTime;
	}
	public DateTime getLunchOutTime() {
		return lunchOutTime;
	}
	public void setLunchOutTime(DateTime lunchOutTime) {
		this.lunchOutTime = lunchOutTime;
	}
	public DateTime getLunchInTime() {
		return lunchInTime;
	}
	public void setLunchInTime(DateTime lunchInTime) {
		this.lunchInTime = lunchInTime;
	}
	public DateTime getClockOutTime() {
		return clockOutTime;
	}
	public void setClockOutTime(DateTime clockOutTime) {
		this.clockOutTime = clockOutTime;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clockInTime == null) ? 0 : clockInTime.hashCode());
		result = prime * result + ((clockOutTime == null) ? 0 : clockOutTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lunchInTime == null) ? 0 : lunchInTime.hashCode());
		result = prime * result + ((lunchOutTime == null) ? 0 : lunchOutTime.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DsgEmployee other = (DsgEmployee) obj;
		if (clockInTime == null) {
			if (other.clockInTime != null)
				return false;
		} else if (!clockInTime.equals(other.clockInTime))
			return false;
		if (clockOutTime == null) {
			if (other.clockOutTime != null)
				return false;
		} else if (!clockOutTime.equals(other.clockOutTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lunchInTime == null) {
			if (other.lunchInTime != null)
				return false;
		} else if (!lunchInTime.equals(other.lunchInTime))
			return false;
		if (lunchOutTime == null) {
			if (other.lunchOutTime != null)
				return false;
		} else if (!lunchOutTime.equals(other.lunchOutTime))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DsgEmployee [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
