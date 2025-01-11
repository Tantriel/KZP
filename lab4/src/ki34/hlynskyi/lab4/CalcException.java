/**
 * lab 4 package
 */
package ki34.hlynskyi.lab4;

/**
 * Class CalcException implements calculation exceptions
 *
 * @author Vladyslav Hlynskyi
 * @version 1.0
 */
class CalcException extends ArithmeticException {

    /**
     * Constructor
     */
    public CalcException() {
    }

    /**
     * Constructor
     *
     * @param cause
     */
    public CalcException(String cause) {
        super(cause);
    }
}
