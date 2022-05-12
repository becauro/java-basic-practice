package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	
	String registro;
	String nivelCargo;
	String experiencia;
	String user;
	String password;
		
	public Secretario(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	public Secretario() {
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	public String getNivelCargo() {
		return nivelCargo;
	}
	
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public double salario() {
		
		return 3800.00;
	} 

	@Override
	public String toString() {
		return "Secretario [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia="
				+ experiencia + "]";
	}
	
	
	@Override
	public boolean autenticar(String user, String password) {
		this.user = user;
		this.password = password;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return user.equals("Admin") && password.equals("Admin");
	} 
		
}
