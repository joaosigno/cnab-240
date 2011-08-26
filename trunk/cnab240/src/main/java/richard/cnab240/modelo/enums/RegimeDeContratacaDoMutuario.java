package richard.cnab240.modelo.enums;

import richard.cnab240.util.ArquivoUtils;

/**
 * Código adotado pela FEBRABAN para identificar o regime de contratação do mutuário
 * @author Richard Mendes Madureira
 * @see H009
 *
 */
public enum RegimeDeContratacaDoMutuario {
	CLT(1, "CLT"),
	ESTATUTARIO(2, "Estatutário"),
	TEMPORARIO(3, "Temporário");
	
	public static final int TAMANHO_REGIME_DE_CONTRATACAO_DO_MUTUARIO = 1;
	private int codigo;
	private String descricao;
	
	private RegimeDeContratacaDoMutuario(int codigo, String descricao){
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
		return ArquivoUtils.getCampoNumerico(getCodigo(), TAMANHO_REGIME_DE_CONTRATACAO_DO_MUTUARIO);
	}
}
