package com.jlcb.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.jlcb.event.ClienteAtivadoEvent;
import com.jlcb.notificacao.NivelUrgencia;
import com.jlcb.notificacao.Notificador;
import com.jlcb.notificacao.TipoDoNotificador;

@Component
public class NotificacaoListener {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
	}
	
}