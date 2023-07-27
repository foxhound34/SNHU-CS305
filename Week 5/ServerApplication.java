package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}

@RestController
class ServerController{
//FIXME:  Add hash function to return the checksum value for the data string that should contain your name.    
    @RequestMapping("/hash")
    
    //Eclipse suggested adding throws 
    public String myHash() throws NoSuchAlgorithmException{
    	String data = "Derek Bamford";
    
    	//Reference https://www.tutorialspoint.com/java_cryptography/java_cryptography_message_digest.htm
    	//Creating the MessageDigest object
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
    	
    	//Passing data to the created MessageDigest Object
    	md.update(data.getBytes());
    	
    	//compute the message digest
    	byte[] dataDigest = md.digest();
    	
    	//Converting the byte array in to HexString format
        StringBuffer hexString = new StringBuffer();
        
        for (int i = 0;i<dataDigest.length;i++) {
           hexString.append(Integer.toHexString(0xFF & dataDigest[i]));
        }
       
        return "<p>Data: " + data + "<br>Name of the algorithm cipher used: SHA-256" + "<br>Checksum hash value: " + hexString.toString() + "</p>";
    }
}
