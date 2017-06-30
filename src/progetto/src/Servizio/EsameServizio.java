package Servizio;
import java.util.Date;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Dao.EsameDao;
import Dao.StudenteDao;
import EsamiOnLine.Esame;
import EsamiOnLine.Studente;

 

/**
 * @author Yassine Snoussi
 *
 */
@Path("/EsameServizio") 

public class EsameServizio {  
	
	EsameDao esameDao = new EsameDao();  
	StudenteDao studenteDao = new StudenteDao(); 
   /**
 * @return
 */
@GET 
   @Path("/esami") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<Esame> getEsami(){ 
      return esameDao.getAllEsami(); 
   }  
   /**
 * @param id
 * @return
 */
@POST 
   @Path("/esame") 
   @Produces(MediaType.APPLICATION_XML) 
   public  Esame  getEsame(@FormParam("code") Integer id){ 
      return esameDao.getEsame(id); 
   }  
   /**
 * @param id
 * @param nome
 * @param data
 * @param ora
 * @param durata
 */
@POST
   @Path("/addEsame") 
   public void addEsame(@FormParam("Identificativo") Integer id,@FormParam("nome") String nome,@FormParam("data") Date data,
		   @FormParam("ora") String ora,@FormParam("durata") Double durata){ 
	   Esame c =new Esame(id,nome, data, nome, durata ); 
	   esameDao.addEsame(c); 
	   }  
   /**
 * @param id
 * @param nome
 * @param data
 * @param ora
 * @param durata
 */
@POST
   @Path("/updateEsame") 
   public void updateEsame(@FormParam("Identificativo") Integer id,@FormParam("nome") String nome,@FormParam("data") Date data,
		   @FormParam("ora") String ora,@FormParam("durata") Double durata){ 
	   Esame c =new Esame(id,nome, data, nome, durata ); 
	   esameDao.updateEsame(c); 
	   }  
   /**
 * @param id
 */
@POST
   @Path("/deleteEsame") 
   public void deleteEsame(@FormParam("Identificativo") Integer id){ 
	   Esame c =esameDao.getEsame(id) ;
	   esameDao.deleteEsame(c) ; 
	   }  
   /**
    * Regester a student for an exam
 * @param esame
 * @param studente
 * @param data
 */
@POST
   @Path("/addIscrizione") 
   public void addIscrizione(@FormParam("esame") Integer esame,@FormParam("studente") Integer studente,@FormParam("data") Date data){ 
	   Esame e =esameDao.getEsame(esame) ;
	   Studente s =studenteDao.getStudente(studente);
	   esameDao.addIscrizione(e,s,data) ; 
	   }  
   /**
    * Add a participant to an exam
 * @param esame
 * @param studente
 * @param data
 */
@POST
   @Path("/addPartecipante") 
   public void addPartecipante(@FormParam("esame") Integer esame,@FormParam("studente") Integer studente,@FormParam("data") Date data){ 
	   Esame e =esameDao.getEsame(esame) ;
	   Studente s =studenteDao.getStudente(studente);
	   esameDao.addIscrizione(e,s,data) ; 
	   }
   
   
}