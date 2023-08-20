package Estrutura_Imposto;

public class CalculadoraPrecos {

	public static void main(String[] args) {
		        double confins = 0.12;
		        double icms = 0.07;
		        double ipi = 0.08;
		        double iss = 0.05;
		        double cide = 0.10;
		        double csll = 0.04;
		        
		        Produto[] produtos = {
			            new Produto("Exemplo", 100.00, ipi+confins, 0.30),
			            new Produto("Arroz", 7.00, confins + icms + iss, 0.20),
			            new Produto("Feijao", 8.00, confins + icms + iss, 0.25),
			            new Produto("Carne", 9.00, confins + icms + ipi, 0.35),
			            new Produto("Cerveja", 3.00, confins + icms + iss + ipi, 0.30),
			            new Produto("Gas", 75.00, confins + icms + ipi, 0.15),
			            new Produto("Gasolina", 2.00, confins + icms + cide, 0.15)
			        };
		        for (Produto produto : produtos) {
		            double precoVenda1 = produto.calcularPrecoVenda();
		            System.out.println("Produto: " + produto.nome);
					System.out.printf("Preco de Venda: R$%.2f\n", precoVenda1);
		            System.out.println();
		        }
	}

}
