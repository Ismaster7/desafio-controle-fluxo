package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Processo Seletivo");
		selecaoCandidato();
		/*analisarCandidato(2000.0);*/

	}
	
	static void selecaoCandidato() {
		String [] candidatos = {"Jose", "Jucelia", "Matheus", "Lucas", "jose", "alfredo", "mango", "typescript", "danibixa"};
		List<String> candidatosEscolhidos = new ArrayList<>();
		int candidatoAtual = 0;
		int salarioBase = 0;
		while(candidatosEscolhidos.size() < 5) {
			int salarioCandidato = valorPretendido();
			if(salarioCandidato >= salarioBase) {
				System.out.println("O candidato " + candidatos[candidatoAtual] + " Foi selecionado!");
				candidatosEscolhidos.add(candidatos[candidatoAtual]);
			}
			candidatoAtual++;
			
		}
		System.out.print(candidatosEscolhidos);
	}	
	
	static int valorPretendido() {
		return ThreadLocalRandom.current().nextInt(1800, 2200);
	}
	public ProcessoSeletivo() {
		// TODO Auto-generated constructor stub
	}
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.print("Ligar para o Candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.print("Ligar para candidato com contra-proposta");
		}else {
			System.out.print("Aguardando resultado dos demais candidatos");
		}
	}

}
