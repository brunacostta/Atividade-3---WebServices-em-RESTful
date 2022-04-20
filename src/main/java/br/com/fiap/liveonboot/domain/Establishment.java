package br.com.fiap.liveonboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ESTABLISHMENT")
public class Establishment {

    @Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "ESTABLISHMENT_SEQ")
	@SequenceGenerator( name="ESTABLISHMENT_SEQ", initialValue = 1, allocationSize = 1)    
    @Column(name = "ID", nullable = false)
    private Long id;

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
