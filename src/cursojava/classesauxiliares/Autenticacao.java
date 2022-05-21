package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

public class Autenticacao {
	
	private PermitirAcesso acesso;

	public boolean autenticador() {
		return acesso.autenticar();
	}
	
	public Autenticacao(PermitirAcesso acesso) {
		this.acesso = acesso;
	}
}
