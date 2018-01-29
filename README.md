# Project Title
    Simple WebCrawler
    
# Project Description

This is a simple Web Crawler currently limited to one domain. Given a starting URL http://wiprodigital.com - it extracts all pages within the domain, it follows the local links but not the external sites such as Google or Twitter.

To quickly show the output, I used the standard output function (System.out) to show the links discovered by the crawler which includes link to internal pages within the wipro domain, external links/URLs and links to static content such as images for each respective page. 

# How to build and run your solution

This is a (JavaSE 1.8) Maven Project so you only need to add the below (Jsoup 1.10.2) in your pom.xml file, you should be able to run it as a Java Application.
    
    <dependency>
        <groupId>org.jsoup</groupId>
        <artifactId>jsoup</artifactId>
        <version>1.10.2</version>
    </dependency>   
    
# Reasoning and describe any trade offs

This is a simple web crawler, technically speaking a web scraper. It starts parsing a given URL, extracting external links, local links and images (from local webpages/links only as it doesn't follow external links). 

As this is a really simple application, and my goal was to deliver a working prototype in the shortest amount of time possible. I did not implement the SOLID principle (OBJECT ORIENTED Design Principle) which would require me to write a lot more code and several classes (e.g. interface, Utility Class, etc). I put all methods including the helper methods in one class file. I also used the String datatype, which is easy to use as it's widely supported but it's got some performance tradeoff because it creates a lot of objects in the heap. I am a huge believer of Modularity so until now that's still how I code. 


# Explanation of what could be done with more time

1. Implement the SOLID principle, if apply properly, it could lead to a more scalable solution (easy to maintain and support).

2. Refactor to make it more DRY, I noticed some repeated code lines, not uncommon for Alpa Version.

3. Multi-threading, I noticed parsing HTML pages could take a while as processing takes place in a linear fashion, I would like to explore the possiblity of using concurrency/multi-threading on my next version.

4. Expose it to the Web, make it a Public REST Service/API so other could use it, free web crawler for everyone to use why not, it's always nice to be nice :).

5. Perhaps using a more efficient HTML Parser (e.g. replacement to Jsoup), I haven't got a chance to shop around.

6. Convert the ouput to XML or JSON for sharing purposes.


# Limitations/Testing

1. Some websites (e.g. robots.txt) don't allow Web Crawlers to visit a page or all pages in the website, there is no requirement and I did not implement any algorithm to workaround this. 

2. I used a constant variable (public static final String URL = "http://wiprodigital.com"), to simplify testing. The crawler has been tested against the wiprodigital.com site. Changes might be necesary to make it work against other websites.

3. In terms of static content, the code only fetches images (img)

4. I spent around 3 hours, environment setup, coding, documentation, testing, and debugging.

# Sample Run
To follow > still running


