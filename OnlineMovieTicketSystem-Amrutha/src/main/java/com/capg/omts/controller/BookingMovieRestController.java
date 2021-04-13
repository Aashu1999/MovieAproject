package com.capg.omts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.entity.BookingMovieBean;
import com.capg.omts.service.BookingMovieServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({ "/booking" })
public class BookingMovieRestController {

	@Autowired
	BookingMovieServiceImpl service;
	

	@PostMapping
	public ResponseEntity<Boolean> createBook(@RequestBody BookingMovieBean bean) {
		service.addBooking(bean);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true,HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping
	public List<BookingMovieBean> viewAllBookings() {
		return service.getAllBookings();
	}
	
	@GetMapping("/{id}")
	public BookingMovieBean getBookingById(@PathVariable int id) {
		return service.getBookingById(id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteBooking(@PathVariable int id){
		service.removeBooking(id);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true,HttpStatus.OK);
		return responseEntity;
	}
}
