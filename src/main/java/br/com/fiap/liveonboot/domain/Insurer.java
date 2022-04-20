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
@Table(name = "INSURER")
public class Insurer {
	
	
	@Id
	//@GeneratedValue(generator = "uuid2")
    @Column(name = "ID", nullable = false)
	private UUID id;

    @Column(name = "NOME_SEGURADORA", length = 50, nullable = false)
    private String nome_seguradora;
    
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_reembolso")
    private Calendar dt_reembolso;
    

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome_seguradora() {
		return nome_seguradora;
	}

	public void setNome_seguradora(String nome_seguradora) {
		this.nome_seguradora = nome_seguradora;
	}

	public Calendar getDt_reembolso() {
		return dt_reembolso;
	}

	public void setDt_reembolso(Calendar dt_reembolso) {
		this.dt_reembolso = dt_reembolso;
	}
   
    
}
