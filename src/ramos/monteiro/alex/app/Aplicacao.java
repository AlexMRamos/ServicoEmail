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
		Calendar amanha = Calendar.getInstance(); ontem.add(Calendar.DATE, +1);
		
		
		Email emailAlex = new Email("Alex","" ,hoje,hoje,"Dev PL", "Bom dia Senhores");
		Email emailDaniel = new Email("Daniel","", hoje,hoje,"Dev PL", "Boa Tarde Senhor");
		Email emailDaniel1 = new Email("Daniel","", ontem,hoje,"Vaga Nava", "Boa Tarde Senhor");
		Email emailDaniel2 = new Email("Daniel","", amanha,amanha,"Vaga Nava", "Boa Tarde Senhor");
		Email emailHotts = new Email("Hotts","", ontem,ontem,"Analista PL", "Bom noite Colega");
		Email emailHotts1 = new Email("Hotts","", ontem,ontem,"Fofo bb", "Bom noite Colega");
		Email emailHotts2 = new Email("Hotts","", amanha,amanha,"Fofo bb", "Bom noite Colega");
		Email emailLucas = new Email("Lucas","", hoje,hoje,"Fofo bb", "Bom noite Colega");
		Email emailPortugal = new Email("Mario@Portugal.com","", hoje,hoje,"Oportunidade Emprego", "Bom noite Amigo Desenvolvedor");
		
		
		Map<String, List<Email>> caixaEntrada = new HashMap<>();
		caixaEntrada.put(emailAlex.getRemetente(), new ArrayList<>());
				
		MailMap emailMap = new MailMap(emailAlex.getRemetente(), caixaEntrada);

		
		emailMap.recebeEmail(emailDaniel);
		emailMap.recebeEmail(emailDaniel);
		emailMap.recebeEmail(emailDaniel);
		emailMap.recebeEmail(emailDaniel1);
		emailMap.recebeEmail(emailHotts);
		emailMap.recebeEmail(emailHotts);
		emailMap.recebeEmail(emailHotts1);
		emailMap.recebeEmail(emailHotts1);
		emailMap.recebeEmail(emailLucas);
		emailMap.recebeEmail(emailPortugal);
		emailMap.recebeEmail(emailHotts2);
		emailMap.recebeEmail(emailHotts2);
		emailMap.recebeEmail(emailDaniel2);
		
		
		
		
		System.out.println("Total de Email de  Alex: " + emailMap.totalEmailRemetente(emailAlex.getRemetente()));
		System.out.println("Total de Email de  Daniel: " + emailMap.totalEmailRemetente(emailDaniel.getRemetente()));
		System.out.println("Total de Email de  Hotts: " + emailMap.totalEmailRemetente(emailHotts.getRemetente()));
		
		System.out.println("Total de Email's: " + emailMap.totalEmail());
		
		List<String> assuntos = new ArrayList<>();
		assuntos.add("Dev");
		
		
		List<Email>listaBusca = emailMap.buscaListaEmailsPorAssunto(assuntos);
		 Map<String,List<Email>>mapBusca = emailMap.buscaConjuntoEmailsPorAssunto(assuntos);
		
		System.out.println("Lista Email's por assunto: ");
		System.out.println(listaBusca.toString());
		System.out.println("Colecao Email's por assunto: ");
		System.out.println(mapBusca.toString());
		
		System.out.println("Total de Email's: " + emailMap.totalEmail());
		System.out.println("Total de Email por rementente =  Hotts: " + emailMap.totalEmailRemetente(emailHotts.getRemetente()));
		
		List<Email> emailRecebidosHoje = emailMap.emailRecebidosHoje(emailMap.getCaixaEmail().get(emailAlex.getRemetente()));
		System.out.println("Total de Emails Hoje: " + emailRecebidosHoje.size());
		System.out.println(emailRecebidosHoje.toString());


		
		System.out.println("Total de Email's: " + emailMap.totalEmail());
		emailMap.removerEmailPorData(emailMap.getCaixaEmail().get(emailMap.getEmail()), hoje);
		System.out.println("Total de Email Apos remocao por Data: " + emailMap.totalEmail());
		

		
		System.out.println("Total de Email's: " + emailMap.totalEmail());
		System.out.println("Email's: " + emailMap.getCaixaEmail().get(emailAlex.getRemetente()).toString());


		emailMap.removerEmailPorPalavraAssunto(emailMap.getCaixaEmail().get(emailAlex.getRemetente()), assuntos);

		System.out.println("Total de Email's apos remocao por Assunto:" + emailMap.totalEmail());
		
		
		
		System.out.println("Total Daniel Antes: " + emailMap.totalEmailRemetente(emailHotts2.getRemetente()));
		emailMap.removerEmailPorRemetenteData(emailMap.getCaixaEmail().get(emailMap.getEmail()), hoje, emailHotts2.getRemetente());
		System.out.println("Total de Email Daniel Apos remocao por Data e Remetente: " + emailMap.totalEmailRemetente(emailHotts2.getRemetente()));
		
		System.out.println(emailMap.buscaListaEmailsPorOrigem("Portugal").toString());
		

		
	}

}
