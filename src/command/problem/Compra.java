package command.problem;

public class Compra {
	 private static int CONTADOR_ID;
	    protected int idNotaFiscal;
	    protected String nomeDaLoja;
	    protected double valorTotal;
	 
	    public Compra(String nomeDaLoja) {
	        this.nomeDaLoja = nomeDaLoja;
	        idNotaFiscal = ++CONTADOR_ID;
	    }
	 
	    public void setValor(double valor) {
	        this.valorTotal = valor;
	    }
	 
	    public String getInfoNota() {
	        return new String("Nota fiscal nº: " + idNotaFiscal + "\nLoja: "
	                + nomeDaLoja + "\nValor: " + valorTotal);
	    }
	    
	    public void executarCompra(double valor, FormaDePagamento formaDePagamento) {
	        Compra compra = new Compra(nomeDaLoja);
	        compra.setValor(valor);
	        if(formaDePagamento == FormaDePagamento.CartaoDeCredito){
	            new PagamentoCartaoCredito().processarCompra(compra);
	        } else if(formaDePagamento == FormaDePagamento.CartaoDeDebito){
	            new PagamentoCartaoDebito().processarCompra(compra);
	        } else if(formaDePagamento == FormaDePagamento.Boleto){
	            new PagamentoBoleto().processarCompra(compra);
	        }
	    }
}
