package mood13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Recebendo quantidade de nomes
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a quantidades de nomes você quer adicionar");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		//Criando os Arrays que guarda os itens
		String[] nomesMasculinos = new String[quantidade];
		String[] nomesFemininos = new String[quantidade];
		int masculinosCount = 0, femininosCount = 0;
		
		//Criando o loop 
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Adicione o nome e o gênero('M' para masculinos e 'F' para femininos):");
			String entrada = sc.nextLine();
			
			//Usando o metodo split para separar nome e genero
			String[] partes = entrada.split("-");
			
			if(partes.length == 2) {
				String nome = partes[0].trim();
				String genero = partes[1].trim();
				
				//Adicionando os nomes e os generos nas Arrays
				if(genero.equals("M")) {
					nomesMasculinos[masculinosCount++] = nome + "-" + genero; 
				}else if(genero.equals("F")) {
					nomesFemininos[femininosCount++] = nome + "-" + genero;
				}else {
					System.out.println("Nome ou genero invalido");
					i--;
				}
			}else {
				System.out.println("Entrada invalidada");
				i--;
			}
		}
		
		//Exibindo nomes
		System.out.println("\nNomes masculinos: ");
		for(int i = 0; i < masculinosCount; i++) {
			System.out.println(nomesMasculinos[i]);
		}
		
		System.out.println("\nNomes femininos");
		for(int i = 0; i < femininosCount; i++) {
			System.out.println(nomesFemininos[i]);
		}
		
		sc.close();
	}

}
