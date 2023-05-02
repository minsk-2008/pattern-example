package org.pattern.observer.publisher;

import java.util.ArrayList;

public interface PublisherInterface {

    ArrayList<PublisherActionListener> getListeners();

    void addListener(PublisherActionListener listener);

    void removeListener(PublisherActionListener listener);

    void removeAllListeners();

    // оповещение всех о каком-то событии
    void notifyListeners(String message);
}
