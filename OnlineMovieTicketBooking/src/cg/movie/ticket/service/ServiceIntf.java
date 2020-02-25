package cg.movie.ticket.service;

import cg.movie.ticket.bean.Admin;
import cg.movie.ticket.bean.Movie;
import cg.movie.ticket.bean.Screen;
import cg.movie.ticket.bean.Show;
import cg.movie.ticket.bean.Theater;

public interface ServiceIntf {

	public Admin AdminLogin(String id, String pass);
	public void addTheater(Theater theater);
	public void deleteTheater(Integer tId);
	public void addMovie(Movie movie);
	public void deleteMovie(Integer mId);
	public void addScreen(Screen screen);
	public void deleteScreen(Integer sId);
	public void addShow(Show show);
	public void deleteShow(Integer shId);
}
