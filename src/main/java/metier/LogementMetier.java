package metier;

import java.util.ArrayList;
import java.util.List;
import entities.Logement;

public class LogementMetier {
	private static List<Logement> logements;

	public static List<Logement> getLogements() {
		if (logements == null )
			logements = new ArrayList<Logement>();
		return logements;
	}

	public static void setLogements(List<Logement> logements) {
		LogementMetier.logements = logements;
	}
	
	public void addLogement(Logement l){
		getLogements().add(l);
	}
	
	public List<Logement> getAll(){
		return getLogements();
	}

	public List<Logement> getByDeleg(String delegation) {
		// TODO Auto-generated method stub
		List<Logement>result = new ArrayList<Logement>(); 
		for (Logement logement : logements) {
			if(logement.getDelegation().equals(delegation)){
				result.add(logement);
			}
		}
		return result;
	}
	
	public List<Logement> getByGouver(String gouvernorat) {
		// TODO Auto-generated method stub
		List<Logement>result = new ArrayList<Logement>(); 
		for (Logement logement : logements) {
			if(logement.getGouvernorat().equals(gouvernorat)){
				result.add(logement);
			}
		}
		return result;
	}

	public List<Logement>  getByType(String type) {
		// TODO Auto-generated method stub
		List<Logement>result = new ArrayList<Logement>(); 
		for (Logement logement : logements) {
			if(logement.getType().equals(type)){
				result.add(logement);
			}
		}
		return result;
	}

	public List<Logement> getByRef(int ref) {
		// TODO Auto-generated method stub
		List<Logement>result = new ArrayList<Logement>(); 
		for (Logement logement : logements) {
			if(logement.getReference() == ref){
				result.add(logement);
			}
		}
		return result;
	}

	public List<Logement> getByPrice(int price) {
		// TODO Auto-generated method stub
		List<Logement>result = new ArrayList<Logement>(); 
		for (Logement logement : logements) {
			if(logement.getPrix() < price){
				result.add(logement);
			}
		}
		return result;
	}
}
