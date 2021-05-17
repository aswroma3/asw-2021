package asw.sentence.sentenceservice.rest;

import asw.sentence.sentenceservice.domain.SentenceService; 

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.Instant; 
import java.time.Duration; 

import java.util.logging.Logger; 

import java.net.InetAddress;

@RestController
public class SentenceController {

	@Autowired 
	private SentenceService sentenceService;

	@Value("${asw.sentence.sentenceservice.delay:0}") 
	/* ritardo da introdurre */ 
	private int delay;

	@Value("${asw.sentence.sentenceservice.instancename:}") 
	/* nome dell'istanza */ 
	private String instanceName;

	/* nome dell'host */ 
	private String hostname = this.getHostname(); 

	private final Logger logger = Logger.getLogger(SentenceController.class.toString()); 

	@GetMapping("/")
	public String getSentence() {
		Instant start = Instant.now();
		String sentence = sentenceService.getSentence(); 
		if (delay>0) {
			this.sleep(delay); 
		}
		Duration duration = Duration.between(start, Instant.now()); 
		if (instanceName.equals("@")) {
			sentence += " [" + hostname + ":" + delay + ":" + duration.toMillis() + "]";
		} else if (instanceName.length()>0) {
			sentence += " [" + instanceName + ":" + delay + ":" + duration.toMillis() + "]";
		}
		logger.info("getSentence(): " + sentence);
		return sentence; 
	}

	/* Introduce un ritardo di delay millisecondi. */
	private void sleep(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {}
	}

	/* Calcola l'hostname di questo nodo */
	private String getHostname() {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            String hostname = ip.getHostName();
			String ipAddress = ip.getHostAddress(); 
			// hostname += " (" + ipAddress + ")"; 
			return hostname; 
        } catch (Exception e) {
            // e.printStackTrace();
        }
		return null; 
	}
	
}
