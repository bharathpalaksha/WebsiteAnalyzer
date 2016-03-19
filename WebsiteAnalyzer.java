package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WebsiteAnalyzer {
	
	List<PageObject> pageAccess = new LinkedList<PageObject>();
	
	public void reportPageAccess(String pageUri) {
		boolean found = false;
		
		for(PageObject page : pageAccess) {
			if(page.getUri().equals(pageUri)) {
				found = true;
				page.setAccessCount(page.getAccessCount()+1);
				break;
			}
		}
		
		if(!found) {
			PageObject newPage = new PageObject();
			newPage.setUri(pageUri);
			newPage.setAccessCount(1);
			pageAccess.add(newPage);
		}
		Collections.sort(pageAccess, new PageAccessComparator());
		
	}
	
	public List<String> getTopNpages(int n) {
		
		List<String> topNpages = new ArrayList<String>();
		
		int maxN = n;
		
		if( n > pageAccess.size()) {
			maxN = pageAccess.size();
		}
				
		for(int i=0;i<maxN;i++) {
			topNpages.add(pageAccess.get(i).getUri());
		}
		
		return topNpages;
		
	}

}
