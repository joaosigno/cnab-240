package richard.cnab240.modelo.pojo;

import richard.cnab240.modelo.enums.TipoInscricao;
import richard.cnab240.util.ArquivoUtils;

/**
 * Classe para suporte a criação de registros. Até o momento, utilizada em {@link Empresa}
 * @author richard
 *
 */
public class Inscricao {
	private static final int TAMANHO_TIPO_INSCRICAO = 15;
	
	private TipoInscricao tipoInscricao;
	private long numeroInscricao;

	public Inscricao() {
		setTipoInscricao(TipoInscricao.OUTROS);
		setNumeroInscricao(0);
	}

	public Inscricao(TipoInscricao tipoInscricao, int numeroInscricao){
		this.tipoInscricao = tipoInscricao;
		this.numeroInscricao = numeroInscricao;
	}
	
	public TipoInscricao getTipoInscricao() {
		return tipoInscricao;
	}

	public void setTipoInscricao(TipoInscricao tipoInscricao) {
		this.tipoInscricao = tipoInscricao;
	}

	public long getNumeroInscricao() {
		return numeroInscricao;
	}

	public void setNumeroInscricao(long numeroInscricao) {
		this.numeroInscricao = numeroInscricao;
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(TAMANHO_TIPO_INSCRICAO);
		sb.append(ArquivoUtils.getCampoNumerico(getTipoInscricao().getCodigo(), 1));
		sb.append(ArquivoUtils.getCampoNumerico(getNumeroInscricao(), 14));
		return sb.toString();
	}
}
