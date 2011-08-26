package richard.cnab240.modelo.registro.detalhe.segmento;

import richard.cnab240.modelo.enums.TipoImpressao;
import richard.cnab240.modelo.enums.TipoRegistro;
import richard.cnab240.modelo.pojo.Controle;
import richard.cnab240.modelo.pojo.Servico4;
import richard.cnab240.modelo.registro.detalhe.RegistroDeDetalhe;
import richard.cnab240.util.ArquivoUtils;

public class TitulosEmCobrancaSegmentoS extends RegistroDeDetalhe {

	private Controle controle;
	private Servico4 servico;
	//TODO MELHORAR ISSO!
	private String infoImpressao;

	public TitulosEmCobrancaSegmentoS(TipoImpressao tipoImpressao) {
		setControle(new Controle());
		getControle().setTipoRegistro(TipoRegistro.DETALHE);
		setServico(new Servico4());
		getServico().setCodigoSegmento("S");
		
		if(tipoImpressao.equals(TipoImpressao.FRENTE_DO_BLOQUETO) || tipoImpressao.equals(TipoImpressao.VERSO_DO_BLOQUETO)){
			
		}else if(tipoImpressao.equals(TipoImpressao.CORPO_INSTRICUES_FICHA_COMPENSACAO__DO_BLOQUETO)){
			
		}
	}
	
	@Override
	public String getConteudoRegistro() {
		StringBuilder sb = new StringBuilder(TAMANHO_REGISTRO);
		sb.append(getControle().toString());
		sb.append(getServico().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(infoImpressao, 123));
		
		return sb.toString();
	}

	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public Servico4 getServico() {
		return servico;
	}

	public void setServico(Servico4 servico) {
		this.servico = servico;
	}

	public class TipoImpressao1E2 {
		public TipoImpressao tipoImpressao;
		public int numeroLinha;
		public String mensagem;
		public String tipoDeFonte;
		public String campoExclusivoCNAB;
	}

	public class TipoImpressao3{
		public TipoImpressao tipoImpressao;
		public String informacao5;
		public String informacao6;
		public String informacao7;
		public String informacao8;
		public String informacao9;
		public String campoExclusivoCNAB;
	}

}
