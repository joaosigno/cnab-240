package richard.cnab240.modelo.registro.header.servico;

import richard.cnab240.modelo.enums.TipoOperacao;
import richard.cnab240.modelo.enums.TipoRegistro;
import richard.cnab240.modelo.pojo.Controle;
import richard.cnab240.modelo.pojo.Empresa;
import richard.cnab240.modelo.pojo.Saldo;
import richard.cnab240.modelo.pojo.Servico2;
import richard.cnab240.modelo.registro.header.HeaderLote;
import richard.cnab240.util.ArquivoUtils;

public class HeaderLoteExtratoContaCorrenteConciliacaoBancaria extends
		HeaderLote {

	private Controle controle;
	private Servico2 servico;
	private String campoExclusivoCNAB1;
	private Empresa empresa;
	private String campoExclusivoCNAB2;
	private Saldo saldoInicial;
	private String campoExclusivoCNAB3;

	public HeaderLoteExtratoContaCorrenteConciliacaoBancaria() {
		setControle(new Controle());
		getControle().setTipoRegistro(TipoRegistro.HEADER_DE_LOTE);
		setServico(new Servico2());
		getServico().setTipoOperacao(TipoOperacao.EXTRATO_PARA_CONCILIACAO);
		getServico().setNumeroVersaoLayoutLote(33);
		setCampoExclusivoCNAB1(ArquivoUtils.BRANCO);
		setEmpresa(new Empresa());
		setCampoExclusivoCNAB2(ArquivoUtils.BRANCO);
		setSaldoInicial(new Saldo());
		setCampoExclusivoCNAB3(ArquivoUtils.BRANCO);
	}

	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public Servico2 getServico() {
		return servico;
	}

	public void setServico(Servico2 servico) {
		this.servico = servico;
	}

	public String getCampoExclusivoCNAB1() {
		return campoExclusivoCNAB1;
	}

	public void setCampoExclusivoCNAB1(String campoExclusivoCNAB1) {
		this.campoExclusivoCNAB1 = campoExclusivoCNAB1;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getCampoExclusivoCNAB2() {
		return campoExclusivoCNAB2;
	}

	public void setCampoExclusivoCNAB2(String campoExclusivoCNAB2) {
		this.campoExclusivoCNAB2 = campoExclusivoCNAB2;
	}

	public Saldo getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Saldo saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public String getCampoExclusivoCNAB3() {
		return campoExclusivoCNAB3;
	}

	public void setCampoExclusivoCNAB3(String campoExclusivoCNAB3) {
		this.campoExclusivoCNAB3 = campoExclusivoCNAB3;
	}

	@Override
	public String getConteudoRegistro() {
		StringBuilder sb = new StringBuilder(TAMANHO_REGISTRO);
		sb.append(getControle().toString());
		sb.append(getServico().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB1(), 1));
		sb.append(getEmpresa().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB2(), 40));
		sb.append(getSaldoInicial().toString());
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB3(), 62));
		
		return sb.toString();
	}

}
