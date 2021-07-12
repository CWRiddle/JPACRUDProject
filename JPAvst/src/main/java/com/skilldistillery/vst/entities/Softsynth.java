package com.skilldistillery.vst.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Softsynth {

	///////////
	// Fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	String company;
	Double price;
	int oscillators;
	@Column(name="synthesis_type")
	String synthesisType;
	@Column(name="has_sampler")
	boolean hasSampler;
	@Column(name="img")
	String image;
	@Column(name="is_user_created")
	Boolean userCreated;
	
	////////////
	// Methods
	
	public Softsynth() {
		super();
	}
	
	public Softsynth(int id, String name, String company, double price, int oscillators, String synthesisType, boolean hasSampler) {
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
		this.oscillators = oscillators;
		this.synthesisType = synthesisType;
		this.hasSampler = hasSampler;
	}
	
	public Softsynth(String name, String company, double price, int oscillators, String synthesisType, boolean hasSampler) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.oscillators = oscillators;
		this.synthesisType = synthesisType;
		this.hasSampler = hasSampler;
	}
	
	public Softsynth(String name, String company, double price, int oscillators, String synthesisType, boolean hasSampler, String image, boolean userCreated) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.oscillators = oscillators;
		this.synthesisType = synthesisType;
		this.hasSampler = hasSampler;
		this.image = image;
		this.userCreated = userCreated;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getOscillators() {
		return oscillators;
	}

	public void setOscillators(int oscillators) {
		this.oscillators = oscillators;
	}

	public String getSynthesisType() {
		return synthesisType;
	}

	public void setSynthesisType(String synthesisType) {
		this.synthesisType = synthesisType;
	}

	public boolean isHasSampler() {
		return hasSampler;
	}

	public void setHasSampler(boolean hasSampler) {
		this.hasSampler = hasSampler;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(Boolean userCreated) {
		this.userCreated = userCreated;
	}

	@Override
	public String toString() {
		return "Softsynth [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
