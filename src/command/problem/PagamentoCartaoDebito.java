package command.problem;

public class PagamentoCartaoDebito {
	
	public void processarCompra(Compra compra) {
		System.out.println("Compra debitada!\n" + compra.getInfoNota());
	}

}
