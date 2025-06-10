package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Write logs into a file and retrieve them successfully
// monitoring logs in server-side applications

public class LogSystem {
	
	private static final String LOG_FILE = "system.log";
	
	public static void writeLog(String logMessage) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE,true))){
			writer.write(logMessage);
			writer.newLine();
		}catch(IOException e) {
			System.out.println("Error in logWriting");
		}
	}
	
	public static void readLog() {
		try(BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))){
			String line;
			while((line = reader.readLine())!=null) {
				System.out.println("Log :" + line);
			}
		}catch(IOException e) {
			System.out.println("Error on logReading");
		}
	}
	
	public static void main(String[] args) {
		
		writeLog("Application started");
		writeLog("User logged in");
		readLog();
	}
	
	
}


