package command.problem;

public class Loja {
	protected String nomeDaLoja;

	public Loja(String nome) {
		nomeDaLoja = nome;
	}

	public void executarCompra(double valor) {
		Compra compra = new Compra(nomeDaLoja);
		compra.setValor(valor);
	}
}
