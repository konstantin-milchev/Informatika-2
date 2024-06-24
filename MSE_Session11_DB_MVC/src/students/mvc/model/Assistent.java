package students.mvc.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//TODO: TASK5: Annotate the Assistent Class with the minimum Annotations @Entity for the Class and @Id for your persNr Id field
public class Assistent implements Serializable{

	int persNr;
	String name;
	String fachgebiet;
	int boss;
	
	
	public Assistent() {
		super();
	}
	public int getPersNr() {
		return persNr;
	}
	public void setPersNr(int persNr) {
		this.persNr = persNr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFachgebiet() {
		return fachgebiet;
	}
	public void setFachgebiet(String fachgebiet) {
		this.fachgebiet = fachgebiet;
	}
	public int getBoss() {
		return boss;
	}
	public void setBoss(int boss) {
		this.boss = boss;
	}
	@Override
	public String toString() {
		return "Assistenten [persNr=" + persNr + ", name=" + name + ", fachgebiet=" + fachgebiet + ", boss=" + boss + "]";
	}
	public Assistent(int persNr, String name, String fachgebiet, int boss) {
		super();
		this.persNr = persNr;
		this.name = name;
		this.fachgebiet = fachgebiet;
		this.boss = boss;
	}
	
	
}
