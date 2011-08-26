package richard.cnab240.modelo.enums;

import richard.cnab240.util.ArquivoUtils;

/**
 * C�digo adotado pela FEBRABAN se o título foi aceito (reconhecimento da dívida pelo Sacado).
 * @see C016
 * @author Richard Mendes Madureira
 *
 */
public enum IdentificadorTituloAceitoNaoAceito {
	ACEITE ("A", "Aceite"),
	NAO_ACEITE("N", "Não aceite");
	
	public static final int TAMANHO_IDENTIFICADOR_TITULO_ACEITO = 1;
	private String sigla;
	private String descricao;
	
	private IdentificadorTituloAceitoNaoAceito(String sigla, String descricao){
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
		return ArquivoUtils.getCampoAlfaNumerico(getSigla(),  TAMANHO_IDENTIFICADOR_TITULO_ACEITO);
	}
}
