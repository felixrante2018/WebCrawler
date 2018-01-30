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

5. Local sites means a URL that contains http://wiprodigital.com (to simplify this can be changed.)

# Sample Run
Showing both Internal and External Links (without images, I commented the call to the getWebPageImages method to get the result quicker. 

The crawler had issues accessing some URLs (internal and external). The below is just a partial result of the test run. 

http://wiprodigital.com
http://wiprodigital.com/who-we-are
http://wiprodigital.com/who-we-are/#masthead
http://wiprodigital.com/who-we-are/#wdteam-vid
http://wiprodigital.com/who-we-are/#wdteam_meetus
http://wiprodigital.com/who-we-are/#wdteam_leaders
http://wiprodigital.com/what-we-do
http://wiprodigital.com/who-we-are#wdteam_meetus
http://wiprodigital.com/what-we-do#work-three-circles-row
http://wiprodigital.com/who-we-are#wdteam_leaders
http://wiprodigital.com/what-we-do#wdwork_cases
http://wiprodigital.com/what-we-do/#masthead
http://wiprodigital.com/what-we-do/#work-three-circles-row
http://wiprodigital.com/what-we-do/#wdwork_cases
http://wiprodigital.com/what-we-do/#wdwork_partners
http://wiprodigital.com/what-we-think
http://wiprodigital.com/what-we-do#wdwork_partners
http://wiprodigital.com/?s=&post_type[]=post
http://wiprodigital.com/?s=&post_type[]=cases
http://wiprodigital.com/?s=&post_type[]=events
http://wiprodigital.com/?s=&post_type[]=news
http://wiprodigital.com/join-our-team
http://wiprodigital.com/join-our-team/#masthead
http://wiprodigital.com/join-our-team/#wdwork-vid
http://wiprodigital.com/join-our-team/#wdcareers_team
http://wiprodigital.com/join-our-team/#wdcareers_jobs
http://wiprodigital.com/get-in-touch
http://wiprodigital.com/join-our-team#wdwork-vid
http://wiprodigital.com/get-in-touch#wddi-locations
http://wiprodigital.com/join-our-team#wdcareers_team
http://wiprodigital.com/get-in-touch#wddi-contact
http://wiprodigital.com/join-our-team#wdcareers_jobs
https://www.facebook.com/WiproDigital/
https://twitter.com/wiprodigital
https://www.linkedin.com/company/wipro-digital
Problem Accessing 'https://www.linkedin.com/company/wipro-digital': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/join-our-team#wdcareers_jobs': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/get-in-touch#wddi-contact': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/join-our-team#wdcareers_team': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/get-in-touch#wddi-locations': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/join-our-team#wdwork-vid': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/get-in-touch': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/join-our-team/#wdcareers_jobs': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/join-our-team/#wdcareers_team': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/join-our-team/#wdwork-vid': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/join-our-team/#masthead': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/join-our-team': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/?s=&post_type[]=news': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/?s=&post_type[]=events': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/?s=&post_type[]=cases': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/?s=&post_type[]=post': HTTP error fetching URL
http://wiprodigital.com/designit-approach
https://designit.com
Problem Accessing 'http://wiprodigital.com/designit-approach': HTTP error fetching URL
http://wiprodigital.com/
http://wiprodigital.com/#AllcontntAggr
http://wiprodigital.com/#InscontntAggr
http://wiprodigital.com/#CascontntAggr
http://wiprodigital.com/#EvtcontntAggr
http://wiprodigital.com/#NewcontntAggr
http://wiprodigital.com/news/cio-com-12-reasons-why-digital-transformation-fail/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2Fnews%2Fcio-com-12-reasons-why-digital-transformation-fail%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2Fnews%2Fcio-com-12-reasons-why-digital-transformation-fail%2F&title=CIO.com: 12 Reasons Why Digital Transformation Fail&summary=http%3A%2F%2Fwiprodigital.com%2Fnews%2Fcio-com-12-reasons-why-digital-transformation-fail%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2Fnews%2Fcio-com-12-reasons-why-digital-transformation-fail%2F
https://www.cio.com/article/3248946/digital-transformation/12-reasons-why-digital-transformations-fail.html
http://wiprodigital.com/news/new-survey-highlights-leadership-crisis-digital-transformation/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2Fnews%2Fnew-survey-highlights-leadership-crisis-digital-transformation%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2Fnews%2Fnew-survey-highlights-leadership-crisis-digital-transformation%2F&title=New Survey Highlights Leadership Crisis in Digital Transformation&summary=http%3A%2F%2Fwiprodigital.com%2Fnews%2Fnew-survey-highlights-leadership-crisis-digital-transformation%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2Fnews%2Fnew-survey-highlights-leadership-crisis-digital-transformation%2F
http://wiprodigital.com/2017/06/01/a-crisis-in-digital-transformation-a-survey-of-400-us-senior-executives/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2017%2F06%2F01%2Fa-crisis-in-digital-transformation-a-survey-of-400-us-senior-executives%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2017%2F06%2F01%2Fa-crisis-in-digital-transformation-a-survey-of-400-us-senior-executives%2F&title=A Crisis in Digital Transformation: A Survey of 400 US Senior Executives&summary=http%3A%2F%2Fwiprodigital.com%2F2017%2F06%2F01%2Fa-crisis-in-digital-transformation-a-survey-of-400-us-senior-executives%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2017%2F06%2F01%2Fa-crisis-in-digital-transformation-a-survey-of-400-us-senior-executives%2F
http://bit.ly/2rIwO6Z
http://bit.ly/2rWa6YM
Problem Accessing 'http://bit.ly/2rWa6YM': Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml
Problem Accessing 'http://wiprodigital.com/2017/06/01/a-crisis-in-digital-transformation-a-survey-of-400-us-senior-executives/': Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml
Problem Accessing 'http://wiprodigital.com/news/new-survey-highlights-leadership-crisis-digital-transformation/': Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml
Problem Accessing 'http://wiprodigital.com/news/cio-com-12-reasons-why-digital-transformation-fail/': HTTP error fetching URL
http://wiprodigital.com/2018/01/03/new-ways-of-working-to-understand-customers-you-must-understand-the-how-as-well-as-the-why/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F03%2Fnew-ways-of-working-to-understand-customers-you-must-understand-the-how-as-well-as-the-why%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F03%2Fnew-ways-of-working-to-understand-customers-you-must-understand-the-how-as-well-as-the-why%2F&title=New Ways of Working: To Understand Customers, You Must Understand the “How” As Well As The “Why”&summary=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F03%2Fnew-ways-of-working-to-understand-customers-you-must-understand-the-how-as-well-as-the-why%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F03%2Fnew-ways-of-working-to-understand-customers-you-must-understand-the-how-as-well-as-the-why%2F
https://twitter.com/rajan_kohli1
http://wiprodigital.com/tag/design/
Problem Accessing 'http://wiprodigital.com/tag/design/': HTTP error fetching URL
http://wiprodigital.com/tag/digital-transformation/
Problem Accessing 'http://wiprodigital.com/tag/digital-transformation/': HTTP error fetching URL
http://wiprodigital.com/tag/enterprise-transformation/
Problem Accessing 'http://wiprodigital.com/tag/enterprise-transformation/': HTTP error fetching URL
http://wiprodigital.com/tag/new-ways-of-working/
Problem Accessing 'http://wiprodigital.com/tag/new-ways-of-working/': HTTP error fetching URL
http://wiprodigital.com/tag/strategy/
Problem Accessing 'http://wiprodigital.com/tag/strategy/': HTTP error fetching URL
http://wiprodigital.com/tag/technology/
Problem Accessing 'http://wiprodigital.com/tag/technology/': HTTP error fetching URL
http://wiprodigital.com/2018/01/25/designit-designing-for-the-forgotten/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F25%2Fdesignit-designing-for-the-forgotten%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F25%2Fdesignit-designing-for-the-forgotten%2F&title=Designing For The Forgotten&summary=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F25%2Fdesignit-designing-for-the-forgotten%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F25%2Fdesignit-designing-for-the-forgotten%2F
https://medium.designit.com/designing-for-the-forgotten-b976509cad1b
https://twitter.com/Designit
http://wiprodigital.com/tag/design-strategy/
Problem Accessing 'http://wiprodigital.com/tag/design-strategy/': HTTP error fetching URL
http://wiprodigital.com/tag/design-thinking/
Problem Accessing 'http://wiprodigital.com/tag/design-thinking/': HTTP error fetching URL
http://wiprodigital.com/tag/designit/
Problem Accessing 'http://wiprodigital.com/tag/designit/': HTTP error fetching URL
http://wiprodigital.com/tag/human-centered-design/
Problem Accessing 'http://wiprodigital.com/tag/human-centered-design/': HTTP error fetching URL
http://wiprodigital.com/2018/01/16/recap-hackathon-at-the-wipro-digital-bangalore-pod/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F16%2Frecap-hackathon-at-the-wipro-digital-bangalore-pod%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F16%2Frecap-hackathon-at-the-wipro-digital-bangalore-pod%2F&title=Recap: Hackathon at the Wipro Digital Bangalore POD&summary=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F16%2Frecap-hackathon-at-the-wipro-digital-bangalore-pod%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F16%2Frecap-hackathon-at-the-wipro-digital-bangalore-pod%2F
https://www.tofugu.com/japanese/itadakimasu-meaning/
https://medium.com/r/?url=https%3A%2F%2Ftrello.com
Problem Accessing 'https://medium.com/r/?url=https%3A%2F%2Ftrello.com': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/2018/01/16/recap-hackathon-at-the-wipro-digital-bangalore-pod/': HTTP error fetching URL
http://wiprodigital.com/2018/01/11/making-business-transformation-a-smash-hit-part-2-the-foundations-to-get-started-at-pace/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F11%2Fmaking-business-transformation-a-smash-hit-part-2-the-foundations-to-get-started-at-pace%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F11%2Fmaking-business-transformation-a-smash-hit-part-2-the-foundations-to-get-started-at-pace%2F&title=Making Business Transformation a Smash Hit, Part 2: The Foundations to Get Started at Pace&summary=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F11%2Fmaking-business-transformation-a-smash-hit-part-2-the-foundations-to-get-started-at-pace%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F11%2Fmaking-business-transformation-a-smash-hit-part-2-the-foundations-to-get-started-at-pace%2F
http://wiprodigital.com/2017/12/05/making-business-transformation-a-smash-hit/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2017%2F12%2F05%2Fmaking-business-transformation-a-smash-hit%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2017%2F12%2F05%2Fmaking-business-transformation-a-smash-hit%2F&title=Making Business Transformation a Smash Hit&summary=http%3A%2F%2Fwiprodigital.com%2F2017%2F12%2F05%2Fmaking-business-transformation-a-smash-hit%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2017%2F12%2F05%2Fmaking-business-transformation-a-smash-hit%2F
https://images.forbes.com/forbesinsights/StudyPDFs/KPMG_Transformation_Report.pdf
Problem Accessing 'https://images.forbes.com/forbesinsights/StudyPDFs/KPMG_Transformation_Report.pdf': Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml
Problem Accessing 'http://wiprodigital.com/2017/12/05/making-business-transformation-a-smash-hit/': Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml
https://www.designcouncil.org.uk/news-opinion/design-process-what-double-diamond
https://www.youtube.com/watch?v=RkREefkD2gg
https://www.slideshare.net/7thpixel/introduction-to-assumptions-mapping-agile2016
http://www.gv.com/sprint/
http://wiprodigital.com/cases/in24-insure/
Problem Accessing 'http://wiprodigital.com/cases/in24-insure/': HTTP error fetching URL
https://twitter.com/WiproDigital
http://wiprodigital.com/tag/agile/
Problem Accessing 'http://wiprodigital.com/tag/agile/': HTTP error fetching URL
http://wiprodigital.com/tag/customer-experience/
Problem Accessing 'http://wiprodigital.com/tag/customer-experience/': HTTP error fetching URL
http://wiprodigital.com/tag/digital-transformation-strategy/
Problem Accessing 'http://wiprodigital.com/tag/digital-transformation-strategy/': HTTP error fetching URL
http://wiprodigital.com/tag/enterprise-transformation-strategy/
Problem Accessing 'http://wiprodigital.com/tag/enterprise-transformation-strategy/': HTTP error fetching URL
http://wiprodigital.com/tag/martech/
Problem Accessing 'http://wiprodigital.com/tag/martech/': HTTP error fetching URL
http://wiprodigital.com/2018/01/23/how-marketing-fitness-will-close-the-achievement-gap/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F23%2Fhow-marketing-fitness-will-close-the-achievement-gap%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F23%2Fhow-marketing-fitness-will-close-the-achievement-gap%2F&title=How Marketing Fitness Will Close The Achievement Gap&summary=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F23%2Fhow-marketing-fitness-will-close-the-achievement-gap%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F23%2Fhow-marketing-fitness-will-close-the-achievement-gap%2F
http://inspiremartech.com/blog/85-marketers-missing-martech
http://chiefmartec.com/2017/08/whats-better-marketing-tech-stack-marketing-org-stack/
https://twitter.com/andycoghlan
http://wiprodigital.com/tag/digital-fitness/
Problem Accessing 'http://wiprodigital.com/tag/digital-fitness/': HTTP error fetching URL
http://wiprodigital.com/tag/marketing-fitness/
Problem Accessing 'http://wiprodigital.com/tag/marketing-fitness/': HTTP error fetching URL
http://wiprodigital.com/2018/01/09/why-cmos-must-take-ownership-of-martech-to-drive-marketing-quality-and-value/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F09%2Fwhy-cmos-must-take-ownership-of-martech-to-drive-marketing-quality-and-value%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F09%2Fwhy-cmos-must-take-ownership-of-martech-to-drive-marketing-quality-and-value%2F&title=Why CMOs Must Take Ownership of MarTech to Drive Marketing Quality and Value&summary=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F09%2Fwhy-cmos-must-take-ownership-of-martech-to-drive-marketing-quality-and-value%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F09%2Fwhy-cmos-must-take-ownership-of-martech-to-drive-marketing-quality-and-value%2F
https://www.gartner.com/newsroom/id/3827963
https://www.gartner.com/doc/3772127/framework-choosing-digital-marketing-technology
https://twitter.com/chazledine
http://wiprodigital.com/tag/cmo/
Problem Accessing 'http://wiprodigital.com/tag/cmo/': HTTP error fetching URL
http://wiprodigital.com/tag/digital-strategy/
Problem Accessing 'http://wiprodigital.com/tag/digital-strategy/': HTTP error fetching URL
http://wiprodigital.com/tag/marketing-technology/
Problem Accessing 'http://wiprodigital.com/tag/marketing-technology/': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/2018/01/09/why-cmos-must-take-ownership-of-martech-to-drive-marketing-quality-and-value/': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/2018/01/23/how-marketing-fitness-will-close-the-achievement-gap/': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/2018/01/11/making-business-transformation-a-smash-hit-part-2-the-foundations-to-get-started-at-pace/': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/2018/01/25/designit-designing-for-the-forgotten/': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/2018/01/03/new-ways-of-working-to-understand-customers-you-must-understand-the-how-as-well-as-the-why/': HTTP error fetching URL
http://wiprodigital.com/news/vendor-profile-digital-cx-iot-by-pac-2018/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2Fnews%2Fvendor-profile-digital-cx-iot-by-pac-2018%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2Fnews%2Fvendor-profile-digital-cx-iot-by-pac-2018%2F&title=Vendor Profile: Digital CX & IoT by Pierre Audoin Consultants (PAC), 2018&summary=http%3A%2F%2Fwiprodigital.com%2Fnews%2Fvendor-profile-digital-cx-iot-by-pac-2018%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2Fnews%2Fvendor-profile-digital-cx-iot-by-pac-2018%2F
http://pac.wiprodigital.com/
http://pac.wiprodigital.com/#welcome
http://pac.wiprodigital.com/#panels
http://pac.wiprodigital.com/#download
https://www.pac-online.com/
https://www.pac-online.com/wipro-digital-new-way-working
https://www.pac-online.com/users/kholzhauserpac-onlinecom
http://wiprodigital.com/privacy-policy
Problem Accessing 'http://wiprodigital.com/privacy-policy': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/news/vendor-profile-digital-cx-iot-by-pac-2018/': HTTP error fetching URL
http://wiprodigital.com/news/report-envisions-the-connected-iot-future-of-2030-and-barriers-to-adoption/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2Fnews%2Freport-envisions-the-connected-iot-future-of-2030-and-barriers-to-adoption%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2Fnews%2Freport-envisions-the-connected-iot-future-of-2030-and-barriers-to-adoption%2F&title=New Report Envisions the Connected IoT Future of 2030 and Barriers to Adoption&summary=http%3A%2F%2Fwiprodigital.com%2Fnews%2Freport-envisions-the-connected-iot-future-of-2030-and-barriers-to-adoption%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2Fnews%2Freport-envisions-the-connected-iot-future-of-2030-and-barriers-to-adoption%2F
http://wiprodigital.com/2017/11/15/iot-sustainability-report-vision-2030-connected-future/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2017%2F11%2F15%2Fiot-sustainability-report-vision-2030-connected-future%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2017%2F11%2F15%2Fiot-sustainability-report-vision-2030-connected-future%2F&title=Vision 2030: A Connected Future&summary=http%3A%2F%2Fwiprodigital.com%2F2017%2F11%2F15%2Fiot-sustainability-report-vision-2030-connected-future%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2017%2F11%2F15%2Fiot-sustainability-report-vision-2030-connected-future%2F
https://www.forumforthefuture.org/
Problem Accessing 'https://www.forumforthefuture.org/': sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
Problem Accessing 'http://wiprodigital.com/2017/11/15/iot-sustainability-report-vision-2030-connected-future/': sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
http://www.wiprodigital.com/
http://wiprodigital.com/2017/12/21/collaborative-ai-will-revolutionize-the-way-we-work-and-interact/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2017%2F12%2F21%2Fcollaborative-ai-will-revolutionize-the-way-we-work-and-interact%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2017%2F12%2F21%2Fcollaborative-ai-will-revolutionize-the-way-we-work-and-interact%2F&title=Collaborative AI Will Revolutionize the Way We Work and Interact&summary=http%3A%2F%2Fwiprodigital.com%2F2017%2F12%2F21%2Fcollaborative-ai-will-revolutionize-the-way-we-work-and-interact%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2017%2F12%2F21%2Fcollaborative-ai-will-revolutionize-the-way-we-work-and-interact%2F
https://dupress.deloitte.com/dup-us-en/deloitte-review/issue-20/augmented-intelligence-human-computer-collaboration.html#endnote-37
https://www.fastcodesign.com/90146664/your-next-therapist-might-be-a-chatbot
https://twitter.com/tomgreenwood
http://wiprodigital.com/tag/artificial-intelligence/
Problem Accessing 'http://wiprodigital.com/tag/artificial-intelligence/': HTTP error fetching URL
http://wiprodigital.com/tag/human-centric-design/
Problem Accessing 'http://wiprodigital.com/tag/human-centric-design/': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/2017/12/21/collaborative-ai-will-revolutionize-the-way-we-work-and-interact/': HTTP error fetching URL
http://wiprodigital.com/2018/01/18/3-ways-businesses-can-use-iot-to-save-the-environment/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F18%2F3-ways-businesses-can-use-iot-to-save-the-environment%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F18%2F3-ways-businesses-can-use-iot-to-save-the-environment%2F&title=3 Ways Businesses Can Use IoT to Save The Environment&summary=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F18%2F3-ways-businesses-can-use-iot-to-save-the-environment%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2018%2F01%2F18%2F3-ways-businesses-can-use-iot-to-save-the-environment%2F
https://www.greenbiz.com/article/3-ways-businesses-can-use-internet-things-save-environment
https://www.economist.com/blogs/graphicdetail/2017/08/daily-chart-19
https://energy.gov/eere/amo/downloads/us-manufacturing-energy-use-and-greenhouse-gas-emissions-analysis
Problem Accessing 'http://wiprodigital.com/2018/01/18/3-ways-businesses-can-use-iot-to-save-the-environment/': sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
http://wiprodigital.com/cases/progressive-metering-a-utilitys-strategic-move-into-predictive-planning/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2Fcases%2Fprogressive-metering-a-utilitys-strategic-move-into-predictive-planning%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2Fcases%2Fprogressive-metering-a-utilitys-strategic-move-into-predictive-planning%2F&title=Thames Water: A Strategic Move into Predictive Planning&summary=http%3A%2F%2Fwiprodigital.com%2Fcases%2Fprogressive-metering-a-utilitys-strategic-move-into-predictive-planning%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2Fcases%2Fprogressive-metering-a-utilitys-strategic-move-into-predictive-planning%2F
http://www.thameswater.co.uk/
Problem Accessing 'http://wiprodigital.com/cases/progressive-metering-a-utilitys-strategic-move-into-predictive-planning/': HTTP error fetching URL
http://wiprodigital.com/cases/increasing-customer-value-through-iot-for-jcb-india/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2Fcases%2Fincreasing-customer-value-through-iot-for-jcb-india%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2Fcases%2Fincreasing-customer-value-through-iot-for-jcb-india%2F&title=JCB: Increasing Customer Value Through IoT&summary=http%3A%2F%2Fwiprodigital.com%2Fcases%2Fincreasing-customer-value-through-iot-for-jcb-india%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2Fcases%2Fincreasing-customer-value-through-iot-for-jcb-india%2F
https://www.jcbindia.com/
Problem Accessing 'https://www.jcbindia.com/': sun.security.validator.ValidatorException: PKIX path validation failed: java.security.cert.CertPathValidatorException: timestamp check failed
Problem Accessing 'http://wiprodigital.com/cases/increasing-customer-value-through-iot-for-jcb-india/': sun.security.validator.ValidatorException: PKIX path validation failed: java.security.cert.CertPathValidatorException: timestamp check failed
http://wiprodigital.com/cases/case-study-esab/
Problem Accessing 'http://wiprodigital.com/cases/case-study-esab/': HTTP error fetching URL
Problem Accessing 'http://www.wiprodigital.com/': HTTP error fetching URL
http://www.forumforthefuture.org
Problem Accessing 'http://www.forumforthefuture.org': sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
Problem Accessing 'http://wiprodigital.com/news/report-envisions-the-connected-iot-future-of-2030-and-barriers-to-adoption/': sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
Problem Accessing 'http://wiprodigital.com/#NewcontntAggr': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/#EvtcontntAggr': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/#CascontntAggr': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/#InscontntAggr': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/#AllcontntAggr': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/': HTTP error fetching URL
http://iot.wiprodigital.com/
http://iot.wiprodigital.com/#capabilities
http://iot.wiprodigital.com/#testbeds
http://iot.wiprodigital.com/#industries
http://iot.wiprodigital.com/#stories
http://iot.wiprodigital.com/#insights
http://iot.wiprodigital.com/#partners
http://iot.wiprodigital.com/#contactus
http://iot.wiprodigital.com/events/wef-2018/
http://iot.wiprodigital.com/events/wef-2018/#welcome
http://iot.wiprodigital.com/events/wef-2018/#panels
http://iot.wiprodigital.com/events/wef-2018/#rsvp
http://wiprodigital.com/people/jayraj-nair/
https://www.linkedin.com/in/jayraj-nair-5165239a
Problem Accessing 'https://www.linkedin.com/in/jayraj-nair-5165239a': HTTP error fetching URL
Problem Accessing 'http://wiprodigital.com/people/jayraj-nair/': HTTP error fetching URL
http://vision2030.wiprodigital.com/
http://vision2030.wiprodigital.com/#welcome
http://vision2030.wiprodigital.com/#report
Problem Accessing 'http://vision2030.wiprodigital.com/#report': sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
Problem Accessing 'http://vision2030.wiprodigital.com/#welcome': sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
Problem Accessing 'http://vision2030.wiprodigital.com/': sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
http://iot.wiprodigital.com/#collapseOne
http://iot.wiprodigital.com/#collapseTwo
http://iot.wiprodigital.com/#collapseThree
http://iot.wiprodigital.com/#collapseFour
http://iot.wiprodigital.com/#collapseFive
http://wiprodigital.com/2017/07/13/wearables-and-connected-workers-how-manufacturing-will-change-forever-part-1/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2017%2F07%2F13%2Fwearables-and-connected-workers-how-manufacturing-will-change-forever-part-1%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2017%2F07%2F13%2Fwearables-and-connected-workers-how-manufacturing-will-change-forever-part-1%2F&title=Wearables and Connected Workers: How Manufacturing Will Change Forever (Part 1)&summary=http%3A%2F%2Fwiprodigital.com%2F2017%2F07%2F13%2Fwearables-and-connected-workers-how-manufacturing-will-change-forever-part-1%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2017%2F07%2F13%2Fwearables-and-connected-workers-how-manufacturing-will-change-forever-part-1%2F
http://wiprodigital.com/2017/07/25/wearables-connected-workers-manufacturing-will-change-forever-part-2/
http://twitter.com/share?text=Wipro Digital&url=http%3A%2F%2Fwiprodigital.com%2F2017%2F07%2F25%2Fwearables-connected-workers-manufacturing-will-change-forever-part-2%2F&hashtags=wiprodigital
http://www.linkedin.com/shareArticle?mini=true&url=http%3A%2F%2Fwiprodigital.com%2F2017%2F07%2F25%2Fwearables-connected-workers-manufacturing-will-change-forever-part-2%2F&title=Wearables and Connected Workers: How Manufacturing Will Change Forever (Part 2)&summary=http%3A%2F%2Fwiprodigital.com%2F2017%2F07%2F25%2Fwearables-connected-workers-manufacturing-will-change-forever-part-2%2F&source=wiprodigital.com
https://www.facebook.com/dialog/share?app_id=785186781583414&display=popup&href=http%3A%2F%2Fwiprodigital.com%2F2017%2F07%2F25%2Fwearables-connected-workers-manufacturing-will-change-forever-part-2%2F
http://wiprodigital.com/tag/connected-workers/
Problem Accessing 'http://wiprodigital.com/tag/connected-workers/': HTTP error fetching URL
http://wiprodigital.com/tag/iot/


