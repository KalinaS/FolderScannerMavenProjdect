package com.searcher;

import java.io.File;

import org.apache.log4j.Logger;

public class FileSearcher {
	
	private static Logger log = Logger.getLogger(FileSearcher.class);

public static void searchFile(File[] files, String name) {
		
		if (files != null) {
			for (File file : files) {

				if (file.getName().equals(name) && file.getName() != null) {
					log.debug("File exists. Path: " + file.getParent());
				} else {
					if (file.isDirectory()) {
						searchFile(file.listFiles(), name);
					}
				}
			}
		}
	}
	
}
