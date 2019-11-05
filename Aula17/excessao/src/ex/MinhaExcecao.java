package ex;

import java.lang.*;
//public class MinhaExcecao extends RuntimeException só vai verificar quando ocorre o programa
public class MinhaExcecao extends Exception {
	MinhaExcecao(String e) {
	super(e);
	}
}