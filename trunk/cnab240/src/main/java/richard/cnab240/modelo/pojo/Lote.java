package richard.cnab240.modelo.pojo;

import java.util.ArrayList;
import java.util.List;

import richard.cnab240.modelo.registro.Registro;
import richard.cnab240.modelo.registro.RegistroFinal;
import richard.cnab240.modelo.registro.RegistroInicial;
import richard.cnab240.modelo.registro.header.HeaderLote;
import richard.cnab240.modelo.registro.trailer.TrailerLote;

public class Lote <HEADER extends HeaderLote, R extends Registro, TRAILER extends TrailerLote>{
	private HEADER header;
	private List<RegistroInicial> registrosIniciais;
	private List<R> registrosDeDetalhe;
	private List<RegistroFinal> registrosFinais;
	private TRAILER trailer;

	public Lote() throws InstantiationException, IllegalAccessException {
		//FIXME verificar solução para instanciar tipos genericos
		//setHeader(typeHEADER.newInstance());
		setRegistrosIniciais(new ArrayList<RegistroInicial>());
		setRegistrosDeDetalhe(new ArrayList<R>());
		setRegistrosFinais(new ArrayList<RegistroFinal>());
		//FIXME verificar solução para instanciar tipos genericos
		//setTrailer(typeTRAILER.newInstance());
	}

	public HEADER getHeader() {
		return header;
	}

	public void setHeader(HEADER header) {
		this.header = header;
	}

	public List<RegistroInicial> getRegistrosIniciais() {
		return registrosIniciais;
	}

	public void setRegistrosIniciais(List<RegistroInicial> registrosIniciais) {
		this.registrosIniciais = registrosIniciais;
	}

	public List<R> getRegistrosDeDetalhe() {
		return registrosDeDetalhe;
	}

	public void setRegistrosDeDetalhe(List<R> registrosDeDetalhe) {
		this.registrosDeDetalhe = registrosDeDetalhe;
	}

	public List<RegistroFinal> getRegistrosFinais() {
		return registrosFinais;
	}

	public void setRegistrosFinais(List<RegistroFinal> registrosFinais) {
		this.registrosFinais = registrosFinais;
	}

	public TRAILER getTrailer() {
		return trailer;
	}

	public void setTrailer(TRAILER trailer) {
		this.trailer = trailer;
	}

}
