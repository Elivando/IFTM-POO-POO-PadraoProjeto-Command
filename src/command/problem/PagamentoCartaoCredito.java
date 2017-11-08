package command.problem;

public class PagamentoCartaoCredito  {
	
	public void processarCompra(Compra compra) {
		System.out.println("Compra emitida!\n" + compra.getInfoNota());
	}

}
