package com.jlcb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jlcb.notificacao.NotificadorEmail;

@Configuration
public class NotificadorConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.jlcbmail.com.br");
		notificadorEmail.setCaixaAlta(true);
		return notificadorEmail();
	}

}