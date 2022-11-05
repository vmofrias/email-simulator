package br.com.ldsk.email.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Email {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_remetente")
	private EmailUser remetente;
	
	@ManyToOne
	@JoinColumn(name = "id_destinatario")
	private EmailUser destinatario;
	
	private String mensagem;
	
}
