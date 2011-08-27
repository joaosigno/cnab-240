package richard.cnab240.modelo.pojo.erro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import richard.cnab240.util.ArquivoUtils;

public class MensagensDeErroTest {
	private MensagensDeErro mensagensDeErro;
	
	private final MensagemDeErro mensagemDeErro =new MensagemDeErro(1, "Mensagem De Erro");
	
	@BeforeClass
	public static void init(){
		System.out.println("Iniciando testes da classe " + MensagensDeErro.class.getName());
	}
	
	@AfterClass
	public static void finalizar(){
		System.out.println("Fim dos testes da classe " + MensagensDeErro.class.getName());
	}
	
	@Before
	public void setUp(){
		mensagensDeErro = new MensagensDeErro();
	}
	
	@After
	public void tearDown(){
		mensagensDeErro = null;
	}
	
	
	@Test
	public void addDeveIncluirMensagemDeErroNaLista(){
		int tamanhoListaAntes = mensagensDeErro.getListaMensagensDeErro().size();
		mensagensDeErro.add(mensagemDeErro);
		assertTrue(mensagensDeErro.getListaMensagensDeErro().contains(mensagemDeErro));
		int tamanhoListaDepois = mensagensDeErro.getListaMensagensDeErro().size();
		assertEquals(tamanhoListaAntes+1, tamanhoListaDepois);
	}
	
	@Test
	public void toStringDeveRetornarListaDeMensagensDeErroQuandoHouver(){
		mensagensDeErro.add(mensagemDeErro);
		mensagensDeErro.add(mensagemDeErro);
		StringBuilder sb = new StringBuilder("-------------------ERROS ENCONTRADOS NO ARQUIVO-------------------");
		sb.append(ArquivoUtils.NOVA_LINHA);
		sb.append(mensagemDeErro.toString());
		sb.append(ArquivoUtils.NOVA_LINHA);
		sb.append(mensagemDeErro.toString());
		assertEquals(sb.toString(), mensagensDeErro.toString());
		
	}

}
