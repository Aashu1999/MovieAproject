package com.capg.omts.dao;

import java.util.List;

import com.capg.omts.entity.BookingMovieBean;

public interface IBookingMovieDao {

	public BookingMovieBean addBooking(BookingMovieBean bean);

	public List<BookingMovieBean> getAllBookings();

	public BookingMovieBean getBookingById(int id);
	
	public int removeBooking(int id);

}
