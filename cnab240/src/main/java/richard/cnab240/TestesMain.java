package richard.cnab240;

import richard.cnab240.modelo.registro.header.servico.HeaderLotePagamentoCreditoEmConta;

public class TestesMain {
	public static final int BANCO_BRASIL = 1;
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		new TestesMain();
	}
	
	public TestesMain() throws InstantiationException, IllegalAccessException {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
	}
	
	public void imprimeHeaderLote(HeaderLotePagamentoCreditoEmConta header){
		System.out.println("---------------Header do Lote---------------");
		System.out.println("\t\t\tC�digo do banco:"  + header.getControle().getBanco().getCodigo());
		System.out.println("\t\t\tLote de Servico: " + header.getControle().getLoteServico());
		System.out.println("\t\t\tTipo de Registro: " + header.getControle().getTipoRegistro() + " (" + header.getControle().getTipoRegistro().getCodigoTipo() + ")");
		System.out.println("\t\t\tServi�o: " + header.getServico().getTipoOperacao() + " (" + header.getServico().getTipoOperacao().getCodigo() + ")");
		System.out.println("\t\t\tForma de Lan�amento: " + header.getServico().getFormaLancamento());
		System.out.println("\t\t\tLayout do lote: " + header.getServico().getNumeroVersaoLayoutLote());
	}
}
