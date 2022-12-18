package ramos.monteiro.alex.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ramos.monteiro.alex.Email;
import ramos.monteiro.alex.MailMap;

public class Aplicacao {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();
		Calendar ontem = Calendar.getInstance(); ontem.add(Calendar.DATE, -1);
		
		Email emailAlex = new Email("Alex","" ,Calendar.getInstance(),Calendar.getInstance(),"Dev PL", "Bom dia Senhores");
		Email emailDaniel = new Email("Daniel","", Calendar.getInstance(),Calendar.getInstance(),"Dev PL", "Boa Tarde Senhor");
		Email emailHotts = new Email("Hotts","", ontem,ontem,"Analista PL", "Bom noite Colega");
		
		
		Map<String, List<Email>> caixaEntrada = new HashMap<>();
		caixaEntrada.put(emailAlex.getRemetente(), new ArrayList<>());
				
		MailMap emailMap = new MailMap(emailAlex.getRemetente(), caixaEntrada);

		
		emailMap.recebeEmail(emailDaniel);
		emailMap.recebeEmail(emailDaniel);
		emailMap.recebeEmail(emailDaniel);
		emailMap.recebeEmail(emailHotts);
		emailMap.recebeEmail(emailHotts);
		
		
		
		
		System.out.println("Total de Email de  Alex: " + emailMap.totalEmailRemetente(emailAlex.getRemetente()));
		System.out.println("Total de Email de  Daniel: " + emailMap.totalEmailRemetente(emailDaniel.getRemetente()));
		System.out.println("Total de Email de  Hotts: " + emailMap.totalEmailRemetente(emailHotts.getRemetente()));
		
		System.out.println("Total de Email's: " + emailMap.totalEmail());
		
		List<String> assuntos = new ArrayList<>();
		assuntos.add("Dev");
		
		
		List<Email>listaBusca = emailMap.buscaListaEmailsPorAssunto(assuntos);
		 Map<String,List<Email>>mapBusca = emailMap.buscaConjuntoEmailsPorAssunto(assuntos);
		
		System.out.println(listaBusca.toString());
		System.out.println(mapBusca.toString());
		
		System.out.println("Total de Email's: " + emailMap.totalEmail());
		System.out.println("Total de Email de  Hotts: " + emailMap.totalEmailRemetente(emailHotts.getRemetente()));

		
		emailMap.removerEmailPorData(emailMap.getCaixaEmail().get(emailMap.getEmail()), hoje);
		
		
		System.out.println("Total de Email's: " + emailMap.totalEmail());
		System.out.println("Total de Email de  Hotts: " + emailMap.totalEmailRemetente(emailHotts.getRemetente()));
		

		
	}

}
