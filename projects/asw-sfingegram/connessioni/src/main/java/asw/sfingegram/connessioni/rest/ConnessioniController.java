package asw.sfingegram.connessioni.rest;

import asw.sfingegram.connessioni.domain.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger; 
import java.util.*; 

@RestController
public class ConnessioniController {

	@Autowired 
	private ConnessioniService connessioniService; 

	private final Logger logger = Logger.getLogger(ConnessioniController.class.toString()); 

	/* Crea una nuova connessione con un autore. 
	* la richiesta contiene nel corpo una stringa della forma utente:autore */ 
	@PostMapping("/connessioniconautori")
	public ConnessioneConAutore createConnessioneConAutore(@RequestBody CreateConnessioneConAutoreRequest request) {
		String utente = request.getUtente();
		String autore = request.getAutore();
		logger.info("REST CALL: createConnessioneConAutore " + utente + ", " + autore); 
		ConnessioneConAutore connessione = connessioniService.createConnessioneConAutore(utente, autore);
		return connessione; 
	}	

	/* Crea una nuova connessione con un tipo. 
	* la richiesta contiene nel corpo una stringa della forma utente:tipo */ 
	@PostMapping("/connessionicontipi")
	public ConnessioneConTipo createConnessioneConTipo(@RequestBody CreateConnessioneConTipoRequest request) {
		String utente = request.getUtente();
		String tipo = request.getTipo();
		logger.info("REST CALL: createConnessioneConTipo " + utente + ", " + tipo); 
		ConnessioneConTipo connessione = connessioniService.createConnessioneConTipo(utente, tipo);
		return connessione; 
	}	

	/* Trova tutte le connessioni con autori. */ 
	@GetMapping("/connessioniconautori")
	public Collection<ConnessioneConAutore> getConnessioniConAutori() {
		Collection<ConnessioneConAutore> connessioni = null; 
		logger.info("REST CALL: getConnessioniConAutori"); 
		connessioni = connessioniService.getConnessioniConAutori();
		logger.info("REST CALL: getConnessioniConAutori: " + connessioni); 
		return connessioni;
	}

	/* Trova tutte le connessioni con autori di un utente. */ 
	@GetMapping("/connessioniconautori/{utente}")
	public Collection<ConnessioneConAutore> getConnessioniConAutori(@PathVariable String utente) {
		Collection<ConnessioneConAutore> connessioni = null; 
		logger.info("REST CALL: getConnessioniConAutori " + utente); 
		connessioni = connessioniService.getConnessioniConAutoriByUtente(utente);
		logger.info("REST CALL: getConnessioniConAutori " + utente + ": " + connessioni); 
		return connessioni;
	}

	/* Trova tutte le connessioni con tipi. */ 
	@GetMapping("/connessionicontipi")
	public Collection<ConnessioneConTipo> getConnessioniConTipi() {
		Collection<ConnessioneConTipo> connessioni = null; 
		logger.info("REST CALL: getConnessioniConTipi"); 
		connessioni = connessioniService.getConnessioniConTipi();
		logger.info("REST CALL: getConnessioniConTipi: " + connessioni); 
		return connessioni;
	}

	/* Trova tutte le connessioni con tipi di un utente. */ 
	@GetMapping("/connessionicontipi/{utente}")
	public Collection<ConnessioneConTipo> getConnessioniConTipi(@PathVariable String utente) {
		Collection<ConnessioneConTipo> connessioni = null; 
		logger.info("REST CALL: getConnessioniConTipi " + utente); 
		connessioni = connessioniService.getConnessioniConTipiByUtente(utente);
		logger.info("REST CALL: getConnessioniConTipi " + utente + ": " + connessioni); 
		return connessioni;
	}

}
