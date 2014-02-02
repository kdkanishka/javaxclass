/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibility.exception;

/**
 *
 * @author kanishka
 */
public class HandlerFaliureException extends Exception {

    public HandlerFaliureException() {
    }

    public HandlerFaliureException(String message) {
        super(message);
    }

    public HandlerFaliureException(String message, Throwable cause) {
        super(message, cause);
    }

    public HandlerFaliureException(Throwable cause) {
        super(cause);
    }
}
