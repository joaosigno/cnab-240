package richard.cnab240.modelo.enums;

import richard.cnab240.util.ArquivoUtils;

/**
 * Código adotado pela FEBRABAN para identificar se o saldo correspondente à Natureza indicada no registro, na data e hora inicial, é Credor ou Devero
 * @author Richard Mendes Madureira
 * @see F005 E F012
 *
 */
public enum SituacaoSaldo {
	DEVEDOR("D", "Devedor"),
	CREDOR("C", "Credor");
	
	public static final int TAMANHO_SITUACAO_SALDO_INICIAL = 1;
	
	private String sigla;
	private String descricao;
	
	private SituacaoSaldo(String sigla, String descricao){
		this.sigla = sigla;
		this.descricao = descricao;
	}
	
	public String getSigla(){
		return sigla;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	@Override
	public String toString() {
		return ArquivoUtils.getCampoAlfaNumerico(getSigla(), TAMANHO_SITUACAO_SALDO_INICIAL);
	}
}
