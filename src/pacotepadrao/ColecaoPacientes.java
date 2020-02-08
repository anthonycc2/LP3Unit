package pacotepadrao;

public class ColecaoPacientes {

	private Paciente[] vetor;

	public ColecaoPacientes() {
		vetor = new Paciente[10];
		
		Paciente paciente1 = new Paciente(101, "Dick Vigarista");
		Paciente paciente2 = new Paciente(101, "Penelope Charmosa");
		Paciente paciente3 = new Paciente(101, "Rabugento");
		Paciente paciente4 = new Paciente(101, "Barao Vermelho");
		Paciente paciente5 = new Paciente(101, "Capitao Caverna");
		this.setPaciente(paciente1);
		this.setPaciente(paciente2);
		this.setPaciente(paciente3);
		this.setPaciente(paciente4);
		this.setPaciente(paciente5);
	}

	public Paciente getPaciente(int i) {
		return vetor[i];
	}

	public void setPaciente(Paciente paciente) {
		for (int i = 0; i < vetor.length; i++)
			if (vetor[i] == null)
				vetor[i] = paciente;
	}

}
