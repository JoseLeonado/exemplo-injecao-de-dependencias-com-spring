package com.jlcb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jlcb.model.Cliente;
import com.jlcb.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private Notificador notificador;

//	public AtivacaoClienteService() {
//	}
//	
//	@Autowired /* essa é a melhor opção */
//	public AtivacaoClienteService(Notificador notificadorEmail) {
//		this.notificador = notificadorEmail;
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
}