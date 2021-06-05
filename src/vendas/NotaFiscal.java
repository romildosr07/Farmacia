package vendas;

import java.util.ArrayList;
import java.util.Scanner;

public class NotaFiscal {

	private String cnpjCliente;
	private String nomeProduto;
	private double valorTotal;
	private int quatidade;
	private double valorCompra;
	
	public NotaFiscal() {}
	
	public NotaFiscal(String cnpjCliente, String nomeProduto, double valorTotal, int quatidade, double valorCompra) {
		super();
		this.cnpjCliente = cnpjCliente;
		this.nomeProduto = nomeProduto;
		this.valorTotal = valorTotal;
		this.quatidade = quatidade;
		this.valorCompra = valorCompra;
	}

	public String getCnpjCliente() {
		return cnpjCliente;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public double getQuatidade() {
		return quatidade;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setCnpjCliente(String cnpjCliente) {
		this.cnpjCliente = cnpjCliente;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	@Override
	public String toString() {
		return  "Produto:  \n>> " + nomeProduto + " <<.........>> " + quatidade + " <<............>>" + valorTotal;
	}

	
	
	


}

    



