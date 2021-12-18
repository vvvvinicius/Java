/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque,
o programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

package POO;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Collections_1 
{
	public static void main(String args[])
	{		
		int op ;
		Scanner leia = new Scanner(System.in);
		boolean entrada = true;
		
		List <String> listaProdutos = new ArrayList <String> ();
			
		do
		{
				System.out.println("\n\n*~*~*~*~*~*~*~*~*~*");
				System.out.println("Estoque de produtos");
				System.out.println("*~*~*~*~*~*~*~*~*~*");
				
				try
				{
					System.out.println("\nEscolha uma ação:");
					System.out.println("\n(1) - Adicionar um produto");
					System.out.println("\n(2) - Remover um produto");
					System.out.println("\n(3) - Atualizar um produto");
					System.out.println("\n(4) - Mostrar todos os produto");
					System.out.println("\n(0) - Sair");
					System.out.printf("\n\nQual opção deseja usar?");
					op = leia.nextInt();
					
					switch(op)
					{
					case 0:
						
						leia.nextLine();
						entrada = false;
						System.out.println("\nVocê escolheu sair, programa finalizado.");
						break;
					case 1:
						
						leia.nextLine();
						System.out.printf("\nInforme qual produto deseja adicionar: ");
						String inserir = leia.nextLine();
						if(listaProdutos.contains(inserir))
						{
							System.out.println("\nProduto já existe no estoque.");
						}
						else
						{
							listaProdutos.add(inserir);
							System.out.println("\nCarregando...");
							System.out.println("\nProduto '"+inserir+ "' foi adicionado com sucesso!");
						}
						break;		
					case 2:
						leia.nextLine();
						System.out.printf("\nInforme qual produto deseja remover:");
						String excluir = leia.nextLine();
						if(listaProdutos.contains(excluir))
						{
							listaProdutos.remove(excluir);
							System.out.println("\nCarregando...");
							System.out.println("Produto '"+excluir+ "' foi removido com sucesso!");
						}
						else
						{		
							System.out.println("\nProduto não existe no estoque!");
						}
						break;
					case 3:
						leia.nextLine();
						System.out.printf("\nInforme qual produto deseja alterar: ");
						String alterar = leia.nextLine();
						
						if(listaProdutos.contains(alterar))
						{
							listaProdutos.remove(alterar);
							System.out.printf("\nInforme o nome do novo produto: ");
							String novo = leia.nextLine();
							listaProdutos.add(novo);
							System.out.println("\nCarregando...");
							System.out.println("O produto '"+alterar+"' foi alterado para '" +novo+ "' com sucesso!");
						}
						else
						{
							System.out.println("\nProduto não existe no estoque!");
						}
						break;
					case 4:
						leia.nextLine();
						System.out.println("\nOs produtos em estoque são:");
						System.out.println();
						
						for(int listar = 0;listar < listaProdutos.size(); listar++)
						{		
							System.out.printf("\n %d° da lista é: %s ",listar + 1, listaProdutos.get(listar));
						}
						
						break;
					default:				
						System.out.println("\nVocê escolheu uma opção inválida. Tente novamente.");
						break;
					}
				}
				catch(InputMismatchException inputMismatchException)
				{
					leia.nextLine();
					System.err.println("\nERRO: "+inputMismatchException+"\n");
					System.out.println("\n\t\tDIGITE APENAS O NÚMERO DA OPÇÃO!");					
				}							
			}
		while(entrada);		
		System.out.println("\nPrograma encerrado.");
	}
}