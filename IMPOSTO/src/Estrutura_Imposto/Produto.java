package Estrutura_Imposto;

public class Produto {

		 String nome;
		  private  double precoCusto;
		  private  double impostos;
		   private  double margemLucro;
	
		    Produto(String nome, double precoCusto, double impostos, double margemLucro) {
		        this.nome = nome;
		        this.precoCusto = precoCusto;
		        this.impostos = impostos;
		        this.margemLucro = margemLucro;
		    }
		    
		    double calcularPrecoVenda() {
		        double precoCustoFinal = this.precoCusto * (1 + this.impostos);
		        double precoVenda = precoCustoFinal * (1 + this.margemLucro);
		        return precoVenda;
		    }
	}


