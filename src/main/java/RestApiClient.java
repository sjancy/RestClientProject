import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class RestApiClient {
	
	private static final String GET_ALL_TRANSACTION_API ="http://localhost:8080/api/v1/transactioncustomer";
	private static final String CREATE_TRANSACTION_API ="http://localhost:8080/api/v1/transactioncustomer";
	

	static RestTemplate restTemplate= new RestTemplate();
	public static void main(String[] args) {
		callGetAllTransactionAPI();
		callCreateUserAPI();
		
	}

	private static void callGetAllTransactionAPI() {
	
			HttpHeaders headers=new HttpHeaders();
			//List acceptList=new ArrayList();
		
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<String> entity = new HttpEntity<>(headers);
			ResponseEntity<String> result=restTemplate.exchange(GET_ALL_TRANSACTION_API, HttpMethod.GET, entity, String.class);
			System.out.println(result.getBody());
		}
	
	private static void callCreateUserAPI() {
		Transaction transaction=new Transaction();
	    transaction.setAccountId(101L);
	    transaction.setTransactionAmount(500.0);
	    transaction.setTransactionType("Deposit");
	    
    
	    ResponseEntity<Transaction> trans=restTemplate.postForEntity(CREATE_TRANSACTION_API, transaction, Transaction.class);
	    System.out.println(trans.getBody());
	}
	
	
}
