package sac.obras;

import java.util.Date;

public class InformacoesBuraco {

	Date dataEHora = new Date();
	
	private String rua;
	private String bairro;
        private String numeroReclamacao;
	private int tamanho;

	public InformacoesBuraco(String rua, String bairro, int tamanho,
			String numeroReclamacao, Date dataEHora) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.tamanho = tamanho;
		this.numeroReclamacao = numeroReclamacao;
		this.dataEHora = dataEHora;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getNumeroReclamacao() {
		return numeroReclamacao;
	}

	public void setNumeroReclamacao(String numeroReclamacao) {
		this.numeroReclamacao = numeroReclamacao;
	}

	public Date getDataEHora() {
		return dataEHora;
	}

	public void setDataEHora(Date dataEHora) {
		this.dataEHora = dataEHora;
	}

	@Override
	public String toString() {
		return "Data e hora da reclamação: " + dataEHora + ", Rua da reclamação: " + rua + ", Bairro da reclamação: "
				+ bairro + ", Tamanho do buraco: " + tamanho + ", Número da reclamação: " + numeroReclamacao + "]";
	}

}