package br.com.ldsk.email.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class EmailUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String password;
	private String role;
	
	@OneToMany
	@Column(name = "email_enviado")
	private List<Email> emailEnviado;
	
	@OneToMany
	@Column(name = "email_recebido")
	private List<Email> emailRecebido;
	
}
