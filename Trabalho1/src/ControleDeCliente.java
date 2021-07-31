import java.util.Scanner;
import java.util.ArrayList;

public class ControleDeCliente {
	
	public static void menu() {
		System.out.println("1 - Cadastro de novo cliente");
		System.out.println("2 - Buscar por cliente");
		System.out.println("3 - Cadastro de novo produto");
		System.out.println("4 - Buscar por produto");
		System.out.println("5 - Cadastro de venda");
		System.out.println("6 - mostrar produtos em estoque");
		System.out.println("7 - sair");
	}
	
		
	
	public static void main(String[] args) {

		boolean showMenu;
		
		showMenu = true;
		
		Scanner ler = new Scanner(System.in);

		ArrayList<String> cadastroCliente = new ArrayList();
		ArrayList<String> cadastroProduto = new ArrayList();
		
		cadastroCliente.add("nome1");
		cadastroCliente.add("endereço1");
		cadastroCliente.add("telefone1");
		cadastroCliente.add("nome2");
		cadastroCliente.add("endereço2");
		cadastroCliente.add("telefone2");
		cadastroCliente.add("nome3");
		cadastroCliente.add("endereço3");
		cadastroCliente.add("telefone3");
		cadastroCliente.add("nome4");
		cadastroCliente.add("endereço4");
		cadastroCliente.add("telefone4");
		cadastroCliente.add("nome5");
		cadastroCliente.add("endereço5");
		cadastroCliente.add("telefone5");
		cadastroCliente.add("nome6");
		cadastroCliente.add("endereço6");
		cadastroCliente.add("telefone6");
		cadastroCliente.add("nome7");
		cadastroCliente.add("endereço7");
		cadastroCliente.add("telefone7");
		cadastroCliente.add("nome8");
		cadastroCliente.add("endereço8");
		cadastroCliente.add("telefone8");
		cadastroCliente.add("nome9");
		cadastroCliente.add("endereço9");
		cadastroCliente.add("telefone9");
		cadastroCliente.add("nome10");
		cadastroCliente.add("endereço10");
		cadastroCliente.add("telefone10");
		
		cadastroProduto.add("nome do produto 1");
		cadastroProduto.add("descrição 1");
		cadastroProduto.add("10");
		cadastroProduto.add("30");
		cadastroProduto.add("2");
		cadastroProduto.add("nome do produto 2");
		cadastroProduto.add("descrição 2");
		cadastroProduto.add("40");
		cadastroProduto.add("3");
		cadastroProduto.add("10");
		cadastroProduto.add("nome do produto 3");
		cadastroProduto.add("descrição 3");
		cadastroProduto.add("100");
		cadastroProduto.add("4");
		cadastroProduto.add("40");
		cadastroProduto.add("nome do produto 4");
		cadastroProduto.add("descrição 4");
		cadastroProduto.add("12");
		cadastroProduto.add("65");
		cadastroProduto.add("5");
		cadastroProduto.add("nome do produto 5");
		cadastroProduto.add("descrição 5");
		cadastroProduto.add("5");
		cadastroProduto.add("5");
		cadastroProduto.add("5");
		cadastroProduto.add("nome do produto 6");
		cadastroProduto.add("descrição 6");
		cadastroProduto.add("69");
		cadastroProduto.add("58");
		cadastroProduto.add("4");
		cadastroProduto.add("nome do produto 7");
		cadastroProduto.add("descrição 7");
		cadastroProduto.add("25");
		cadastroProduto.add("700");
		cadastroProduto.add("40");
		cadastroProduto.add("nome do produto 8");
		cadastroProduto.add("descrição 8");
		cadastroProduto.add("18");
		cadastroProduto.add("70");
		cadastroProduto.add("9");
		cadastroProduto.add("nome do produto 9");
		cadastroProduto.add("descrição 9");
		cadastroProduto.add("10");
		cadastroProduto.add("100");
		cadastroProduto.add("1");
		cadastroProduto.add("nome do produto 10");
		cadastroProduto.add("descrição 10");
		cadastroProduto.add("30");
		cadastroProduto.add("10");
		cadastroProduto.add("1");
		
		
		while(showMenu == true) {
			int menu;
			menu();
			menu = ler.nextInt();
			switch(menu) {
				case 1: {
					int qntClient;
							
					System.out.print("Quantos clientes serão cadastrados?\n");
					qntClient = ler.nextInt();
					
					for(int i=0; i<qntClient; ++i) {
						String nome;
						String end;
						String tel;
						
						
						System.out.print("Qual é o nome do cliente?\n");
						nome = ler.nextLine();
						
						ler.nextLine();
						System.out.print("Qual é o endereço do cliente?\n");
						end = ler.nextLine();
						
						System.out.print("Qual é o telefone do cliente?\n");
						tel = ler.nextLine();
						
						cadastroCliente.add(nome);
						cadastroCliente.add(end);
						cadastroCliente.add(tel);		
					}
					showMenu = true;
					break;
				}
				case 2: {
					String nome;
					int opcao;
					String end;
					String tel;
					
			
					System.out.println("Digite o nome do cliente a ser pesquisado:");
					nome = ler.next();
					
					int SchN = cadastroCliente.indexOf(nome);
					if(SchN < 0) {
						System.out.print("Cliente não cadastrado");
					}else {
						while(SchN <  SchN + 2){
						    System.out.println(cadastroCliente.get(SchN));
						    SchN = SchN + 1;
						} 
						
						System.out.println("1 - Desejo alterar dados do cliente");
						System.out.println("2 - Voltar para o menu");
						opcao = ler.nextInt();
						
						if(opcao == 1) {
							while(SchN < SchN + 2){
							    cadastroCliente.remove(SchN);
							    SchN = SchN + 1;
							}
							
							System.out.print("Digite o novo nome:\n");
							nome = ler.nextLine();
							
							ler.nextLine();
							System.out.print("Digite o novo endereço:\n");
							end = ler.nextLine();
							
							System.out.print("Digite o novo telefone:\n");
							tel = ler.nextLine();
							
							cadastroCliente.add(nome);
							cadastroCliente.add(end);
							cadastroCliente.add(tel);
						}
					}
					break;
				}
				case 3: {
					int qntProduct;
					
							
					System.out.print("Quantos produtos serão cadastrados?\n");
					qntProduct = ler.nextInt();
					
					for(int i=0; i<qntProduct; ++i) {
						String nomeP;
						String desc;
						String vcomp;
						String lucro;
						String estoque;
						
						
						System.out.print("Qual é o nome do produto?\n");
						nomeP = ler.nextLine();
						
						ler.nextLine();
						System.out.print("Qual é a descrição do produto?\n");
						desc = ler.nextLine();
						
						System.out.print("Qual é o valor de compra do produto?\n");
						vcomp = ler.nextLine();
						
						System.out.print("Qual é a porcetagem de lucro do produto\n");
						lucro = ler.nextLine();
						
						System.out.print("Qual é a quantidade em estoque do produto?\n");
						estoque = ler.nextLine();
						
						cadastroProduto.add(nomeP);
						cadastroProduto.add(desc);
						cadastroProduto.add(vcomp);
						cadastroProduto.add(lucro);
						cadastroProduto.add(estoque);
					}
					break;
				}
				case 4: {
					String nomep;
					int opcao;
					String desc;
					String vcomp;
					String lucro;
					String estoque;
					
					System.out.print("Digite o nome do produto a ser pesquisado:\n");
					nomep = ler.nextLine();
					
					int SchN = cadastroProduto.indexOf(nomep);
					
					
					if(SchN<0) {
						System.out.print("Produto não cadastrado");
					}else {
						while(SchN < SchN + 4){
						    System.out.println(cadastroProduto.get(SchN));
						    SchN = SchN + 1;
						} 
						
						System.out.println("1 - Desejo alterar dados do produto");
						System.out.println("2 - Voltar para o menu");
						opcao = ler.nextInt();
						
						if(opcao == 1) {
							while(SchN < SchN + 4){
							    cadastroCliente.remove(SchN);
							    SchN = SchN + 1;
							}
							
							System.out.print("Digite o novo nome:\n");
							nomep = ler.nextLine();
							
							ler.nextLine();
							System.out.print("Digite a nova descrição:\n");
							desc = ler.nextLine();
							
							System.out.print("Digite o novo valor de compra:\n");
							vcomp = ler.nextLine();
							
							System.out.print("Digite a nova porcentagem de lucro:\n");
							lucro = ler.nextLine();
							
							System.out.print("Digite a nova quantidade de estoque:\n");
							estoque = ler.nextLine();
							
							cadastroProduto.add(nomep);
							cadastroProduto.add(desc);
							cadastroProduto.add(vcomp);
							cadastroProduto.add(lucro);
							cadastroProduto.add(estoque);
						}
					}	
					break;
				}
				case 5: {
					int i = 0;
					int j = 0;
					int client;
					int mlist;
					int continuar = 1;
					int prod;
				
					System.out.println("Slecione um cliente:\n");
					while(i<cadastroCliente.size()){
					    System.out.println(i + " - " + cadastroCliente.get(i));
					    i = i + 3;
					} 
					
					client = ler.nextInt();
					
					System.out.println("1 - mostrar lista de produtos");
					System.out.println("2 - ir para o menu");
					
					mlist = ler.nextInt();
					
					if(mlist==1) {
						while(continuar == 1) {
							while(j<cadastroProduto.size()){
							    System.out.println(j + " - " + cadastroProduto.get(j));
							    j = j + 5;
							}
							
							System.out.println("Selecione um produto:\n");
							prod = ler.nextInt();
							
							System.out.println("1 - cadastra mais vendas/ 2 - voltar para o menu");
							continuar = ler.nextInt();
						}
					}
					break;
				}
				case 6: {
					int i = 0;
					int j = 4;
					System.out.println("Produtos em estoque:\n");
					while(i<cadastroProduto.size()){
					    System.out.println(i + " - " + cadastroProduto.get(i) + " em estoque: "+ cadastroProduto.get(j));
					    i = i + 5;
					    j = j + 5;
					}
					showMenu = true;
					break;
				}
				case 7: {
					System.out.print("Programa encerrado");
					showMenu = false;
					break;
				}
				default:{
					System.out.println("Essa opção não é válida, por favor reinicie o programa.");
					showMenu = false;
				}
			}
		}	
	}
}
