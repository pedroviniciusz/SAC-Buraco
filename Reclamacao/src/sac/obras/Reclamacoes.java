package sac.obras;

import java.util.Date;
import java.util.HashMap;

public class Reclamacoes {

	HashMap<String, InformacoesBuraco> reclamacoes = new HashMap<String, InformacoesBuraco>();
	Date dataEHora = new Date();
	Date dataEHoraConserto = new Date();

	public void criarReclamacao(InformacoesBuraco info, String numeroReclamacao) {

		if (reclamacoes.get(numeroReclamacao) == null) {

			reclamacoes.put(info.getNumeroReclamacao(), info);
			System.out.println("Reclamação feita com sucesso.");

		} else {

			System.out.println("A reclamação não pôde ser concluída.");

		}

	}

	public InformacoesBuraco excluirReclamacao(String numeroReclamacao) {

		if (reclamacoes.get(numeroReclamacao) != null) {

			System.out.println("Removido com sucesso.");

			return reclamacoes.remove(numeroReclamacao);

		} else {

			System.out.println("Não foi possível remover a reclamação.");
			return null;

		}
	}

	public InformacoesBuraco consultarReclamacao(String numeroReclamacao) {

		if (reclamacoes.get(numeroReclamacao) != null) {

			System.out.println("A reclamação é: ");
			return reclamacoes.get(numeroReclamacao);

		} else {

			System.out.println("Não foi possível encontrar a reclamação.");
			return null;

		}

	}

	public InformacoesBuraco consertarReclamacao(String registrarConserto, double valorDoConserto, Date dataEHoraConserto) {

		if (reclamacoes.get(registrarConserto) != null) {

			System.out.println("Conserto no valor de: " + valorDoConserto + " registrado às: " + dataEHoraConserto);
			return reclamacoes.remove(registrarConserto);

		} else {

			System.out.println("Não foi possível registrar o conserto. ");
			return null;
		}

	}

}
