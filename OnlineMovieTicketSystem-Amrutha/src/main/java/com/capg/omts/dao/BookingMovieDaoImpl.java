package com.capg.omts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.omts.entity.BookingMovieBean;

@Repository
@Transactional
public class BookingMovieDaoImpl implements IBookingMovieDao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public BookingMovieBean addBooking(BookingMovieBean bean) {
		em.persist(bean);
	    return bean;
	}

	@Override
	public List<BookingMovieBean> getAllBookings() {
		TypedQuery<BookingMovieBean> query = em.createQuery("from BookingMovieBean", BookingMovieBean.class);
		return query.getResultList();
	}

	@Override
	public BookingMovieBean getBookingById(int id) {
		BookingMovieBean booking = em.find(BookingMovieBean.class, id);
		return booking;
	}
	
	@Override
	public int removeBooking(int id) {
		BookingMovieBean booking = em.find(BookingMovieBean.class, id);
		em.remove(booking);
		return id;
	}


}
