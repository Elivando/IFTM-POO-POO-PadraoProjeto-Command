package command.problem;

public class PagamentoBoleto {

	public void processarCompra(Compra compra) {
		System.out.println("Boleto criado!\n" + compra.getInfoNota());
	}

}
