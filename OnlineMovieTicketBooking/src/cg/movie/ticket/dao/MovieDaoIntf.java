package cg.movie.ticket.dao;

import java.util.List;

import cg.movie.ticket.bean.Admin;
import cg.movie.ticket.bean.Movie;
import cg.movie.ticket.bean.Screen;
import cg.movie.ticket.bean.Show;
import cg.movie.ticket.bean.Theater;

public interface MovieDaoIntf {
	 public void setAdminData();
	 public List<Admin> getAdminData();
	 public void setTheaterData(Theater the);
	 public List<Theater> getTheaterData();
	 public void setMovieData(Movie mov);
	 public List<Movie> getMovieData();
	 public void setScreenData(Screen scr);
	 public List<Screen> getScreenData();
	 public void setShowData(Show sh);
	 public List<Show> getShowData();
}
