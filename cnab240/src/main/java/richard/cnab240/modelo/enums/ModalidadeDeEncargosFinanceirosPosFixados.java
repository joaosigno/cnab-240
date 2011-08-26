package richard.cnab240.modelo.enums;

import richard.cnab240.util.ArquivoUtils;

public enum ModalidadeDeEncargosFinanceirosPosFixados {
	CDI_SOBRETAXA_MENSAL(1, "CDI + sobretaxa mensal"),
	PERCENTUAL_DO_CDI(2, "Percentual do CDI"),
	VARIACAO_CAMBIAL(3, "Variação Cambial");
	
	public static final int TAMANHO_MODALIDADE_DE_ENCARGOS_FINANCEIROS_POS_FIXADOS = 1;
	private int codigo;
	private String descricao;
	
	private ModalidadeDeEncargosFinanceirosPosFixados(int codigo, String descricao){
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
		return ArquivoUtils.getCampoNumerico(getCodigo(), TAMANHO_MODALIDADE_DE_ENCARGOS_FINANCEIROS_POS_FIXADOS);
	}
	
}
