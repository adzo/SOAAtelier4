package resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import entities.RendezVous;
import metier.LogementMetier;
import metier.RendezVousMetier;

@Path("rendezvous")
public class RendezVousResources {

	RendezVousMetier rm = new RendezVousMetier();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addRendezVous(RendezVous rdv) {
		if(rdv != null){
				rm.add(rdv);
				return Response.status(Status.CREATED).build();
			
		}
		else{
			return Response.status(Status.NOT_FOUND).build(); 
		}

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		System.out.println("getAll called");
		return Response.ok(rm.getAll()).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/reference")
	public Response getAllByRef(@QueryParam(value="refLogement") int reference){
		
		System.out.println("By queryParam called");
		return Response.ok(rm.getByRef((reference))).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response getRendezVousSpec(@PathParam(value="id")int id){
		System.out.println("get rendez vous specifique par id logement");
		return Response.ok(rm.getById(id)).build();
	}
	
	@DELETE
	@Path("{id}")
	public Response deleteRendezVousById(@PathParam(value="id") int id){
		System.out.println("Suppression redenzvous specifique");
		rm.deleteById(id);
		return Response.ok().build();
	}
	
	@PUT
	@Path("{id}")
	public Response updateRendezVous(RendezVous rdv, @PathParam(value="id") int id){
		System.out.println("Mise a jour rdv specifique");
		if(rdv != null){
			rm.update(rdv);
			return Response.ok().build();
		}else{
			return Response.status(Status.NOT_FOUND).build();
		}
	}
}
