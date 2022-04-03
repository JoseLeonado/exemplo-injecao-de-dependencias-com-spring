package com.jlcb.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.jlcb.event.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalListener {
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Emitindo nota fiscal para cliente " + event.getCliente().getNome());
	}

}