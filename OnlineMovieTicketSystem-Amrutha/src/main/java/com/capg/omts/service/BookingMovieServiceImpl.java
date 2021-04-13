package com.capg.omts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.dao.IBookingMovieDao;
import com.capg.omts.entity.BookingMovieBean;

@Service
public class BookingMovieServiceImpl implements IBookingMovieService{

	@Autowired
	IBookingMovieDao dao;
	
	public BookingMovieBean addBooking(BookingMovieBean bean) {
		
		return dao.addBooking(bean);
	}

	public List<BookingMovieBean> getAllBookings() {
		return dao.getAllBookings();
	}

	public int removeBooking(int id) {
		return dao.removeBooking(id);
	}

	public BookingMovieBean getBookingById(int id) {
		return dao.getBookingById(id);
	}

}
