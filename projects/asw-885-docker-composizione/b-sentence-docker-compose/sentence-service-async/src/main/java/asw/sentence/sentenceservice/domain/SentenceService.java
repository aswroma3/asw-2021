package asw.sentence.sentenceservice.domain;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CompletableFuture;

@Service 
public class SentenceService {

	@Autowired 
	private AsyncWordService subjectService;

	@Autowired 
	private AsyncWordService verbService;

	@Autowired 
	private AsyncWordService objectService;

	public String getSentence() {
		CompletableFuture<String> subject = subjectService.getWord(); 
		CompletableFuture<String> verb = verbService.getWord(); 
		CompletableFuture<String> object = objectService.getWord(); 
		CompletableFuture.allOf(subject, verb, object).join();
		String sentence = null; 
		try {
			sentence = subject.get() + " " + verb.get() + " " + object.get() + ".";
		} catch (Exception e) {
			sentence = "*****"; 
		}
		return sentence; 
	}

}
