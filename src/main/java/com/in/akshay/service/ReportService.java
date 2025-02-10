package com.in.akshay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.in.akshay.dao.IRootDao;
@Service
public class ReportService {
	@Autowired
	IRootDao rootDao;
	
//	public ReportService() {
//		
//	}
	
//	@Autowired
	
//	public ReportService( IRootDao rootDao) {
//		this.rootDao = rootDao;
//		System.out.println("ReportService:: Constructor");
//	}

//	@Autowired
//	@Qualifier("sql")
	public void setIRootDao(IRootDao rootDao) {

		this.rootDao = rootDao;
	}

	public String getReportDataFromDaoImpl() {
		System.out.println("ReportService::getReportDataFromDaoImpl");
		return rootDao.getReportData();
	}

}
