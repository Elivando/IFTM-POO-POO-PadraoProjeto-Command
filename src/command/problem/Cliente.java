package command.problem;

public class Cliente {
	public static void main(String[] args) {
		Compra lojasNewHavana = new Compra("New Havana");
		lojasNewHavana.executarCompra(999.99, FormaDePagamento.CartaoDeCredito);
		lojasNewHavana.executarCompra(189.95, FormaDePagamento.Boleto);
		lojasNewHavana.executarCompra(100.00,  FormaDePagamento.CartaoDeDebito);

		Compra lojaTecCel = new Compra("Tec Cel");
		lojaTecCel.executarCompra(20.29,  FormaDePagamento.CartaoDeCredito);

	}
}
