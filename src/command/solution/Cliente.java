package command.solution;

public class Cliente {
	public static void main(String[] args) {
		Loja lojasNewHavana = new Loja("New Havana");
		lojasNewHavana.executarCompra(999.99, new PagamentoCartaoCredito());
		lojasNewHavana.executarCompra(189.95, new PagamentoBoleto());
		lojasNewHavana.executarCompra(100.00, new PagamentoCartaoDebito());

		Loja lojaTecCel = new Loja("Tec Cel");
		lojaTecCel.executarCompra(20.29, new PagamentoCartaoCredito());

	}
}
