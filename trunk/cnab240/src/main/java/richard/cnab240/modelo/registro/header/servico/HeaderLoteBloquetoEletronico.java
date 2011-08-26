package richard.cnab240.modelo.registro.header.servico;

import richard.cnab240.modelo.enums.TipoOperacao;
import richard.cnab240.modelo.enums.TipoRegistro;
import richard.cnab240.modelo.enums.TipoServico;
import richard.cnab240.modelo.pojo.Controle;
import richard.cnab240.modelo.pojo.Empresa2;
import richard.cnab240.modelo.pojo.Servico5;
import richard.cnab240.modelo.registro.header.HeaderLote;
import richard.cnab240.util.ArquivoUtils;

public class HeaderLoteBloquetoEletronico extends HeaderLote {
	private Controle controle;
	private Servico5 servico;
	private String campoExclusivoCNAB1;
	private Empresa2 empresa;
	private String campoExclusivoCNAB2;

	public HeaderLoteBloquetoEletronico() {
		setControle(new Controle());
		getControle().setTipoRegistro(TipoRegistro.HEADER_DE_LOTE);
		setServico(new Servico5());
		// FIXME Corrigir o tipo de operação. Não encontrei correspondente para I
		getServico().setTipoOperacao(TipoOperacao.LANCAMENTO_A_DEBITO); // ==1
		getServico().setTipoServico(TipoServico.BLOQUETO_ELETRONICO);
		getServico().setNumeroVersaoLayoutLote(22);
		setCampoExclusivoCNAB1(ArquivoUtils.BRANCO);
		setEmpresa(new Empresa2());
		setCampoExclusivoCNAB2(ArquivoUtils.BRANCO);
	}

	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public Servico5 getServico() {
		return servico;
	}

	public void setServico(Servico5 servico) {
		this.servico = servico;
	}

	public String getCampoExclusivoCNAB1() {
		return campoExclusivoCNAB1;
	}

	public void setCampoExclusivoCNAB1(String campoExclusivoCNAB1) {
		this.campoExclusivoCNAB1 = campoExclusivoCNAB1;
	}

	public Empresa2 getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa2 empresa) {
		this.empresa = empresa;
	}

	public String getCampoExclusivoCNAB2() {
		return campoExclusivoCNAB2;
	}

	public void setCampoExclusivoCNAB2(String campoExclusivoCNAB2) {
		this.campoExclusivoCNAB2 = campoExclusivoCNAB2;
	}

	@Override
	public String getConteudoRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

}
