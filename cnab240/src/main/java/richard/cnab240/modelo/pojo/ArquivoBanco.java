package richard.cnab240.modelo.pojo;

import java.util.ArrayList;
import java.util.List;

import richard.cnab240.modelo.registro.Registro;
import richard.cnab240.modelo.registro.header.HeaderArquivo;
import richard.cnab240.modelo.registro.header.HeaderLote;
import richard.cnab240.modelo.registro.trailer.TrailerArquivo;
import richard.cnab240.modelo.registro.trailer.TrailerLote;

/**
 * <b>Classe Principal</b>, responsável pelo armazenamento de toda a informação que será gravada no arquivo.
 * Essa informação pode ser obtida através to método toString() subscrito na classe.
 * @author Richard Mendes Madureira
 * @version 1.0
 */
public class ArquivoBanco {
	private HeaderArquivo header;
	private List<Lote<? extends HeaderLote, ? extends Registro, ?extends TrailerLote>> listaLotes;
	private TrailerArquivo trailer;

	/**
	 * Método Construtor padrão, responsável pela inicialização dos objetos internos da classe
	 */
	public ArquivoBanco() {
		setHeader(new HeaderArquivo());
		setListaLotes(new ArrayList<Lote<? extends HeaderLote, ? extends Registro, ?extends TrailerLote>>());
		setTrailer(new TrailerArquivo());
	}

	public HeaderArquivo getHeader() {
		return header;
	}

	public void setHeader(HeaderArquivo header) {
		this.header = header;
	}

	public List<Lote<? extends HeaderLote, ? extends Registro, ?extends TrailerLote>> getListaLotes() {
		return listaLotes;
	}

	public void setListaLotes(List<Lote<? extends HeaderLote, ? extends Registro, ?extends TrailerLote>> listaLotes) {
		this.listaLotes = listaLotes;
	}

	public TrailerArquivo getTrailer() {
		return trailer;
	}

	public void setTrailer(TrailerArquivo trailer) {
		this.trailer = trailer;
	}
	
	/**
	 * Método que retorna o conteúdo que será enviado aos Bancos.<br/>O layout já está organizado separadamente em cada classe utilizada.
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(header.toString());
		for(Lote<? extends HeaderLote, ? extends Registro, ?extends TrailerLote> lote: listaLotes){
			sb.append(lote.toString());
		}
		sb.append(trailer.toString());
		return sb.toString();
	}
}