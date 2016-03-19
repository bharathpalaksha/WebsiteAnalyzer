package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class mainPrograMForWebAnalyzer {

	public static void main(String[] args) throws IOException {
		WebsiteAnalyzer web = new WebsiteAnalyzer();
		web.reportPageAccess("bharath");
		web.reportPageAccess("bharath");
		web.reportPageAccess("someone");
		web.reportPageAccess("temp");
		web.reportPageAccess("bharath");
		web.reportPageAccess("temp");
		web.reportPageAccess("last");
		web.reportPageAccess("someone");
		List<String> result = web.getTopNpages(2);
		List<String> result2 = web.getTopNpages(8);
		
		System.out.println(result.toString());
		System.out.println(result2.toString());
	}
	

}
