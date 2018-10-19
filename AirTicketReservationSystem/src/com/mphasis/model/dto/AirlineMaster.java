package com.mphasis.model.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the airline_master database table.
 * 
 */
@Entity
@Table(name="airline_master")
@NamedQuery(name="AirlineMaster.findAll", query="SELECT a FROM AirlineMaster a")
public class AirlineMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="a_id")
	private String aId;

	@Column(name="a_name")
	private String aName;

	@Temporal(TemporalType.DATE)
	private Date dop;

	//bi-directional many-to-one association to FlightMaster
	@OneToMany(mappedBy="airlineMaster")
	private List<FlightMaster> flightMasters;

	public AirlineMaster() {
	}

	public String getAId() {
		return this.aId;
	}

	public void setAId(String aId) {
		this.aId = aId;
	}

	public String getAName() {
		return this.aName;
	}

	public void setAName(String aName) {
		this.aName = aName;
	}

	public Date getDop() {
		return this.dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}

	public List<FlightMaster> getFlightMasters() {
		return this.flightMasters;
	}

	public void setFlightMasters(List<FlightMaster> flightMasters) {
		this.flightMasters = flightMasters;
	}

	public FlightMaster addFlightMaster(FlightMaster flightMaster) {
		getFlightMasters().add(flightMaster);
		flightMaster.setAirlineMaster(this);

		return flightMaster;
	}

	public FlightMaster removeFlightMaster(FlightMaster flightMaster) {
		getFlightMasters().remove(flightMaster);
		flightMaster.setAirlineMaster(null);

		return flightMaster;
	}

}