package vendas;

import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
    
    private String codigo;
    private String nome;
    private Double valouUnitario;
    private Integer quantidade;
    private String fornecedor;

    public Produto() {
    }

    public Produto(String codigo, String nome, Double valouUnitario, Integer quantidade, String fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valouUnitario = valouUnitario;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

  
    
    public Scanner getSc() {
		return sc;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Double getValouUnitario() {
		return valouUnitario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void cadastrarProduto(){
    	
    	
    		System.out.println("CADASTRO DE PRODUTO:");
        	System.out.println("-------------------------");
	    	System.out.println("digite o Codigo do produto");
	    	codigo = sc.nextLine();
	    	System.out.println("digite o Nome:");
	    	nome = sc.nextLine();
	    	System.out.println("digite o valor:");
	    	valouUnitario = sc.nextDouble();
	    	System.out.println("digite a quantidade");
	    	quantidade = sc.nextInt();
	    	System.out.println("digite o fornecedor:");
	    	sc.nextLine();
	    	fornecedor = sc.nextLine();  
    }

    @Override
    public String toString() {
        return "-----Cliente--------\n" + 
               "        Codigo: " + codigo + "\n" +
        	   "          Nome: " + nome + "\n" + 
               "valor Unitario: " + valouUnitario + "\n" +
        	   "    Quantidade: " + quantidade + "\n" +
               "    Fornecedor: " + fornecedor;
    }
    
    
    
}
