package Base;

import javax.naming.Context;
import javax.sql.DataSource;

import org.junit.Before;

import progetto.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

import junit.framework.TestCase;

public class BaseTest   {

	  @Before
	    public void setUp() throws Exception {
	     
	        System.setProperty(Context.INITIAL_CONTEXT_FACTORY,
	                InitialContextFactoryForTest.class.getName());
	       
	      
	      DataSource  dataSource = getDataSource();
	        InitialContextFactoryForTest.bind("java:comp/env/jdbc/exam", dataSource);
	    }

	    

	    private DataSource getDataSource() {
	        MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();
	        dataSource.setUser("root");
	        dataSource.setPassword("");
	        dataSource.setServerName("localhost");
	        dataSource.setPort(3306);
	        dataSource.setDatabaseName("exam");
	        return dataSource;
	    }

}