package com.in.akshay.dao;

import org.springframework.stereotype.Repository;

@Repository("sql")
public class SqlReportDaoImpl implements IRootDao {

	@Override
	public String getReportData() {
		System.out.println("SqlReportDaoImpl::getReportData");
		return "SqlReportDaoImpl:: Fetching sql reports";
	}

}
