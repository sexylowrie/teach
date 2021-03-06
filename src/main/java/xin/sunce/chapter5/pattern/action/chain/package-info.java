/**
 * 行为型设计模式-责任链模式
 * <p>
 * 可以通过链表，或者数组实现
 * <p>
 * 1.在GoF给出的定义中，如果处理器链上的某个处理器能够处理这个请求，那就不会继续往下传递请求。
 * 2.责任链模式还有一种变体是所有的处理器都会被执行。
 * <p>
 * 本案例演示的是全部处理器都会执行的情况。
 */
package xin.sunce.chapter5.pattern.action.chain;
