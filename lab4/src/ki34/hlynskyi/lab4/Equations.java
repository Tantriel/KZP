/**
 * lab 4 package
 */
package ki34.hlynskyi.lab4;

/**
 * Class Equations implements calculation algorithm
 *
 * @author Vladyslav Hlynskyi

 * @version 1.0
 */
class Equations {
    /** Method calculates the (sin(x)/sin(2x-4)) expression
     *
     * @param x
     * @return
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException {
        double y, rad, rad1;
        rad = x * Math.PI / 180.0;
        rad1 = (x * 2 - 4) * Math.PI / 180.0;
        try {
            y = (Math.sin(rad) / Math.sin(rad1));
//Якщо результат не є числом, то генеруємо виключення
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || x % 90 == 2 || Math.abs(x) % 88 == 0)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
//створимо виключення вищого рівня з поясненням причини
//виникнення помилки
            if (x % 90 == 2 || Math.abs(x) % 88 == 0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }
}
