package richard.cnab240.modelo.pojo.erro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import richard.cnab240.util.ArquivoUtils;

public class MensagemDeErroTest {
	private final int numeroLinha = 1;
	private final String descricaoErro = "Mensagem de Erro";
	private MensagemDeErro mensagemDeErro;
	
	@BeforeClass
	public static void init(){
		System.out.println("Iniciando testes da classe " + MensagemDeErro.class.getName());
	}
	@AfterClass
	public static void finalizar(){
		System.out.println("Fim dos testes da classe " + MensagemDeErro.class.getName());
	}
	
	@Before
	public void setUp(){
		System.out.println("setUp()");
		mensagemDeErro = new MensagemDeErro();
	}
	
	@Test
	public void construtoraSemParametros(){
		mensagemDeErro = new MensagemDeErro();
		assertEquals(0, mensagemDeErro.getNumeroLinha());
		assertNull(mensagemDeErro.getDescricaoErro());
	}
	
	@After
	public void tearDown(){
		System.out.println("tearDown()");
		mensagemDeErro = null;
	}
	
	@Test
	public void getsESets(){
		mensagemDeErro.setNumeroLinha(numeroLinha);
		mensagemDeErro.setDescricaoErro(descricaoErro);
		assertEquals(numeroLinha, mensagemDeErro.getNumeroLinha());
		assertEquals(descricaoErro, mensagemDeErro.getDescricaoErro());
	}
	
	@Test
	public void construtoraDeveInicializarNumeroLinhaEDescricaoErro(){
		mensagemDeErro = new MensagemDeErro(numeroLinha, descricaoErro);
		getsESets();
	}
	
	@Test
	public void toStringDeveRetornarMensagemInformandoErro(){
		mensagemDeErro = new MensagemDeErro(numeroLinha, descricaoErro);
		String mensagemEsperada = "Nº DA LINHA:\t" + StringUtils.leftPad(String.valueOf(numeroLinha), ArquivoUtils.NUMERO_MAXIMO_REGISTROS_NO_ARQUIVO.length(), "0") + ". ERRO: " + descricaoErro;
		assertEquals(mensagemEsperada, mensagemDeErro.toString());
	}
	@Test
	public void toStringDeveRetornarMensagemErroComNumeroLinhaFormatado(){
		mensagemDeErro = new MensagemDeErro(numeroLinha, descricaoErro);
		String mensagemEsperada = "Nº DA LINHA:\t0001. ERRO: " + descricaoErro;
		assertEquals(mensagemEsperada, mensagemDeErro.toString());
	}
}
