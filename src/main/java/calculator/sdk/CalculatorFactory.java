package calculator.sdk;


import calculator.sdk.impl.SimpleCalculatorImpl;

/**
 * @author qianfang, at 2023/3/20, 00:23
 **/
public class CalculatorFactory {
    /**
     * @param undoLogSize undo日志记录的条数 避免过大导致内存溢出
     */
    public static calculator.sdk.ICalculator getCalculator(int undoLogSize) {
        return new SimpleCalculatorImpl(undoLogSize);
    }
}
