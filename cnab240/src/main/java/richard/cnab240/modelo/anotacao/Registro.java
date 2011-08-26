package richard.cnab240.modelo.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import richard.cnab240.modelo.enums.TipoEnvio;
import richard.cnab240.modelo.enums.TipoRegistro;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Registro {
	boolean obrigatorio();
	TipoEnvio tipoEnvio() default TipoEnvio.REMESSA_OU_RETORNO;
	TipoRegistro tipoRegistro();
}
