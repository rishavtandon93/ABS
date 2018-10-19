package com.mphasis.model.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the flight_master database table.
 * 
 */
@Entity
@Table(name="flight_master")
@NamedQuery(name="FlightMaster.findAll", query="SELECT f FROM FlightMaster f")
public class FlightMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="f_no")
	private String fNo;

	@Column(name="ava_seats")
	private int avaSeats;

	@Temporal(TemporalType.DATE)
	@Column(name="depart_date")
	private Date departDate;

	@Column(name="depart_time")
	private String departTime;

	private int fare;

	@Column(name="tot_seats")
	private int totSeats;

	//bi-directional many-to-one association to BookingInfo
	@OneToMany(mappedBy="flightMaster")
	private List<BookingInfo> bookingInfos;

	//bi-directional many-to-one association to AirlineMaster
	@ManyToOne
	@JoinColumn(name="a_id")
	private AirlineMaster airlineMaster;

	//bi-directional many-to-one association to LocationMaster
	@ManyToOne
	@JoinColumn(name="src")
	private LocationMaster locationMaster1;

	//bi-directional many-to-one association to LocationMaster
	@ManyToOne
	@JoinColumn(name="dest")
	private LocationMaster locationMaster2;

	public FlightMaster() {
	}

	public String getFNo() {
		return this.fNo;
	}

	public void setFNo(String fNo) {
		this.fNo = fNo;
	}

	public int getAvaSeats() {
		return this.avaSeats;
	}

	public void setAvaSeats(int avaSeats) {
		this.avaSeats = avaSeats;
	}

	public Date getDepartDate() {
		return this.departDate;
	}

	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}

	public String getDepartTime() {
		return this.departTime;
	}

	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}

	public int getFare() {
		return this.fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getTotSeats() {
		return this.totSeats;
	}

	public void setTotSeats(int totSeats) {
		this.totSeats = totSeats;
	}

	public List<BookingInfo> getBookingInfos() {
		return this.bookingInfos;
	}

	public void setBookingInfos(List<BookingInfo> bookingInfos) {
		this.bookingInfos = bookingInfos;
	}

	public BookingInfo addBookingInfo(BookingInfo bookingInfo) {
		getBookingInfos().add(bookingInfo);
		bookingInfo.setFlightMaster(this);

		return bookingInfo;
	}

	public BookingInfo removeBookingInfo(BookingInfo bookingInfo) {
		getBookingInfos().remove(bookingInfo);
		bookingInfo.setFlightMaster(null);

		return bookingInfo;
	}

	public AirlineMaster getAirlineMaster() {
		return this.airlineMaster;
	}

	public void setAirlineMaster(AirlineMaster airlineMaster) {
		this.airlineMaster = airlineMaster;
	}

	public LocationMaster getLocationMaster1() {
		return this.locationMaster1;
	}

	public void setLocationMaster1(LocationMaster locationMaster1) {
		this.locationMaster1 = locationMaster1;
	}

	public LocationMaster getLocationMaster2() {
		return this.locationMaster2;
	}

	public void setLocationMaster2(LocationMaster locationMaster2) {
		this.locationMaster2 = locationMaster2;
	}

}