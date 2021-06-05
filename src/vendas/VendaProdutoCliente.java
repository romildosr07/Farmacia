package vendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendaProdutoCliente {
	public static void main(String[] args) {

		
		List<Produto> produtos = new ArrayList<>();
		List<NotaFiscal> nf = new ArrayList<>();
		Produto pro;
		NotaFiscal nota = new NotaFiscal();
		Cliente cli = new Cliente();
		 String resp;
		

		Scanner sc = new Scanner(System.in);

		System.out.println("======================");
		System.out.println("PHARMACIA PAGUE MAIS");
		System.out.println("======================");

		do {
			System.out.println("Escolha uma opção ");
			System.out.println("-------------------");
			System.out.println(" - Cadastrar Cliente \n - Cadastrar Produto \n - Fazer Venda ");
			System.out.println("--------------------");
			System.out.print(">> ");
			resp = sc.nextLine();

			switch (resp) {
			case "cadastrar cliente":
				
					cli.cadastrarCliente();
					
				break;
			case "cadastrar produto":
				do {
					pro = new Produto();
					pro.cadastrarProduto();
					produtos.add(pro);
					System.out.println("deseja cadastrar outro Produto:");
					resp = sc.nextLine();
				} while (resp.equals("sim"));
				break;
		/*	case "fazer venda":
				// vpc.realizarVenda();

				System.out.println("Digite o CNPJ do cliente: ");
				String cnpj = sc.nextLine();
				Integer test = temNalistaCliente(clientes, cnpj);
				Double total = 0.0;
				if (test >= 0) {
					System.out.println("---------VENDA----------:");
					System.out.println("-------------------------");
					do {
						nota = new NotaFiscal();
						System.out.println("Digite o produto");
						String produto = sc.nextLine();
						Integer pos = temNalistaProduto(produtos, produto);
						if (pos >= 0) {
							System.out.println("digite a Quantidade:");
							Integer qtd = sc.nextInt();
							nota.setCnpjCliente(clientes.toString());
							nota.setNomeProduto(produto);
							nota.setQuatidade(qtd);
							nota.setValorTotal(qtd * produtos.get(pos).getValouUnitario());
							nf.add(nota);

							total += nota.getValorTotal();
							sc.nextLine();
							System.out.println("Deseja continuar");
							resp = sc.nextLine();
						}
					} while (resp.equals("sim"));
					nota.setValorCompra(total);
				} else {
					System.out.println("Cliente nao cadastrado");
				}

				break;*/
			default:
				System.out.println("Opção Invalida");
				break;
			}

			System.out.println("Deseja continuar: ");
			resp = sc.nextLine();
		} while (resp.equals("sim"));

		//System.out.println(nota.getCnpjCliente());
		for(Cliente per : cli.clientes) {
			System.out.println(per);
		}
		//System.out.println();
		//System.out.println("Valor Total -----------------------"+nota.getValorCompra());
		
		
	}

	public static Integer temNalistaCliente(List<Cliente> cliente, String cnpj) {
		for (int i = 0; i < cliente.size(); i++) {
			if (cliente.get(i).getCnpj().equals(cnpj)) {
				return i;
			}
		}
		return -1;
	}

	public static Integer temNalistaProduto(List<Produto> produto, String nome) {
		for (int i = 0; i < produto.size(); i++) {
			if (produto.get(i).getNome().equals(nome)) {
				return i;
			}
		}
		return -1;
	}
}
