package com.tutorial.crudprocedure.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int REGIONID;
    private String REGIONDESCRIPTION ;
 
  

    public Region() {
    }


	public Region(int rEGIONID, String rEGIONDESCRIPTION) {
		REGIONID = rEGIONID;
		REGIONDESCRIPTION = rEGIONDESCRIPTION;
		
	}


	public int getREGIONID() {
		return REGIONID;
	}


	public void setREGIONID(int rEGIONID) {
		REGIONID = rEGIONID;
	}


	public String getREGIONDESCRIPTION() {
		return REGIONDESCRIPTION;
	}


	public void setREGIONDESCRIPTION(String rEGIONDESCRIPTION) {
		REGIONDESCRIPTION = rEGIONDESCRIPTION;
	}


	

	
 
}
