package Servizio;

import java.util.Date;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Dao.ProgrammaDao;
import EsamiOnLine.Programma;

 

/**
 * @author Yassine Snoussi
 *
 */
@Path("/ProgrammaServizio") 

public class ProgrammaServizio {  
	ProgrammaDao programmaDao = new ProgrammaDao();  
   /**
 * @return
 */
@GET 
   @Path("/programmi") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<Programma> getProgrammi(){ 
      return programmaDao.getAllProgrammi(); 
   }  
   /**
 * @param id
 * @return
 */
@POST 
   @Path("/programma") 
   @Produces(MediaType.APPLICATION_XML) 
   public  Programma  getProgramma(@FormParam("Identificativo") Integer id){ 
      return programmaDao.getProgramma(id); 
   }  
   /**
 * @param id
 * @param nome
 * @param anno
 */
@POST
   @Path("/addProgramma") 
   public void addProgramma(@FormParam("Identificativo") Integer id,@FormParam("nome") String nome,@FormParam("anno") Integer anno ){ 
	   Programma c =new Programma(id,nome, anno ); 
	   programmaDao.addProgramma(c); 
	   }  
   /**
 * @param id
 * @param nome
 * @param anno
 */
@POST
   @Path("/updateProgramma") 
   public void updateProgramma(@FormParam("Identificativo") Integer id,@FormParam("nome") String nome,@FormParam("anno") Integer anno 
		 ){ 
	   Programma c =new Programma(id,nome, anno  ); 
	   programmaDao.updateProgramma(c); 
	   }  
   /**
 * @param id
 */
@POST
   @Path("/deleteProgramma") 
   public void deleteProgramma(@FormParam("Identificativo") Integer id){ 
	   Programma c =programmaDao.getProgramma(id) ;
	   programmaDao.deleteProgramma(c) ; 
	   }  
   /**
    * Add a course to a program
 * @param corso
 * @param programma
 * @param docente
 * @param credito
 * @param obbligatorio
 */
@POST
   @Path("/addCorso") 
   public void addCorso(@FormParam("corso") Integer corso,@FormParam("programma") Integer programma,@FormParam("docente") Integer docente,@FormParam("credito") Double credito,@FormParam("obbligatorio") Integer obbligatorio ){ 
	   	   programmaDao.addCorso(corso, programma, docente, credito, obbligatorio); 
	   }  
}