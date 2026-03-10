/**
 * @name        Arccosine of an angle in Degrees
 * @package     calculator.operators
 * @file        CosOperator.java
 * @description 
 */

package calculator.operators;

public class AsinOperator implements UnaryOperator {
    @Override
    public Double execute(Double num) {
        return Math.toDegrees(Math.asin(num));
    }
}