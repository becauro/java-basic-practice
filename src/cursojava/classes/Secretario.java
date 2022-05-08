package cursojava.classes;

public class Secretario extends Pessoa {
	
	String registro;
	String nivelCargo;
	String experiencia;
	
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
	public String toString() {
		return "Secretario [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia="
				+ experiencia + "]";
	}
		
}
