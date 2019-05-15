package entities;


import java.util.Date;



public class RendezVous {
	
	
	private int id;
	private Date date;
	private String numTel;
	private String heure;
	
	
	private Logement logement;
	
	public Logement getLogement() {
		return logement;
	}
	public void setLogement(Logement logement) {
		this.logement = logement;
	}
	public RendezVous() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RendezVous(int id, Date date, String numTel, String heure) {
		super();
		this.id = id;
		this.date = date;
		this.numTel = numTel;
		this.heure = heure;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	

}
