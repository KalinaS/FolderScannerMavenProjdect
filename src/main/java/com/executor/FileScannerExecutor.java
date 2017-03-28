package com.executor;

import java.io.File;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.walkdirectory.WalkDirectory;
import com.searcher.FileSearcher;

public class FileScannerExecutor {
	
	private static final Logger log = Logger.getLogger(FileScannerExecutor.class);

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		Scanner input = new Scanner(System.in);
		log.info("Enter path of the begining file: ");
		String path = input.nextLine();
		File[] files = new File(path).listFiles();

		String option = input.nextLine();

		if (option.equals("scan")) {

			WalkDirectory.showFiles(files);
			
		}
		
		if (option.equals("search")) {
			
			log.info("Enter name of file you want to find: ");
			String fileName = input.nextLine();
			FileSearcher.searchFile(files, fileName);
			
		}

	}
}
