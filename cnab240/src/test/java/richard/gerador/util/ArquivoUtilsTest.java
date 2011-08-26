package richard.gerador.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Date;

import org.junit.Test;

import richard.cnab240.util.ArquivoUtils;
    
public class ArquivoUtilsTest {
	@Test
	public void getCampoAlfaNumericoMenorQueMaximoPermitidoDeveRetornarCampoPreenchidoComEspacosNoFinal(){
		String campo = "Richard Mendes Madureira";
		String campoEsperado = "Richard Mendes Madureira      ";
		int tamanhoMaximoCampo = 30;
		String campoObtido = ArquivoUtils.getCampoAlfaNumerico(campo, tamanhoMaximoCampo);
		assertEquals(tamanhoMaximoCampo, campoObtido.length());
		assertEquals(campoEsperado, campoObtido);
	}
	
	@Test
	public void getCampoAlfaNumericoDeveRetornarCampoExatamenteIgualQuandoOTamanhoDoCampoForIgualAoTamanhoMaximoPermitido(){
		String campo = "Richard Mendes Madureira";
		String campoEsperado = "Richard Mendes Madureira";
		int tamanhoMaximoCampo = 24;
		String campoObtido = ArquivoUtils.getCampoAlfaNumerico(campo, tamanhoMaximoCampo);
		assertEquals(tamanhoMaximoCampo, campoObtido.length());
		assertEquals(campoEsperado, campoObtido);
	}
	
	@Test
	public void getCampoAlfaNumericoDeveRetornarCampoDeTamanhoIgualAoMaximoPermitidoQuandoCampoInformadoForMaiorQueMaximoPermitido(){
		String campo = "Richard Mendes Madureira";
		String campoEsperado = "Richard";
		int tamanhoMaximoCampo = 7;
		String campoObtido = ArquivoUtils.getCampoAlfaNumerico(campo, tamanhoMaximoCampo);
		assertEquals(tamanhoMaximoCampo, campoObtido.length());
		assertEquals(campoEsperado, campoObtido);
	}
	
	@Test
	public void getCampoAlfaNumericoDeveRetornarCampoDefaultQuandoCampoInformadoForNulo(){
		String campo = "  ";
		String campoEsperado = "       ";
		int tamanhoMaximoCampo = 7;
		String campoObtido = ArquivoUtils.getCampoAlfaNumerico(campo, tamanhoMaximoCampo);
		assertEquals(tamanhoMaximoCampo, campoObtido.length());
		assertEquals(campoEsperado, campoObtido);
	}
	
	@Test
	public void getCampoAlfaNumericoDeveRetornarCampoDefaultQuandoCampoInformadoForVazio(){
		String campo = null;
		String campoEsperado = "       ";
		int tamanhoMaximoCampo = 7;
		String campoObtido = ArquivoUtils.getCampoAlfaNumerico(campo, tamanhoMaximoCampo);
		assertEquals(tamanhoMaximoCampo, campoObtido.length());
		assertEquals(campoEsperado, campoObtido);
	}
	
	/*------------------------------------------------------------*/
	@Test
	public void getCampoNumericoMenorQueMaximoPermitidoDeveRetornarCampoPreenchidoComEspacosNoFinal(){
		String campo = "123456782";
		String campoEsperado = "000000123456782";
		int tamanhoMaximoCampo = 15;
		String campoObtido = ArquivoUtils.getCampoNumerico(campo, tamanhoMaximoCampo);
		assertEquals(tamanhoMaximoCampo, campoObtido.length());
		assertEquals(campoEsperado, campoObtido);
	}
	
	@Test
	public void getCampoNumericoDeveRetornarCampoExatamenteIgualQuandoOTamanhoDoCampoForIgualAoTamanhoMaximoPermitido(){
		String campo = "1234567890";
		String campoEsperado = "1234567890";
		int tamanhoMaximoCampo = 10;
		String campoObtido = ArquivoUtils.getCampoNumerico(campo, tamanhoMaximoCampo);
		assertEquals(tamanhoMaximoCampo, campoObtido.length());
		assertEquals(campoEsperado, campoObtido);
	}
	
