package com.tutorial.crudprocedure.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CATEGORYID;
    private String CATEGORYNAME ;
    private String DESCRIPTION;
  

    public Coche() {
    }


	public Coche(int cATEGORYID, String cATEGORYNAME, String dESCRIPTION) {
		CATEGORYID = cATEGORYID;
		CATEGORYNAME = cATEGORYNAME;
		DESCRIPTION = dESCRIPTION;
	}


	public int getCATEGORYID() {
		return CATEGORYID;
	}


	public void setCATEGORYID(int cATEGORYID) {
		CATEGORYID = cATEGORYID;
	}


	public String getCATEGORYNAME() {
		return CATEGORYNAME;
	}


	public void setCATEGORYNAME(String cATEGORYNAME) {
		CATEGORYNAME = cATEGORYNAME;
	}


	public String getDESCRIPTION() {
		return DESCRIPTION;
	}


	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

   
 
}
