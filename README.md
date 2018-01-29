# Project Title
    Simple WebCrawler
    
# Project Description

This is a simple Web Crawle limited to one domain. Given a starting URL http://wiprodigital.com - it visits all pages within the domain, but does not follow the links to external sites such as Google or Twitter.

The output is Text showing links to other pages under the same domain, links to external URLs and links to static content such as images for each respective page.

# How to build and run your solution

This is a (JavaSE 1.8) Maven Project so you only need to add the below (Jsoup 1.10.2) in your pom.xml file, you should be able to run it as a Java Application.
    
    <dependency>
        <groupId>org.jsoup</groupId>
        <artifactId>jsoup</artifactId>
        <version>1.10.2</version>
    </dependency>   
    
# Reasoning and describe any trade offs

This is a simple web crawler, technically speaking a web scraper. It starts parsing a given URL, extracting links from the page both global (e.g. facebook) and local links (within the wiprodigital website) and images (local links only as it doesn't follow external links). 

# Explanation of what could be done with more time