	@Test
	public void getCampoNumericoDeveRetornarCampoDeTamanhoIgualAoMaximoPermitidoQuandoCampoInformadoForMaiorQueMaximoPermitido(){
		String campo = "1234567890";
		String campoEsperado = "12345";
		int tamanhoMaximoCampo = 5;
		String campoObtido = ArquivoUtils.getCampoNumerico(campo, tamanhoMaximoCampo);
		assertEquals(tamanhoMaximoCampo, campoObtido.length());
		assertEquals(campoEsperado, campoObtido);
	}
	
	@Test
	public void getCampoNumericoDeveRetornarCampoDefaultQuandoCampoInformadoForNulo(){
		String campo = "  ";
		String campoEsperado = "0000000";
		int tamanhoMaximoCampo = 7;
		String campoObtido = ArquivoUtils.getCampoNumerico(campo, tamanhoMaximoCampo);
		assertEquals(tamanhoMaximoCampo, campoObtido.length());
		assertEquals(campoEsperado, campoObtido);
	}
	
	@Test
	public void getCampoNumericoDeveRetornarCampoDefaultQuandoCampoInformadoForVazio(){
		String campo = null;
		String campoEsperado = "0000000";
		int tamanhoMaximoCampo = 7;
		String campoObtido = ArquivoUtils.getCampoNumerico(campo, tamanhoMaximoCampo);
		assertEquals(tamanhoMaximoCampo, campoObtido.length());
		assertEquals(campoEsperado, campoObtido);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getDataFormatadaDeveRetornarDataNoFormatoDDMMYYYY(){
		Date data = new Date(2011-1900, 0,1, 1, 1, 1);
		String dataEsperada = "01012011";
		String dataFormatada = ArquivoUtils.getCampoDataFormatada(data);
		assertEquals(dataEsperada.length(), dataFormatada.length());
		assertEquals(dataEsperada, dataFormatada);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getHoraFormatadaDeveRetornarHoraNoFormatoHHMMSS(){
		Date data = new Date(2011, 0,1, 1, 1, 1);
		String horaEsperada = "010101";
		String horaFormatada = ArquivoUtils.getCampoHoraFormatada(data);
		assertEquals(horaEsperada.length(), horaFormatada.length());
		assertEquals(horaEsperada, horaFormatada);
	}
	
	@Test
	public void getCampoDataFormatadaDeveRetornarNullQuandoDataForNula(){
		String dataFormatada = ArquivoUtils.getCampoDataFormatada(null);
		assertNull(dataFormatada);
	}
	
	@Test
	public void getCampoDataHoraFormatadaDeveRetornarNullQuandoDataForNula(){
		String dataFormatada = ArquivoUtils.getCampoHoraFormatada(null);
		assertNull(dataFormatada);
	}
	
	@Test
	public void getCampoNumericoComIntDeveRetornar0QuandoParametroForZero(){
		int campoEntrada = 0;
		int tamanhoCampo = 10;
		String campoSaida = ArquivoUtils.getCampoNumerico(campoEntrada, tamanhoCampo);
		assertEquals("0000000000", campoSaida);
	}
	
	@Test
	public void getCampoNumericoComIntDeveRetornarCampoSAodaComQuantidadeDeCaracteresInformada(){
		int campoEntrada = 123;
		int tamanhoCampo = 10;
		String campoSaida = ArquivoUtils.getCampoNumerico(campoEntrada, tamanhoCampo);
		assertEquals("0000000123", campoSaida);
	}
	
	@Test
	public void getCampoNumericoDeveDiminuirTamanhoDoCampoQuandoCampoEntradaForMuitoGrande(){
		int campoEntrada = 1234567890;
		int tamanhoCampo = 5;
		String campoSaida = ArquivoUtils.getCampoNumerico(campoEntrada, tamanhoCampo);
		assertEquals("12345", campoSaida);
	}
	

}
