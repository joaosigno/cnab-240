package richard.cnab240.modelo.pojo;

import richard.cnab240.modelo.enums.TipoMoeda;
import richard.cnab240.util.ArquivoUtils;

public class Moeda {
	private static final int TAMANHO_MOEDA = 18;
	private TipoMoeda tipoMoeda;
	private Double quantidade;
	
	public Moeda(){
		
	}
	
	public Moeda(TipoMoeda tipoMoeda, Double quantidade){
		
	}

	public TipoMoeda getTipoMoeda() {
		return tipoMoeda;
	}

	public void setTipoMoeda(TipoMoeda tipoMoeda) {
		this.tipoMoeda = tipoMoeda;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(TAMANHO_MOEDA);
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getTipoMoeda().getSigla(), 3));
		sb.append(ArquivoUtils.getCampoDecimal(getQuantidade(), 10, 5));
		return sb.toString();
	}
}
