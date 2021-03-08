package org.mskcc.cmo.messaging;

public interface Gateway {
    void connect() throws Exception;
    boolean isConnected();
    void publish(String topic, Object message) throws Exception;
    void subscribe(String topic, Class messageClass, MessageConsumer messageConsumer) throws Exception;
    boolean shutdown() throws Exception;
}
