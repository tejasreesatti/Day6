package com.capgemini.assignments.day6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.Test;

class Laptop {
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	
	public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCompany() {
		return company;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		result = prime * result + ((processor == null) ? 0 : processor.hashCode());
		return result;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Laptop other = (Laptop) obj;
//		if (company == null) {
//			if (other.company != null)
//				return false;
//		} else if (!company.equals(other.company))
//			return false;
//		if (model == null) {
//			if (other.model != null)
//				return false;
//		} else if (!model.equals(other.model))
//			return false;
//		if (operatingSystem == null) {
//			if (other.operatingSystem != null)
//				return false;
//		} else if (!operatingSystem.equals(other.operatingSystem))
//			return false;
//		if (processor == null) {
//			if (other.processor != null)
//				return false;
//		} else if (!processor.equals(other.processor))
//			return false;
//		return true;
//	}
	
	public int hashCode1() {
		return Objects.hash(company,model,operatingSystem,processor);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		
		Laptop laptop = (Laptop) obj;
		return this.model==laptop.model && this.company==laptop.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	
	
}