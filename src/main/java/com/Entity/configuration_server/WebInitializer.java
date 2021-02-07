package com.Entity.configuration_server;
/*
 * The project contains a web.xml file which receives all the requests from the client.
 *  We will use WebInitializer.java in place of web.xml. 
 *  getServletMappings() function receive all the  requests corresponding to the ‘/ ’ URL mapping. 
 *  The function getServletConfigClasses() configures the dispatcher servlet and transfers the handler to 
 *  dispatcher servlet java file MVCconfig.class. 
 *  MVCconfig.java file is used in place of dispatcher servlet for java based configuration. 
 *  This class should extend AbstractAnnotationConfigDispatcherServletInitializer class to serve 
 *  the purpose of web.xml file in java based configuration. */
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
		protected Class<?>[] getRootConfigClasses() 
	    { 
	        // TODO Auto-generated method stub 
	        return null; 
	    } 
	  
	    @Override
	    protected Class<?>[] getServletConfigClasses() 
	    { 
	        // TODO Auto-generated method stub 
	        return new Class[] { MVCconfig.class }; 
	    } 
	  
	    @Override
	    protected String[] getServletMappings() 
	    { 
	        // TODO Auto-generated method stub 
	        return new String[] { "/" }; 
	    } 

}
