package br.com.pucminas.wbma.service;

/**
 * 
 * @author pongelupe
 *
 */
public interface Auth {

	/**
	 * It defines the token type <br>
	 * e.g. Authorization
	 * 
	 * @return
	 */
	String getTokenType();

	/**
	 * 
	 * The value of the token
	 * 
	 * @return
	 */
	String getTokenAccess();

}
