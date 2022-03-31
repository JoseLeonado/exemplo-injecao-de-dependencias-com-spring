package com.jlcb.notificacao;

import com.jlcb.model.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}