package ramos.monteiro.alex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MailMap {

	private String email;
	private Map<String, List<Email>> caixaEmail;

	public MailMap() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Map<String, List<Email>> getCaixaEmail() {
		return caixaEmail;
	}

	public void setCaixaEmail(Map<String, List<Email>> caixaEmail) {
		this.caixaEmail = caixaEmail;
	}

	public MailMap(String email, Map<String, List<Email>> caixaEmail) {
		this.email = email;
		this.caixaEmail = caixaEmail;
	}		

	@Override
	public String toString() {
		return "MailMap [email=" + email + ", caixaEmail=" + caixaEmail + "]";
	}

	
//	a) Determinar o total de endereços a partir dos quais se recebeu mail;
	public long totalEmail() {	
		return this.caixaEmail.get(this.email).stream().count();
	}
	
//	b) Guardar um novo mail recebido;
	public void recebeEmail(Email email) {
		this.caixaEmail.get(this.email).add(email);
		
	}


//	c) Determinar quantos mails têm por origem um dado endereço; 
	public long totalEmailRemetente(String remetente) {	
		return this.caixaEmail.get(this.email).stream().filter(email -> email.getRemetente().equals(remetente)).count();
	}
	
//	d) Criar uma lista com todos os endereços que enviaram mails contendo no seu assunto uma lista de palavras dada como parâmetro;
	public List<Email> buscaEmailsPorAssunto(List<String> assunto){
		List<Email> emailAssunto = new ArrayList<>();
		this.caixaEmail.get(this.email).stream().filter(email -> buscaAssunto(email, assunto)).forEach(email -> emailAssunto.add(email));
		return emailAssunto;
	}

	private boolean buscaAssunto(Email email, List<String> assunto) {
		return assunto.stream().anyMatch(s -> s.contains(email.getAssunto()));
	}
	
	
	
	

}
