package ramos.monteiro.alex;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Email {
	
	private String remetente;
	private String destinatario;
	private Calendar dataEnvio;
	private Calendar dataRecebido;
	private String assunto;
	private String texto;
	public String getRemetente() {
		return remetente;
	}
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public Calendar getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(Calendar dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	public Calendar getDataRecebido() {
		return dataRecebido;
	}
	public void setDataRecebido(Calendar dataRecebido) {
		this.dataRecebido = dataRecebido;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	@Override
	public String toString() {
		return "Email [remetente=" + remetente + ", destinatario=" + destinatario + ", assunto=" + assunto + ", texto="
				+ texto + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(assunto, destinatario, remetente, texto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		return Objects.equals(assunto, other.assunto) && Objects.equals(destinatario, other.destinatario)
				&& Objects.equals(remetente, other.remetente) && Objects.equals(texto, other.texto);
	}
	public Email(String remetente, String destinatario, Calendar dataEnvio, Calendar dataRecebido, String assunto,
			String texto) {
		super();
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.dataEnvio = dataEnvio;
		this.dataRecebido = dataRecebido;
		this.assunto = assunto;
		this.texto = texto;
	}
	public Email() {
		super();
	}
	


	
	
	
	

}
