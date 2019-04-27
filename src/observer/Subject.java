package observer;

/**
 * 被观察者接口
 */
public interface Subject {
    /**
     * 添加观察者
     * @param object
     */
    void attach(Observer object);

    /**
     * 删除观察者
     * @param object
     */
    void disttach(Observer object);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
