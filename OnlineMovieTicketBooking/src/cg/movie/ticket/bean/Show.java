package cg.movie.ticket.bean;

public class Show {
	Integer showId;
	String showStartTime;
	String showEndTime;
    String showName;
    Integer screeenId;
    Integer theeaterId;
	
	
	public Show(Integer showId, String showName, Integer screeenId, Integer theeaterId, String showStartTime, String showEndTime) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showName = showName;
		this.screeenId = screeenId;
		this.theeaterId = theeaterId;
	}
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Integer getScreeenId() {
		return screeenId;
	}
	public void setScreeenId(Integer screeenId) {
		this.screeenId = screeenId;
	}
	public Integer getTheeaterId() {
		return theeaterId;
	}
	public void setTheeaterId(Integer theeaterId) {
		this.theeaterId = theeaterId;
	}
    

	public String getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(String showStartTime) {
		this.showStartTime = showStartTime;
	}
	public String getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(String showEndTime) {
		this.showEndTime = showEndTime;
}
	
}
