package xin.sunce.pattern.proxy;

/**
 * 代理模式示例
 * 静态代理
 */
public class ProxyDemo {


    public static void main(String[] args) {
        PayProxy payProxy = new PayProxy(new PayImpl());
        payProxy.pay();
    }

}