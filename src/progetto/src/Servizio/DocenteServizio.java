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
import Dao.DocenteDao;
import Dao.StudenteDao;
import EsamiOnLine.Esame;
import EsamiOnLine.Docente;
import EsamiOnLine.Studente;

 

/**
 * @author Yassine Snoussi
 *
 */
Path("/DocenteServizio") 

public class DocenteServizio {  
	EsameDao esameDao = new EsameDao();  
	StudenteDao studenteDao = new StudenteDao(); 
	DocenteDao docenteDao = new DocenteDao();  
   /**
 * @return
 */
@GET 
   Path("/docenti") 
   Produces(MediaType.APPLICATION_XML) 
   public List<Docente> getDocentes(){ 
      return docenteDao.getAllDocenti(); 
   }  
   /**
 * @param id
 * @return
 */
@POST
   Path("/Docente") 
   Produces(MediaType.APPLICATION_XML) 
   public  Docente  getDocente(@FormParam("identfifcativo") int id){ 
      return docenteDao.getDocente(id); 
   }  
   /**
 * @param id
 * @param nome
 * @param data
 */
@POST
   @Path("/addDocente") 
   public void addDocente(@FormParam("identificativo")int id,@FormParam("nome") String nome,@FormParam("dataReclutamento") Date data ){ 
	   Docente c =new Docente(id,nome, data ); 
	  docenteDao.addDocente(c); 
	   }  
   /**
 * @param id
 * @param nome
 * @param data
 */
@POST
   @Path("/updateDocente") 
   public void updateDocente(@FormParam("Identificativo") int id,@FormParam("nome") String nome,@FormParam("dataReclutamento") Date data 
		 ){ 
	   Docente c =new Docente(id,nome, data  ); 
	   docenteDao.updateDocente(c); 
	   }  
   /**
 * @param id
 */
@POST
   @Path("/deleteDocente") 
   public void deleteDocente(@FormParam("Identificativo") int id){ 
	   Docente c =docenteDao.getDocente(id) ;
	   docenteDao.deleteDocente(c) ; 
	   }  
   /**
    * Enter a exam score
 * @param esame
 * @param studente
 * @param voto
 */
@POST
   @Path("/setVoto") 
   public void setVoto(@FormParam("esame") int esame,@FormParam("studente") Integer studente,@FormParam("voto") Double voto){ 
	   Esame e =esameDao.getEsame(esame) ;
	   Studente s =studenteDao.getStudente(studente);
	   docenteDao.setVoto(e,s,voto) ; 
	   }
   
   
}