package entities;


import java.util.Set;



public class Logement  {

	
	private int reference;
	private String adresse;
	private String delegation;
	private String gouvernorat;
	private String type;
	private String description;
	private float prix;
	
	
	private Set<RendezVous> rendezvous;
	
	
	public Set<RendezVous> getRendezvous() {
		return rendezvous;
	}
	public void setRendezvous(Set<RendezVous> rendezvous) {
		this.rendezvous = rendezvous;
	}
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getDelegation() {
		return delegation;
	}
	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}
	public String getGouvernorat() {
		return gouvernorat;
	}
	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Logement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Logement(int reference, String adresse, String delegation, String gouvernorat, String type,
			String description, float prix) {
		super();
		this.reference = reference;
		this.adresse = adresse;
		this.delegation = delegation;
		this.gouvernorat = gouvernorat;
		this.type = type;
		this.description = description;
		this.prix = prix;
	}
	
}
