package com.regis.opencsv;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.regis.opencsv.model.CSVUser;

public class OpenCSVReadAndParseToObject {
	
	private static final String SAMPLE_CSV_FILE_PATH = "./users.csv";

	public static void main(String[] args) {
		
		try {
			Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
			
			CsvToBean<CSVUser> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(CSVUser.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

			// Imprimindo objeto um a um
//            Iterator<CSVUser> csvUserIterator = csvToBean.iterator();
//
//            while (csvUserIterator.hasNext()) {
//                CSVUser csvUser = csvUserIterator.next();
//                System.out.println("Name : " + csvUser.getName());
//                System.out.println("Email : " + csvUser.getEmail());
//                System.out.println("PhoneNo : " + csvUser.getPhoneNo());
//                System.out.println("Country : " + csvUser.getCountry());
//                System.out.println("==========================");
//            }
			
			
			// Inserindo em uma lista de Objetos
			List<CSVUser> csvUsers = csvToBean.parse();

			for(CSVUser csvUser: csvUsers) {
			    System.out.println("Name : " + csvUser.getName());
			    System.out.println("Email : " + csvUser.getEmail());
			    System.out.println("PhoneNo : " + csvUser.getPhoneNo());
			    System.out.println("Country : " + csvUser.getCountry());
			    System.out.println("==========================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}