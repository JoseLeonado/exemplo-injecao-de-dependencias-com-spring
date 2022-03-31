package com.jlcb.service;

import org.springframework.stereotype.Component;

import com.jlcb.model.Cliente;
import com.jlcb.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificadorEmail;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificadorEmail.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}