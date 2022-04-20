package br.com.fiap.liveonboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client {

    @Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "CLIENT_SEQ")
	@SequenceGenerator( name="CLIENT_SEQ", initialValue = 1, allocationSize = 1)    
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;
    
    @Column(name = "RG", nullable = false)
    private int RG;
    
    @Column(name = "CPF", nullable = false)
    private int CPF;
    
    @Column(name = "tipoConvenio", nullable = false)
    private String tipoConvenio;
    
    @Column(name = "seguradora", nullable = false)
    private String seguradora;
    
    @Column(name = "especialidade", nullable = false)
    private String especialidade;

    
	public int getRG() {
		return RG;
	}

	public void setRG(int rG) {
		RG = rG;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public String getTipoConvenio() {
		return tipoConvenio;
	}

	public void setTipoConvenio(String tipoConvenio) {
		this.tipoConvenio = tipoConvenio;
	}

	public String getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(String seguradora) {
		this.seguradora = seguradora;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    
    
    
}
