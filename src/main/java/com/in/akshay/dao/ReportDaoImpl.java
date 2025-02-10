package com.in.akshay.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("nonSql")
@Primary
public class ReportDaoImpl implements IRootDao  {

	/*
	 * public ReportDaoImpl() { System.out.println("ReportDaoImpl:: Constructor"); }
	 * 
	 * public String getReportDataFromDB() { return
	 * "ReportDaoImpl:: Getting ReportData from DB";
	 * 
	 * }
	 */

	@Override
	public String getReportData() {
		System.out.println("Inside ReportDaoImpl:: getReportData");
		return "ReportDaoImpl:: Getting ReportData from DB";
	}

}
