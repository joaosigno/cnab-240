package richard.cnab240.modelo.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import richard.cnab240.modelo.TipoCampo;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Campo {
	int tamanho();
	TipoCampo tipoCampo();
}
