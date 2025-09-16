package com.omrbranch;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJvmReports(String jsonFile){
		//1.Mention the path of jvm report where to store?
		File file = new File ("file path");

		//2. create the object for Cofiguration class
	Configuration configuration = new Configuration(file, "OMRBranchProject");
		//3.K,V --> Design purpose os, version
		configuration.addClassifications("OS", "WIN 11");
		configuration.addClassifications("Browser Version", "144");
		configuration.addClassifications("Testing", "Reg");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Sprint", "33");

		//4. Create the object for ReportBuilderClss
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles,configuration);
		
		//5. Build JVM Report
		builder.generateReports();

	}
}
