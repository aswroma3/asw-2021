package asw.sfingegram.enigmiseguiti.connessioni;

import asw.sfingegram.enigmiseguiti.domain.*; 

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.*; 

@Service 
@Primary 
public class ConnessioniServiceWebClient implements ConnessioniService {

	@Autowired 
	@Qualifier("loadBalancedWebClient")
    private WebClient loadBalancedWebClient;
	
	public Collection<ConnessioneConAutore> getConnessioniConAutoriByUtente(String utente) {
		Collection<ConnessioneConAutore> connessioni = null; 
        Flux<ConnessioneConAutore> response = loadBalancedWebClient
                .get()
				.uri("http://connessioni/connessioniconautori/{utente}", utente)
                .retrieve()
                .bodyToFlux(ConnessioneConAutore.class);
        try {
            connessioni = response.collectList().block();
        } catch (WebClientException e) {
            e.printStackTrace();
        }
		return connessioni; 
	}	

	public Collection<ConnessioneConTipo> getConnessioniConTipiByUtente(String utente) {
		Collection<ConnessioneConTipo> connessioni = null; 
        Flux<ConnessioneConTipo> response = loadBalancedWebClient
                .get()
				.uri("http://connessioni/connessionicontipi/{utente}", utente)
                .retrieve()
                .bodyToFlux(ConnessioneConTipo.class);
        try {
            connessioni = response.collectList().block();
        } catch (WebClientException e) {
            e.printStackTrace();
        }
		return connessioni; 
	}	

}
