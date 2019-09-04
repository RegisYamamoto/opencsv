package com.regis.opencsv;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class OpenCSVAdicionaEmArquivoExistente {

	public static void main(String[] args) throws IOException {
		
		String csv = "data.csv";
	      CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
	        
	      String [] record = "3,David,Feezor,USA,40".split(",");
	        
	      writer.writeNext(record);
	        
	      writer.close();

	}

}