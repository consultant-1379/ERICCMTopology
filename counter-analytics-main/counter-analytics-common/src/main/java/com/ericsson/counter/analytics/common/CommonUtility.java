/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.counter.analytics.common;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CommonUtility {

	public static String strToSqlDate(String date_id) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Timestamp sqlDate=null;
		String sqlDateStr=null;
		try {
			java.util.Date date=sdf.parse(date_id);
			sqlDate=new Timestamp(date.getTime());
			sqlDateStr = sdf1.format(sqlDate);
			System.out.println(sqlDateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sqlDateStr;
	}

}
