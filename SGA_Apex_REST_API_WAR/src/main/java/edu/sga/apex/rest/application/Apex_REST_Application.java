package edu.sga.apex.rest.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import edu.sga.apex.rest.resource.JobResource;

/**
 * The Class Apex_REST_Application.
 * 
 * @author Gourav Shenoy
 */
public class Apex_REST_Application extends Application {
	
	/* (non-Javadoc)
	 * @see javax.ws.rs.core.Application#getClasses()
	 */
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(JobResource.class);
		
		return classes;
	}
}