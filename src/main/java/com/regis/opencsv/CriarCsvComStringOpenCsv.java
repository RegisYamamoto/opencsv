package com.regis.opencsv;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CriarCsvComStringOpenCsv {

public static void main(String[] args) throws IOException {
		
		String[] cabecalho = {"nome", "idade", "email"};
		
		List<String[]> linhas = new ArrayList<>();
		linhas.add(new String[]{"Joao", "35", "joao@dicasdejava.com.br"});
		linhas.add(new String[]{"Maria", "23", "maria@diasdeprogramacao.com.br"});
		linhas.add(new String[]{"Ana", "25", "ana@dicasdejava.com.br"});
		
		Writer writer = Files.newBufferedWriter(Paths.get("pessoas.csv"));
		CSVWriter csvWriter = new CSVWriter(writer);
		
		csvWriter.writeNext(cabecalho);
		csvWriter.writeAll(linhas);
		
		csvWriter.flush();
		writer.close();

	}
}