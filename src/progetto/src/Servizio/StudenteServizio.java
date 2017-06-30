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
@Path("/StudenteServizio") 

public class StudenteServizio {  
	EsameDao esameDao = new EsameDao();  
	StudenteDao studenteDao = new StudenteDao();  
   /**
 * @return
 */
@GET 
   @Path("/studentes") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<Studente> getStudentes(){ 
      return studenteDao.getAllStudenti(); 
   }  
   /**
 * @param id
 * @return
 */
@POST 
   @Path("/studente") 
   @Produces(MediaType.APPLICATION_XML) 
   public  Studente  getStudente(@FormParam("Identificativo") Integer id){ 
      return studenteDao.getStudente(id); 
   }  
   /**
 * @param id
 * @param nome
 * @param data
 */
@POST
   @Path("/addStudente") 
   public void addStudente(@FormParam("Identificativo") Integer id,@FormParam("nome") String nome,@FormParam("dataNascita") Date data ){ 
	   Studente c =new Studente(id,nome, data ); 
	   studenteDao.addStudente(c); 
	   }  
   /**
 * @param id
 * @param nome
 * @param data
 */
@POST
   @Path("/updateStudente") 
   public void updateStudente(@FormParam("code") Integer id,@FormParam("nome") String nome,@FormParam("dataNascita") Date data 
		 ){ 
	   Studente c =new Studente(id,nome, data  ); 
	   studenteDao.updateStudente(c); 
	   }  
   /**
 * @param identificativo
 */
@POST
   @Path("/deleteStudente") 
   public void deleteStudente(@FormParam("identificativo") int id){ 
	   Studente c =studenteDao.getStudente(id) ;
	   studenteDao.deleteStudente(c) ; 
	   }  
   /**
    * Confirm the result of the exam
 * @param esame
 * @param studente
 * @param confermazione
 */
@POST
   @Path("/risultatiConfermati") 
   public void risultatiConfermati(@FormParam("esame") Integer esame,@FormParam("studente") Integer studente,@FormParam("confermazione") Integer confermazione){ 
	   Esame e =esameDao.getEsame(esame) ;
	   Studente s =studenteDao.getStudente(studente);
	   studenteDao.risultatiConfermati(e,s,confermazione) ; 
	   }
   
   
}