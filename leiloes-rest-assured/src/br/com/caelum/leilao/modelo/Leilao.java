package br.com.caelum.leilao.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Leilao {
	
	private Long id;
	private String nome;
	private Double valorInicial;
	private Usuario usuario;
	private boolean usado;
	
	public Leilao() {}
	
	public Leilao(Long id, String nome, Double valorInicial, Usuario usuario,
			boolean usado) {
		this.setId(id);
		this.nome = nome;
		this.valorInicial = valorInicial;
		this.usuario = usuario;
		this.usado = usado;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	public Double getValorInicial() {
		return valorInicial;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
