package sample;

import java.util.Comparator;

class PageAccessComparator implements Comparator<PageObject>{
	 
    @Override
    public int compare(PageObject p1, PageObject p2) {
        if(p1.getAccessCount() < p2.getAccessCount()){
            return 1;
        } else {
            return -1;
        }
    }
}
