# SNHU-CS305
Software Security

<p>Artemis Financial, a consulting company, develops financial plans that are individualized to each customer’s specific needs. These plans include savings, retirement, investments, and insurance. The company wants to use the most current and effective software security to modernize its operations.</p> 

<p>To ensure secure communications Artemis would like to add a file verification step to their web application. A checksum will be used as a data verification step when the web application is transferring data. </p>

<p>Data is becoming increasingly important to the point where bad actors will pay large sums of money to obtain it.  Keeping your code secure from the beginning will help to mitigate any potential threats to a company’s websites or applications. To protect Artemis customers from security issues I ran the code through Synk to look for possible instances of where malicious code could be injected.  I created a security certificate so that I could activate the SSL by converting and I added an algorithm cipher to encrypt the data.</p>

<p>Companies rely heavily on their reputation with their customers and customers expect a certain amount of respect when it comes to their private data.  Not only is it good practice to use secure coding when developing a website or application, but it’s also just an all-around good business. Numerous business entities have had their reputations severely tarnished because of customer data breaches, this is not good for the customer and even worse for the well-being and bottom line of the company.</p>

<p>The most challenging part for me was to try and get an approved SSL for a secure port, in the end, I was not able to accomplish this despite following the step properly the reason I believe is because Microsoft Web browsers will not accept a self-signed certificate and only approve CA certificates. After making changes to the code base (adding a cipher and SSL certificate) when the program was run as a Java project or a Maven project, I was able to get a checksum on port 8443 and Spring Boot ran without errors.  The dependency check report also showed that no new vulnerabilities were added from the changes. </p>

<p>Some resources I used to complete this assignment were the OWASP Dependency-Check Maven site to gather the latest version for my pom.xml file, the Oracle Java Se documentation for the generation of a certificate using the keytool function in the terminal, and finally YouTube to learn about how to initiate and SSL.</p>

If a future employer were to ask about my knowledge of application security, I would show them that I could run and read a dependency check and have to ability to suppress false positives. I can integrate algorithm ciphers to protect customer data and secure a network through an SSL certificate.
