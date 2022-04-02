package com.jlcb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jlcb.model.Cliente;
import com.jlcb.notificacao.NivelUrgencia;
import com.jlcb.notificacao.Notificador;
import com.jlcb.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;

//	@PostConstruct
	public void init() {
		System.out.println("INIT " + notificador);
	}

//	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}