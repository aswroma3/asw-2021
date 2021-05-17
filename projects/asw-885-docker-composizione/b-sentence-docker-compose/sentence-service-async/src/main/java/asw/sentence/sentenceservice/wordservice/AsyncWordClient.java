package asw.sentence.sentenceservice.wordservice;

import java.util.concurrent.CompletableFuture;

public interface AsyncWordClient {

	public CompletableFuture<String> getWord(String service); 

}
