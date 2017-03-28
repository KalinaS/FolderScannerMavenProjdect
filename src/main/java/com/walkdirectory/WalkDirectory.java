package com.walkdirectory;

import java.io.File;
import org.apache.log4j.Logger;

public class WalkDirectory {
	
	private static Logger log = Logger.getLogger(WalkDirectory.class);
	
public static void showFiles(File[] files) {
	
		for(File file : files){
			if(file.isDirectory()){
				
				log.debug("Directory: " + file.getName());
				showFiles(file.listFiles());
			} else {
				log.debug("File: " + file.getName());
			}
		}
		
	}
	
}
