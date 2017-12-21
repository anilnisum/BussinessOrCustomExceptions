package com.rest;

import com.Exceptionmodel.ServiceException;
import com.service.ServiceLayer;

public class RestLayer {
	ServiceLayer sl = new ServiceLayer();
	public String getData(int eId) {
		  String result= null;
		  try {
			result =sl.getData(eId);
		} catch (ServiceException e) {
			result = e.getErrorCode()+" "+e.getErrorMsg();
		} catch (Exception e) {
			result = e.getMessage();
		}
		  return result;
	  }
}
