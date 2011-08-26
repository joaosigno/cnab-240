package richard.cnab240.modelo.registro.detalhe.segmento;

import java.util.Date;

import richard.cnab240.modelo.anotacao.Registro;
import richard.cnab240.modelo.enums.FinalidadeMovimento;
import richard.cnab240.modelo.enums.TipoEnvio;
import richard.cnab240.modelo.enums.TipoRegistro;
import richard.cnab240.modelo.pojo.Cheque;
import richard.cnab240.modelo.pojo.Controle;
import richard.cnab240.modelo.pojo.Desconto2;
import richard.cnab240.modelo.pojo.Servico4;
import richard.cnab240.modelo.pojo.VersoCheque;
import richard.cnab240.modelo.registro.detalhe.RegistroDeDetalhe;
import richard.cnab240.util.ArquivoUtils;

@Registro(obrigatorio = true, tipoEnvio = TipoEnvio.REMESSA_OU_RETORNO, tipoRegistro=TipoRegistro.DETALHE)
public class CustodiaDeChequesSegmentoD extends RegistroDeDetalhe {
	private Controle controle;
	private Servico4 servico;
	private FinalidadeMovimento finalidadeMovimento;
	private Cheque cheque;
	private Date dataPrevistaParaCreditoOuDebito;
	private String seuNumero;
	private String usoBanco;
	private VersoCheque versoCheque;
	private Desconto2 desconto;
	private String campoExclusivoCNAB;
	private String ocorrencias;

	public CustodiaDeChequesSegmentoD() {

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

	public FinalidadeMovimento getFinalidadeMovimento() {
		return finalidadeMovimento;
	}

	public void setFinalidadeMovimento(FinalidadeMovimento finalidadeMovimento) {
		this.finalidadeMovimento = finalidadeMovimento;
	}

	public Cheque getCheque() {
		return cheque;
	}

	public void setCheque(Cheque cheque) {
		this.cheque = cheque;
	}

	public Date getDataPrevistaParaCreditoOuDebito() {
		return dataPrevistaParaCreditoOuDebito;
	}

	public void setDataPrevistaParaCreditoOuDebito(
			Date dataPrevistaParaCreditoOuDebito) {
		this.dataPrevistaParaCreditoOuDebito = dataPrevistaParaCreditoOuDebito;
	}

	public String getSeuNumero() {
		return seuNumero;
	}

	public void setSeuNumero(String seuNumero) {
		this.seuNumero = seuNumero;
	}

	public String getUsoBanco() {
		return usoBanco;
	}

	public void setUsoBanco(String usoBanco) {
		this.usoBanco = usoBanco;
	}

	public VersoCheque getVersoCheque() {
		return versoCheque;
	}

	public void setVersoCheque(VersoCheque versoCheque) {
		this.versoCheque = versoCheque;
	}

	public Desconto2 getDesconto() {
		return desconto;
	}

	public void setDesconto(Desconto2 desconto) {
		this.desconto = desconto;
	}

	public String getCampoExclusivoCNAB() {
		return campoExclusivoCNAB;
	}

	public void setCampoExclusivoCNAB(String campoExclusivoCNAB) {
		this.campoExclusivoCNAB = campoExclusivoCNAB;
	}

	public String getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(String ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	@Override
	public String getConteudoRegistro() {
		StringBuilder sb = new StringBuilder(TAMANHO_REGISTRO);
		sb.append(getControle().toString());
		sb.append(getServico().toString());
		sb.append(ArquivoUtils.getCampoNumerico(getFinalidadeMovimento().getCodigo(), 2));
		sb.append(getCheque().toString());
		sb.append(ArquivoUtils.getCampoDataFormatada(getDataPrevistaParaCreditoOuDebito()));
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getSeuNumero(), 20));
		sb.append(ArquivoUtils.getCampoNumerico(getUsoBanco(), 15));
		sb.append(getVersoCheque().toString());
		sb.append(getDesconto().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB(), 13));
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getOcorrencias(), 10));

		return sb.toString();
	}

}
