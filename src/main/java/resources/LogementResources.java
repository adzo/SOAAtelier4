package resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import entities.Logement;
import entities.RendezVous;
import metier.LogementMetier;

@Path("logements")
public class LogementResources {

	LogementMetier lm = new LogementMetier();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addRendezVous(Logement l) {
		if(l != null){
				lm.addLogement(l);
				return Response.status(Status.CREATED).build();
			
		}
		else{
			return Response.status(Status.NOT_FOUND).build(); 
		}

	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll(){
		System.out.println("get all logemenet");
		return Response.ok(lm.getAll()).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/Delegation/{deleg}")
	public Response getByDelegation(@PathParam(value="deleg")String delegation){
		System.out.println("logement by delegation");
		return Response.ok(lm.getByDeleg(delegation)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/Gouvernorat/{gouv}")
	public Response getByGouver(@PathParam(value="gouv")String gouvernorat){
		System.out.println("logement by gouvernorat");
		return Response.ok(lm.getByGouver(gouvernorat)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/Type/{type}")
	public Response getByType(@PathParam(value="type")String type){
		System.out.println("logement by type ");
		return Response.ok(lm.getByType(type)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/Reference/{ref}")
	public Response getByRef(@PathParam(value="ref")int ref){
		System.out.println("logement by ref ");
		return Response.ok(lm.getByRef(ref)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/Price/{prix}")
	public Response getByPrice(@PathParam(value="prix")int price){
		System.out.println("logement by max price");
		return Response.ok(lm.getByPrice(price)).build();
	}
	
}
