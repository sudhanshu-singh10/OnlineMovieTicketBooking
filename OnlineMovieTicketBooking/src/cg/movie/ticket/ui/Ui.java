package cg.movie.ticket.ui;
import cg.movie.ticket.service.ServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import cg.movie.ticket.bean.Admin;
import cg.movie.ticket.bean.Movie;
import cg.movie.ticket.bean.Screen;
import cg.movie.ticket.bean.Show;
import cg.movie.ticket.bean.Theater;
import cg.movie.ticket.exception.InvalidChoiceException;

public class Ui {
	InputStreamReader isr;
	BufferedReader bsr;
	ServiceImpl si;
	List<Admin> adminList;
	Admin currentAdmin;
	Scanner sc= new Scanner(System.in);
	
	
	public static void main(String[] args) {

		Ui u = new Ui();
		u.isr = new InputStreamReader(System.in);
		u.bsr = new BufferedReader(u.isr);

		u.si = new ServiceImpl();
		u.MovieTicket();
	}

		public void MovieTicket() {

		try {

			System.out.println(
					"**Welcome to Online Movie Ticket Booking**  \n 1. AdminLogin \n 2. Exit from Application ");
			int choice = Integer.parseInt(bsr.readLine());
			switch (choice) {
			
			case 1:
				AdminLogin();
			    break;
			case 2:
				System.exit(0);
				break;
			default:
				   System.out.println("Please choose a valid option");
                   MovieTicket(); 
                   break;
			}

		} catch (Exception e) {
                  e.printStackTrace();
		}

	}

   
		private void AdminLogin() {

		try {
			System.out.print("Enter your AdminId : ");
			String id = bsr.readLine();
			System.out.print("Enter your password : ");
			String password = bsr.readLine();

			currentAdmin = si.AdminLogin(id, password);

			if (currentAdmin != null) {

				try {

					int choice1 = 0;
					do {
						System.out.println(
								" 1. add Theater \n 2. delete Theater \n 3. add Movie \n 4. delete Movie \n 5. add Screen \n 6. delete Screen \n 7. add Show \n 8. delete Show \n 9. LogOut");
						choice1 = Integer.parseInt(bsr.readLine());
						switch (choice1) {
						case 1:         
							System.out.print("Enter theaterCity : ");
				            String theaterCity = bsr.readLine();
				            System.out.print("Enter theaterId : ");
			                Integer theaterId = Integer.parseInt(bsr.readLine());
			                System.out.print("Enter  theaterName : ");
			                String theaterName = bsr.readLine();
			                System.out.print("Enter managerName : ");
			                String managerName = bsr.readLine();
			                System.out.print("Enter managerContact : ");
			                Integer managerContact = Integer.parseInt(bsr.readLine());
			                   si.addTheater(new Theater(theaterId, theaterName,theaterCity,managerName,managerContact));
							break;
							
						case 2:
							System.out.println("enter theaterId you want to delete");
				            Integer tId= Integer.parseInt(bsr.readLine());
						        si.deleteTheater(tId);
						    break;
						    
						case 3:
							System.out.print("Enter movieName : ");
				            String movieName = bsr.readLine();
				            System.out.print("Enter movieId : ");
			                Integer movieId = Integer.parseInt(bsr.readLine());
			                System.out.println("Enter the Movie Release Date");
			                String date = bsr.readLine();
			                System.out.print("Enter  movieLength: ");
			                String movieLength = bsr.readLine();
			                System.out.print("Enter languages : ");
			                String languages = bsr.readLine();
			                   si.addMovie(new Movie(movieId, movieName, movieLength, languages, date));
							break;
                           
						case 4:
							System.out.println("enter movieId you want to delete");
				            Integer mId= Integer.parseInt(bsr.readLine());
						        si.deleteMovie(mId);
							
							break;

						case 5:   
							System.out.print("Enter theaterId : ");
		                    Integer theatreId = Integer.parseInt(bsr.readLine());
		                    System.out.print("Enter  screenId: ");
		                    Integer screenId = Integer.parseInt(bsr.readLine());
							System.out.print("Enter screenName : ");
				            String screenName = bsr.readLine();
			                System.out.print("Enter no. of rows : ");
			                Integer rows = Integer.parseInt(bsr.readLine());
			                System.out.print("Enter no. of rows : ");
			                Integer columns = Integer.parseInt(bsr.readLine());
			                   si.addScreen(new Screen(theatreId, screenId, screenName, rows, columns));
							break;
							

						case 6:

							System.out.println("enter screenId you want to delete");
				            Integer sId= Integer.parseInt(bsr.readLine());
						        si.deleteScreen(sId);
							break;
							
						case 7:
                            System.out.print("Enter theaterId : ");
		                    Integer theeaterId = Integer.parseInt(bsr.readLine());
		                    System.out.print("Enter  screenId: ");
		                    Integer screeenId = Integer.parseInt(bsr.readLine());
		                    System.out.print("Enter showId: ");
			                Integer showId = Integer.parseInt(bsr.readLine());
							System.out.print("Enter showName : ");
				            String showName = bsr.readLine();
				            System.out.print("Enter Show Start Time : ");
				            String showStartTime = bsr.readLine();
				            System.out.print("Enter Show End Time : ");
				            String showEndTime = bsr.readLine();
			               
			                   si.addShow(new Show(showId,  showName, screeenId, theeaterId, showStartTime, showEndTime));
							break;

						case 8:
							System.out.println("enter showId you want to delete");
				            Integer shId= Integer.parseInt(bsr.readLine());
						        si.deleteShow(shId);
							break;
						case 9:
							MovieTicket();
							break;	
                          default:
                        	   try {
                        	    	throw new InvalidChoiceException(" Invalid Input....Please Login Again ");
                        	    }catch (InvalidChoiceException ice) {
                        	    	System.out.println(ice);
                        	    }
                        	  AdminLogin();
                        	  
						}
					} while (choice1 != 9);

				} catch (Exception e) {
                         e.printStackTrace();
				}

			}else {
				MovieTicket();
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
}
