package Servizio;


	import java.util.Date;
	import java.util.List;

	import javax.ws.rs.FormParam;
	import javax.ws.rs.GET;
	import javax.ws.rs.POST;
	import javax.ws.rs.Path;
	import javax.ws.rs.Produces;
	import javax.ws.rs.QueryParam;
	import javax.ws.rs.core.MediaType;

	import Dao.CorsoDao;
	import EsamiOnLine.Corso;

	 

	/**
	 * @author Yassine Snoussi
	 *
	 */
	@Path("/CorsoServizio") 

	public class CorsoServizio {  
		CorsoDao corsoDao = new CorsoDao();  
	   /**
	 * @return
	 */
	@GET 
	   @Path("/corsos") 
	   @Produces(MediaType.APPLICATION_XML) 
	   public List<Corso> getCorsos(){ 
	      return corsoDao.getAllCorsos(); 
	   }  
	/**
	 * @param id
	 * @return
	 */
	@GET 
	@Path("/corso") 
	@Produces(MediaType.APPLICATION_XML) 
	public  Corso  getCorso(@QueryParam("code") Integer id){ 
	   return corsoDao.getCorso(id); 
	}  
	   /**
	 * @param id
	 * @param nome
	 */
	@POST
	   @Path("/addCorso") 
	   public void addCorso(@FormParam("Identfifcativo") Integer id,@FormParam("nome") String nome){ 
		   Corso c =new Corso(id,nome ); 
		   corsoDao.addCorso(c); 
		   }  
	   /**
	 * @param id
	 * @param nome
	 */
	@POST
	   @Path("/updateCorso") 
	   public void updateCorso(@FormParam("identificativo") Integer id,@FormParam("nome") String nome){ 
		   Corso c =new Corso(id,nome ); 
		   corsoDao.updateCorso(c); 
		   }  
	   /**
	 * @param id
	 */
	@POST
	   @Path("/deleteCorso") 
	   public void deleteCorso(@FormParam("Identificativo") Integer id){ 
		   Corso c =corsoDao.getCorso(id) ;
		   corsoDao.deleteCorso(c) ; 
		   }  
	   
	}