import java.lang.*;

public class MinhaExcecao extends RuntimeException {
	MinhaExcecao() { };

	MinhaExcecao(String e) {
		super(e);
	}
}

