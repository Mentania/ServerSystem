package de.tempoo50.system.utils;

public class ChestPlayer {

	private String uuid;
	private Long time;

	public ChestPlayer(String uuid, Long time) {
		this.uuid = uuid;
		this.time = time;
	}

	public String getUuid() {
		return uuid;
	}

	public Long getTime() {
		return time;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void setTime(Long time) {
		this.time = time;
	}

}