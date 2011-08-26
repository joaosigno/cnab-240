package richard.cnab240.modelo.pojo;

import java.util.Date;

import richard.cnab240.util.ArquivoUtils;

public class ControleCobranca {
	private static final int TAMANHO_CONTROLE_COBRANCA = 16;
	private int numeroRemessaRetorno;
	private Date dataGravacaoRemessaRetorno;
	public int getNumeroRemessaRetorno() {
		return numeroRemessaRetorno;
	}
	public void setNumeroRemessaRetorno(int numeroRemessaRetorno) {
		this.numeroRemessaRetorno = numeroRemessaRetorno;
	}
	public Date getDataGravacaoRemessaRetorno() {
		return dataGravacaoRemessaRetorno;
	}
	public void setDataGravacaoRemessaRetorno(Date dataGravacaoRemessaRetorno) {
		this.dataGravacaoRemessaRetorno = dataGravacaoRemessaRetorno;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(TAMANHO_CONTROLE_COBRANCA);
		sb.append(ArquivoUtils.getCampoNumerico(getNumeroRemessaRetorno(), 8));
		sb.append(ArquivoUtils.getCampoDataFormatada(getDataGravacaoRemessaRetorno()));
		
		return sb.toString();
	}
}
