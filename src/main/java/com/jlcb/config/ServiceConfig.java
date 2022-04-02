package com.jlcb.config;

import org.springframework.context.annotation.Bean;

import com.jlcb.notificacao.Notificador;
import com.jlcb.service.AtivacaoClienteService;

public class ServiceConfig {
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}

}