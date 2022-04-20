package br.com.fiap.liveonboot.domain;

import java.util.Calendar;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "ESTABLISHMENT")
public class Establishment {

	@Id
	//@GeneratedValue(generator = "uuid2")
    @Column(name = "ID", nullable = false)
	private UUID id;

    @Column(name = "NOME_ESTABELECIMENTO", length = 50, nullable = false)
    private String nome_estabelecimento;
    
    @Column(name = "VALOR", nullable = false)
    private long valor;
    
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_consulta")
    private Calendar dt_consulta;
	
	
	public String getNome_estabelecimento() {
		return nome_estabelecimento;
	}

	public void setNome_estabelecimento(String nome_estabelecimento) {
		this.nome_estabelecimento = nome_estabelecimento;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	public Calendar getDt_consulta() {
		return dt_consulta;
	}

	public void setDt_consulta(Calendar dt_consulta) {
		this.dt_consulta = dt_consulta;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

}
