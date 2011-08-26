package richard.cnab240.modelo.registro.trailer;

import richard.cnab240.modelo.pojo.Controle;
import richard.cnab240.modelo.pojo.Totais;
import richard.cnab240.modelo.registro.Registro;
import richard.cnab240.util.ArquivoUtils;

/**
 * Classe que representa o registro de trailer do arquivo.<br/>
 * Armazena informações de controle e totalização dos registros.
 * @author Richard Mendes Madureira
 * @version 1.0
 *
 */
public class TrailerArquivo extends Registro {
	private Controle controle;
	private String campoExclusivoCNAB1;
	private Totais totais;
	private String campoExclusivoCNAB2;

	public TrailerArquivo() {
		setControle(new Controle());
		setCampoExclusivoCNAB1(ArquivoUtils.BRANCO);
		setTotais(new Totais());
		setCampoExclusivoCNAB2(ArquivoUtils.BRANCO);
	}

	public String getCampoExclusivoCNAB1() {
		return campoExclusivoCNAB1;
	}

	public void setCampoExclusivoCNAB1(String campoExclusivoCNAB1) {
		this.campoExclusivoCNAB1 = campoExclusivoCNAB1;
	}

	public String getCampoExclusivoCNAB2() {
		return campoExclusivoCNAB2;
	}

	public void setCampoExclusivoCNAB2(String campoExclusivoCNAB2) {
		this.campoExclusivoCNAB2 = campoExclusivoCNAB2;
	}

	public Controle getControle() {
		return controle;
	}
	
	public void setControle(Controle controle) {
		this.controle = controle;
	}

	public Totais getTotais() {
		return totais;
	}

	public void setTotais(Totais totais) {
		this.totais = totais;
	}
	
	@Override
	public String getConteudoRegistro() {
		StringBuilder sb = new StringBuilder(TAMANHO_REGISTRO);
		sb.append(controle.toString()); //8
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB1(), 9));
		sb.append(totais.toString()); //18
		sb.append(ArquivoUtils.getCampoAlfaNumerico(getCampoExclusivoCNAB2(), 205));

		verificaTamanhoRegistro(sb);
		return sb.toString();
	}

}
