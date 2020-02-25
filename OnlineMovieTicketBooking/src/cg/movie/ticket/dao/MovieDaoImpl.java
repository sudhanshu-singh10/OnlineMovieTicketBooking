package cg.movie.ticket.dao;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import cg.movie.ticket.bean.Admin;
import cg.movie.ticket.bean.Movie;
import cg.movie.ticket.bean.Screen;
import cg.movie.ticket.bean.Show;
import cg.movie.ticket.bean.Theater;

public class MovieDaoImpl {
	List<Admin> aList = new ArrayList<Admin>();
	List<Theater> tList= new ArrayList<Theater>();
	List<Movie> mList= new ArrayList<Movie>();
	List<Screen> sList= new ArrayList<Screen>();
	List<Show> shList= new ArrayList<Show>();
	
	public  MovieDaoImpl() {
		aList.add(new Admin("1234", "Admin1", "admin@123", "8765456789", LocalDate.of(1995, Month.JULY, 10 )));
		aList.add(new Admin("1231", "Admin2", "admin@123", "8765456789", LocalDate.of(1996, Month.AUGUST, 15 )));
		aList.add(new Admin("1321", "Admin3", "admin@123", "8765456789", LocalDate.of(1997, Month.NOVEMBER, 22 )));
		aList.add(new Admin("1123", "Admin4", "admin@123", "8765456789", LocalDate.of(1998, Month.JANUARY, 17 )));
		
	}
	public List<Admin> getAdminData(){
		return aList;
	}
	
	 public void setTheaterData(Theater the )
	 {
		 tList.add(the);
	 }
	 
	 public List<Theater> getTheaterData(){
		 return tList;
	 }
	 
	 public void setMovieData(Movie mov)
	 {
		 mList.add(mov);
	 }
	 
	 public List<Movie> getMovieData(){
			return mList;
		}
	 
	 public void setScreenData(Screen scr)
	 {
		 sList.add(scr);
	 }
	 
	 public List<Screen> getScreenData(){
			return sList;
		}
	 
	 public void setShowData(Show sh)
	 {
		 shList.add(sh);
	 }
	 
	 public List<Show> getShowData(){
			return shList;
		}
	 
	 
	 
	 
}
