package asw.sentence.sentenceservice.wordservice;

import asw.sentence.sentenceservice.domain.AsyncWordService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CompletableFuture;

import java.util.logging.Logger; 

@Service 
public class VerbService implements AsyncWordService {

	private final Logger logger = Logger.getLogger(VerbService.class.toString()); 

	@Autowired 
	private AsyncWordClient wordClient;
	
	public CompletableFuture<String> getWord() {
		return wordClient.getWord("verb"); 
	}
	
}
