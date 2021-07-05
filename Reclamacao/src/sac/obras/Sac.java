package sac.obras;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Sac {

	public static void main(String[] args) {

		String msg = "1 - Registrar reclamação\n" + "2 - Excluir reclamação\n" + "3 - Consultar reclamação\n"
				+ "4 - Registrar conserto\n" + "5 - Sair\n";
		int opcao;
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		Reclamacoes reclamacao = new Reclamacoes();
		Date dataEHora = new Date();

		do {

			System.out.println("Digite o número para a ação: ");
			System.out.println(msg);
			opcao = ler.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite a rua do buraco: ");
				ler.nextLine();
				String rua = ler.nextLine();

				System.out.println("Digite o bairro: ");
				String bairro = ler.nextLine();

				System.out.println("Diga o tamanho do buraco de 0 a 10: ");
				int tamanho = ler.nextInt();

				String numeroReclamacao = gerador.nextInt(1000) + "1";
				InformacoesBuraco buraco = new InformacoesBuraco(rua, bairro, tamanho,
						numeroReclamacao, dataEHora);
				reclamacao.criarReclamacao(buraco, numeroReclamacao);

				System.out.println(buraco);
				System.out.println("Guarde bem este número: " + numeroReclamacao
						+ " somente com ele você poderá consultar/excluir a reclamação.");
				break;

			case 2:
				System.out.println("Digite o número da reclamação: ");
				String numeroReclama = ler.next();
				reclamacao.excluirReclamacao(numeroReclama);
				break;

			case 3:
				System.out.println("Digite o número da reclamação: ");
				String numeroReclama1 = ler.next();
				InformacoesBuraco consultarBuraco = reclamacao.consultarReclamacao(numeroReclama1);
				System.out.println(consultarBuraco);
				break;

			case 4:
				System.out.println("Digite o número da reclamação: ");
				String numeroReclama2 = ler.next();
				System.out.println("Digite o valor do conserto: ");
				double valorDoConserto = ler.nextDouble();
				Date dataEHoraConserto = new Date();
				reclamacao.consertarReclamacao(numeroReclama2, valorDoConserto, dataEHoraConserto);
				break;

			case 5:
				break;

			default:
				System.out.println("Opção inválida.");

			}

		} while (opcao != 5);

		ler.close();
	}
}
