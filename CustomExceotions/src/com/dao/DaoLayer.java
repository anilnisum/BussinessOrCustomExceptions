package com.dao;

import com.Exceptionmodel.DaoException;

public class DaoLayer {
  public String getData(int eId) throws DaoException, Exception{
	  String s= null;
	  
	  // Fire query at DB
	   if(eId <= 0 ) {  // ------>4%
		    // Business  or Custom  Exception
		   throw new DaoException(1001, "No Record with key as "+eId);
	   }
	   else if(eId > 0 && eId <= 100) {   //--------> 95%
		   s = eId +" employee data is retrieved";
	   }
	   else {
		   // System Exception  ----> 1%
		   throw new Exception("No Record with key as "+eId+" SYSTEM EXCEPTION");
	   }
	   
	  return s;
  }
}
