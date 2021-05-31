package asw.sentence.sentenceservice.domain;

import java.util.concurrent.CompletableFuture;

public interface AsyncWordService {

	public CompletableFuture<String> getWord(); 
	
}
