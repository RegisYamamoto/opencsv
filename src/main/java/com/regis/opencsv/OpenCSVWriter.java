package com.regis.opencsv;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class OpenCSVWriter {

	public static void main(String[] args) throws IOException {
		
		String csv = "data.csv";
		CSVWriter writer = new CSVWriter(new FileWriter(csv));
		
		String[] record = "4,David,Miller,Australia,30".split(",");
		writer.writeNext(record);
		
		writer.close();
		
	}

}