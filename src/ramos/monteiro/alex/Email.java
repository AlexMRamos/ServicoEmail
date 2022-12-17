package ramos.monteiro.alex;

import java.util.Date;
import java.util.Objects;

public class Email {
	
	private String remetente;
	private String destinatario;
	private Date dataEnvio;
	private Date dataRecebido;
	private String assunto;
	private String texto;
	
	public Email(String remetente, Date dataEnvio, Date dataRecebido, String assunto, String texto) {
		this.remetente = remetente;
		this.dataEnvio = dataEnvio;
		this.dataRecebido = dataRecebido;
		this.assunto = assunto;
		this.texto = texto;
	}
	
	public String getRemetente() {
		return remetente;
	}
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
	public Date getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	public Date getDataRecebido() {
		return dataRecebido;
	}
	public void setDataRecebido(Date dataRecebido) {
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
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}


	@Override
	public String toString() {
		return "Email [remetente=" + remetente + ", destinatario=" + destinatario + ", dataEnvio=" + dataEnvio
				+ ", dataRecebido=" + dataRecebido + ", assunto=" + assunto + ", texto=" + texto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(assunto, dataEnvio, dataRecebido, remetente, texto);
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
		return Objects.equals(assunto, other.assunto) && Objects.equals(dataEnvio, other.dataEnvio)
				&& Objects.equals(dataRecebido, other.dataRecebido) && Objects.equals(remetente, other.remetente)
				&& Objects.equals(texto, other.texto);
	}


	
	
	
	

}
