package xin.sunce.chapter5.pattern.action.strategy;

/**
 * 策略模式配合工厂使用
 * <p>
 * 非单例
 * <p>
 * 缺点：在工厂模式中有过多的if-else
 */
public class NewStrategyFactory {

    public static Strategy createStrategy(String type) {
        if (TypeConstant.TAXI.equals(type)) {
            return new TaxiStrategy();
        } else if (TypeConstant.RUN.equals(type)) {
            return new RunStrategy();
        } else if (TypeConstant.TRAIN.equals(type)) {
            return new TrainStrategy();
        } else {
            return null;
        }
    }

}
