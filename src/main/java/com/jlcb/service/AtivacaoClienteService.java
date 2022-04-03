package com.jlcb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.jlcb.event.ClienteAtivadoEvent;
import com.jlcb.model.Cliente;

@Component
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		applicationEventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}

}