package com.jlcb.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jlcb.model.Cliente;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {

	@Autowired
	private NotificadorProperties notificadorProperties;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Host: " + notificadorProperties.getHostServidor());
		System.out.println("Porta: " + notificadorProperties.getPortaServidor());
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}