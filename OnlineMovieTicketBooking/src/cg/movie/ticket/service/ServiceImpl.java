package cg.movie.ticket.service;
import cg.movie.ticket.bean.Admin;
import cg.movie.ticket.bean.Movie;
import cg.movie.ticket.bean.Screen;
import cg.movie.ticket.bean.Show;
import cg.movie.ticket.bean.Theater;
import cg.movie.ticket.dao.MovieDaoImpl;

import java.util.List;


public class ServiceImpl implements  ServiceIntf{
	MovieDaoImpl mImpl=new MovieDaoImpl();
	List<Admin> aList =mImpl.getAdminData();
	List<Theater> tList= mImpl.getTheaterData();
	List<Movie> mList= mImpl.getMovieData();
	List<Screen> sList= mImpl.getScreenData();
	List<Show> shList= mImpl.getShowData();
	
	
	@Override
	public Admin AdminLogin(String id, String pass) {
		boolean flag = false;
		Admin currentAdmin = null;
		for (Admin u : aList) {
			if (u.getAdminId().equals(id) && u.getAdminPassword().equals(pass)) {
				flag = true;
				currentAdmin = u;
				break;
			
			}
			
		}

		if (flag) {
                 System.out.println("You are successfully logged in");
                 System.out.println();
			return currentAdmin;
		} else {
			System.out.println("Invalid AdminId & Password.....\n Please login again");

			return null;
		}

	}
	
	@Override
	public void addTheater(Theater theater) {
       mImpl.setTheaterData(theater);       
       System.out.println("You have successfully added a Theater");
 }
	
	@Override
	public void deleteTheater(Integer tId) {
		Theater t1=null;
		int key=-1;
    for(Theater t:tList) {
		if(t.getTheaterId().equals(tId)) {
	        key++;
	        t1=t;
	        break;
		}
    }
    tList.remove(key);

	System.out.println("You have successfully removed "+ t1.getTheaterName() +" Theater");
  }
	
	
	public void addMovie(Movie movie) {
		 mImpl.setMovieData(movie);   
        System.out.println("You have successfully added a Movie");


}
	
	@Override
	public void deleteMovie(Integer mId) {
		Movie m1=null;
		int key=-1;
    for(Movie m:mList) {
		if(m.getMovieId().equals(mId)) {
	        key++;
	        m1=m;
	        break;
		}
    }
    mList.remove(key);

	System.out.println("You have successfully removed "+ m1.getMovieName() +" Movie");

}
	
	public void addScreen(Screen screen) {
		 mImpl.setScreenData(screen);  
        System.out.println("You have successfully added a Screen");


}
	

	@Override
	public void deleteScreen(Integer sId) {
            Screen s1=null;
		    int key=-1;
	            for(Screen s:sList) {
				  if(s.getScreenId().equals(sId)) {
				        key++;
				        s1=s;
				        break;
					}
			    }
		
		  if(s1!=null) {
			if(key>=0) {
				sList.remove(key);
				System.out.println("You have successfully removed "+ s1.getScreenName() +" Screen");
			}
		}
		
		else {
			System.out.println("Id is no avail");
		}
 
}
	
	public void addShow(Show show) {
		 mImpl.setShowData(show);  
        System.out.println("You have successfully added a Show");


}
	@Override
	public void deleteShow(Integer shId) {
		Show sh1=null;
		int key=-1;
    for(Show sh:shList) {
		if(sh.getShowId().equals(shId)) {
	        key++;
	        sh1=sh;
	        break;
		}
    }
    shList.remove(key);

	System.out.println("You have successfully removed "+ sh1.getShowName() +" Show");

}
	
}