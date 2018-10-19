package com.mphasis.model.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the booking_info database table.
 * 
 */
@Entity
@Table(name="booking_info")
@NamedQuery(name="BookingInfo.findAll", query="SELECT b FROM BookingInfo b")
public class BookingInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="booking_id")
	private int bookingId;

//	@Temporal(TemporalType.DATE)
	@Column(name="booking_date")
	private String bookingDate;

	@Temporal(TemporalType.DATE)
	@Column(name="depart_date")
	private Date departDate;

	private int price;

	@Column(name="seats_book")
	private int seatsBook;

	//bi-directional many-to-one association to FlightMaster
	@ManyToOne
	@JoinColumn(name="f_no")
	private FlightMaster flightMaster;

	//bi-directional many-to-one associa tion to CustomerMaster
	@ManyToOne
	@JoinColumn(name="c_id")
	private Customer customerMaster;

	public BookingInfo() {
	}

	public int getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingDate() {
		return this.bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getDepartDate() {
		return this.departDate;
	}

	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSeatsBook() {
		return this.seatsBook;
	}

	public void setSeatsBook(int seatsBook) {
		this.seatsBook = seatsBook;
	}

	public FlightMaster getFlightMaster() {
		return this.flightMaster;
	}

	public void setFlightMaster(FlightMaster flightMaster) {
		this.flightMaster = flightMaster;
	}

	public Customer getCustomerMaster() {
		return this.customerMaster;
	}

	public void setCustomerMaster(Customer customerMaster) {
		this.customerMaster = customerMaster;
	}

}