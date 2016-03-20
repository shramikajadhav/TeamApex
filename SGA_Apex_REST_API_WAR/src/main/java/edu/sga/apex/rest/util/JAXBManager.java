package edu.sga.apex.rest.util;

import edu.sga.apex.bean.InputFileBean;
import edu.sga.apex.bean.JobBean;
import edu.sga.apex.bean.SubmitJobRequestBean;
import edu.sga.apex.rest.jaxb.InputFile;
import edu.sga.apex.rest.jaxb.JobResponse;
import edu.sga.apex.rest.jaxb.ObjectFactory;
import edu.sga.apex.rest.jaxb.SubmitJobRequest;
import edu.sga.apex.rest.jaxb.User;

/**
 * The Class JAXBManager.
 * 
 * @author Gourav Shenoy
 */
public class JAXBManager {

	/** The factory. */
	private static ObjectFactory factory = new ObjectFactory();
	
	/**
	 * Gets the submit job request bean.
	 *
	 * @param request            the request
	 * @return the submit job request bean
	 * @throws Exception the exception
	 */
	public static SubmitJobRequestBean getSubmitJobRequestBean(
			SubmitJobRequest request) throws Exception {
		
		SubmitJobRequestBean bean = new SubmitJobRequestBean();
		
		/* throw error if required field not specified */
		if (request != null) {
			/* throw error if required field not specified */
			if (request.getJobName() == null) {
				throw new Exception(
						"jobName parameter not specified. Please pass this field in the request JSON.");
			}
			bean.setJobName(request.getJobName());

			/* throw error if required field not specified */
			if (request.getEmailId() == null) {
				throw new Exception(
						"emailId parameter not specified. Please pass this field in the request JSON.");
			}
			bean.setEmailId(request.getEmailId());

			/* if walltime not provided, use default */
			if (request.getWallTime() == null) {
				bean.setWallTime(Constants.DEFAULT_WALLTIME);
			} else {
				bean.setWallTime(request.getWallTime());
			}

			/* if num of nodes not provided, use default */
			if (request.getNumNodes() == null) {
				bean.setNumNodes(Constants.DEFAULT_NUM_NODES);
			} else {
				bean.setNumNodes(request.getNumNodes());
			}

			/* if num of processors not provided, use default */
			if (request.getNumProcessors() == null) {
				bean.setNumProcessors(Constants.DEFAULT_NUM_PROCESSORS);
			} else {
				bean.setNumProcessors(request.getNumProcessors());
			}
			
			/* set input file list */
			if(request.getInputFiles() != null) {
				for(InputFile file : request.getInputFiles()) {
					InputFileBean ipFileBean = new InputFileBean();
					ipFileBean.setFileName(file.getFileName());
					ipFileBean.setFileType(file.getFileType());
					
					bean.getInputFiles().add(ipFileBean);
				}
			}
			
		}
		return bean;
	}
	
	/**
	 * Gets the job response.
	 *
	 * @param bean the bean
	 * @return the job response
	 * @throws Exception the exception
	 */
	public static JobResponse getJobResponse(JobBean bean) throws Exception {
		JobResponse response = factory.createJobResponse();
		
		/* check if bean is valid */
		if(bean != null) {
			response.setJobId(bean.getJobId());
			response.setJobName(bean.getJobName());
			response.setUserName(bean.getUserName());
			response.setStatus(bean.getStatus());
			response.setElapsedTime(bean.getElapsedTime());
			response.setNumNodes(bean.getNumNodes());
			response.setNumProcessors(bean.getNumProcessors());
			response.setRequiredMemory(bean.getRequiredMemory());
			response.setRequiredTime(bean.getRequiredTime());
			response.setQueue(bean.getQueue());
		} else {
			throw new Exception("Empty JobBean received. Cannot construct the response object.");
		}
		return response;
	}
	
	/**
	 * Gets the user dao entity.
	 *
	 * @param userJAXB the user jaxb
	 * @return the user dao entity
	 * @throws Exception the exception
	 */
	public static edu.sga.apex.entity.User getUserDAOEntity(User userJAXB) throws Exception {
		edu.sga.apex.entity.User userEntity = new edu.sga.apex.entity.User();
		
		/* check if jaxb is valid */
		if(userJAXB != null) {
			userEntity.setUsername(userJAXB.getUserName());
			userEntity.setPassword(userJAXB.getPassword());
		} else {
			throw new Exception("Empty User JAXB received. Cannot construct the DAO entity.");
		}
		
		return userEntity;
	}
}
