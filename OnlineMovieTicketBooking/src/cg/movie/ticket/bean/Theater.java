package cg.movie.ticket.bean;

public class Theater {	
	 Integer theaterId;
	 String theaterName;
	 String theaterCity;
	 String managerName;
	 Integer managerContact;
	 
	 public Theater() {
		 
	 }
	public Theater(Integer theaterId, String theaterName, String theaterCity, String managerName,
			Integer managerContact) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.theaterCity = theaterCity;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}
	public Integer getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(Integer theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterCity() {
		return theaterCity;
	}
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}

	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Integer getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(Integer managerContact) {
		this.managerContact = managerContact;
	}


}
