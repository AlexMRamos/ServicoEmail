package ramos.monteiro.alex.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ramos.monteiro.alex.Email;
import ramos.monteiro.alex.MailMap;

public class Aplicacao {

	public static void main(String[] args) {
		
		
		
		Email emailAlex = new Email("Alex", new Date(),new Date(),"Dev PL", "Bom dia Senhores");
		Email emailDaniel = new Email("Daniel", new Date(),new Date(),"Dev PL", "Boa Tarde Senhor");
		Email emailHotts = new Email("Hotts", new Date(),new Date(),"Analista PL", "Bom noite Colega");
		
		
		Map<String, List<Email>> caixaEntrada = new HashMap<>();
		caixaEntrada.put(emailAlex.getRemetente(), new ArrayList<>());
				
		MailMap emailMap = new MailMap(emailAlex.getRemetente(), caixaEntrada);

		
//		caixaEntrada.put(emailAlex.getRemetente(), List.of(emailDaniel,emailDaniel,emailDaniel,emailDaniel,emailHotts,emailHotts));
		emailMap.recebeEmail(emailDaniel);
		emailMap.recebeEmail(emailDaniel);
		emailMap.recebeEmail(emailDaniel);
		emailMap.recebeEmail(emailHotts);
		emailMap.recebeEmail(emailHotts);
		
		
//		
//		
//		System.out.println("Total de Email de  Alex: " + emailMap.totalEmailRemetente(emailAlex.getRemetente()));
//		System.out.println("Total de Email de  Daniel: " + emailMap.totalEmailRemetente(emailDaniel.getRemetente()));
//		System.out.println("Total de Email de  Hotts: " + emailMap.totalEmailRemetente(emailHotts.getRemetente()));
//		
//		System.out.println("Total de Email's: " + emailMap.totalEmail());
		
		List<String> assuntos = new ArrayList<>();
		assuntos.add("Dev");
		
		
		List<Email>listaBusca = emailMap.buscaEmailsPorAssunto(assuntos);
		
		System.out.println(listaBusca.size());
		
		

		
	}

}
