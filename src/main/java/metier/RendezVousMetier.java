package metier;

import java.util.ArrayList;
import java.util.List;
import entities.RendezVous;

public class RendezVousMetier {
	private static List<RendezVous> rendezvousLst;

	public static List<RendezVous> getRendezvousLst() {
		if (rendezvousLst == null )
			rendezvousLst = new ArrayList<RendezVous>();
		return rendezvousLst;
	}

	public static void setRendezvousLst(List<RendezVous> rendezvousLst) {
		RendezVousMetier.rendezvousLst = rendezvousLst;
	}
	
	public void add(RendezVous r){
		getRendezvousLst();
		rendezvousLst.add(r);
	}
	public List<RendezVous> getAll(){
		return getRendezvousLst();
	}

	public List<RendezVous> getByRef(int reference) {
		// TODO Auto-generated method stub
		List<RendezVous> result = new ArrayList<RendezVous>();
		for (RendezVous rendezVous : rendezvousLst) {
			if (rendezVous.getLogement().getReference() == reference)
				result.add(rendezVous);
		}
		return result;
	}
	public RendezVous getById(int id){
		for (RendezVous rendezVous : rendezvousLst) {
			if (rendezVous.getId() == id)
				return rendezVous;
		}
		return null;
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		RendezVous found = this.getById(id);
		rendezvousLst.remove(found);
	}

	public void update(RendezVous rdv) {
		// TODO Auto-generated method stub
		this.deleteById(rdv.getId());
		this.add(rdv);
	}
}
