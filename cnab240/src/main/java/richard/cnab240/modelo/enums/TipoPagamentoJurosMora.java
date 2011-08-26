package richard.cnab240.modelo.enums;

import richard.cnab240.util.ArquivoUtils;

/**
 * Código Adotado pela FEBRABAN para identificação do tipo de pagamento de juros de mora.
 * @see C018
 * @author Richard Mendes Madureira
 *
 */
public enum TipoPagamentoJurosMora {
	VALOR_POR_DIA(1, "Valor por Dia"),
	TAXA_MENSAL(2, "Taxa Mensal"),
	ISENTO(3, "Isento");
	
	private static final int TAMANHO_TIPO_PAGAMENTO_JUROS_MORA = 1;
	private int codigo;
	private String descricao;
	
	private TipoPagamentoJurosMora(int codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	@Override
	public String toString() {
		return ArquivoUtils.getCampoNumerico(getCodigo(), TAMANHO_TIPO_PAGAMENTO_JUROS_MORA);
	}
}
