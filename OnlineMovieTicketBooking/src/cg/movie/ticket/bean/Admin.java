package cg.movie.ticket.bean;

import java.time.LocalDate;

public class Admin {
	
	private  String adminId;
	    private  String adminName;
		private  String adminPassword;
		private String adminContact;
		

		public Admin(){
			
		}
			
        public String getAdminId() {
			return adminId;
		}
		public void setAdminId(String adminId) {
			this.adminId = adminId;
		}
		public String getAdminName() {
			return adminName;
		}
		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}
		public String getAdminPassword() {
			return adminPassword;
		}
		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}

		public String getAdminContact() {
			return adminContact;
		}
		public void setAdminContact(String adminContact) {
			this.adminContact = adminContact;
		}
		
		 
		
		public Admin(String adminId, String adminName, String adminPassword,String adminContact, LocalDate dateOfBirth) {
			this.adminId = adminId;
			this.adminName = adminName;
			this.adminPassword = adminPassword;
			this.adminContact = adminContact;
		}


}
