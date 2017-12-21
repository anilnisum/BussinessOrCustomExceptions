package com.service;

import com.Exceptionmodel.DaoException;
import com.Exceptionmodel.ServiceException;
import com.dao.DaoLayer;

public class ServiceLayer {
	DaoLayer d = new DaoLayer();

	public String getData(int eId) throws Exception, ServiceException{
		String s = null;

		try {
			s = d.getData(eId);

		} catch (DaoException e) {

			throw new ServiceException(e.getErrorCode(), e.getErrorMsg());

		} catch (Exception e) {
  
			throw new Exception(e.getMessage());  
		}

		return s;
	}
}
