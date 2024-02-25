package com.kafkacourse;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "defaulttopic", groupId = "syamil")
    void Listener(String data){
        System.out.println("Listener received::" + data );
    }
}
