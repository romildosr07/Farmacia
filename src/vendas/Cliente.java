package vendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
	Scanner sc = new Scanner(System.in);
	private String cnpj;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;

	List<Cliente> clientes = new ArrayList<>();
	private String resp;

	public Cliente() {
	}

	public Cliente(String cnpj, String nome, String endereco, String email, String telefone) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void cadastrarCliente(){
		
		do {
		Cliente cli = new Cliente();
    		System.out.println("CADASTRO DE CLIENTES:");
        	System.out.println("-------------------------");
	    	System.out.println("digite o CNPJ:");
	    	System.out.print(">> ");
	    	this.cnpj = sc.nextLine();
	    	System.out.println("digite o Nome:");
	    	System.out.print(">> ");
	    	this.nome = sc.nextLine();
	    	System.out.println("digite o endereço:");
	    	System.out.print(">> ");
	    	this.endereco = sc.nextLine();
	    	System.out.println("digite o email:");
	    	System.out.print(">> ");
	    	this.email = sc.nextLine();
	    	System.out.println("digite o telefone:");
	    	System.out.print(">> ");
	    	this.telefone = sc.nextLine();
	    	
	    	clientes.add(cli);
	    	System.out.println("deseja cadastrar outro Cliente:");
			resp = sc.nextLine();
		} while (resp.equals("sim"));
        
    }

	@Override
	public String toString() {
		return "-----Cliente--------\n" + "    cnpj: " + cnpj + "\n" + "    nome: " + nome + "\n" + "endereco: "
				+ endereco + "\n" + "   email: " + email + "\n" + "telefone: " + telefone;
	}

}
