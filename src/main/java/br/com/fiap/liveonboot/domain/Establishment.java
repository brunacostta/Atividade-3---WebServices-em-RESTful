package br.com.fiap.liveonboot.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESTABLISHMENT")
public class Establishment {

	@Id
	//@GeneratedValue(generator = "uuid2")
    @Column(name = "ID", nullable = false)
	private UUID id;

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;
    
    @Column(name = "VALUE", nullable = false)
    private long value;

    
	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    
    
    
}
