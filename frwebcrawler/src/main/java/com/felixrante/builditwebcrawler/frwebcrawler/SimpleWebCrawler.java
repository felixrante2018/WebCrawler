package com.felixrante.builditwebcrawler.frwebcrawler;

/**
 * Created by felixrante on 29/01/2018.
 *
 */

import java.io.IOException;
import java.util.HashSet;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SimpleWebCrawler {

	public static final String URL = "http://wiprodigital.com";
    private HashSet<String> webLinks;
    public SimpleWebCrawler(String URL) {
        webLinks = new HashSet<String>();
    }
    
    public static void main(String[] args) {      	
    	/*TODO:
        A. Show links to other pages under the same domain and follow the local links
        B. Show links to External URLs but don't follow.
    	C. links to static content such as images for each respective page.
    	*/
    	
        SimpleWebCrawler wc = new SimpleWebCrawler(SimpleWebCrawler.URL);          
        wc.getWebPageLinks(URL);       
    }
     
   public void getWebPageLinks(String URL) { 		  
	   //Unique URL only please.
        if (!webLinks.contains(URL)) {
             if (webLinks.add(URL))  
            	 System.out.println(URL);
             try{
                Document document = Jsoup.connect(URL).get();                
                //Extract all weblinks > local and global (e.g. Facebook, Twitter)
                Elements webLinksOnPage = document.select("a[href]");
                
                //TODO:
                //A. Show links to other pages under the same domain and follow the local links
                //B. Show links to External URLs but don't follow.
                if (webLinksOnPage.attr("href").contains(SimpleWebCrawler.URL)){                	
                	getLocalPageLinks(webLinksOnPage);              	     
                }
                                              
            } catch (IOException e) {
                System.err.println("Problem Accessing '" + URL + "': " + e.getMessage());
            }
        }
    } 
   public void getLocalPageLinks(Elements localPageLinks) throws IOException{  	 	
  	 for (Element page : localPageLinks) {
           getWebPageLinks(page.attr("abs:href"));            
           //C. links to static content such as images for each respective page.
               Document document = Jsoup.connect(page.attr("abs:href")).get();
               Elements webPageImages = document.select("img[src]");
               getWebPageImages(webPageImages);      
       }
   }
  	 
    public void getWebPageImages(Elements imageSrcs){
    	  for (Element src : imageSrcs) {
                  print(" * %s: %s (%s)", src.tagName(), src.attr("abs:src"), trim(src.attr("alt"), 10));    
          }
    }   
    private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }
    
    private static String trim(String s, int width) {
        if (s.length() > width)
            return s.substring(0, width-1) + ".";
        else
            return s;
    }
}




