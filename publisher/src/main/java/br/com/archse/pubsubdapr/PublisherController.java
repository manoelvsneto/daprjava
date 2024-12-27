package br.com.archse.pubsubdapr;

import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {

    private static final String PUBSUB_NAME = "redis-pubsub";
    private static final String TOPIC_NAME = "sample-topic";

    @GetMapping("/publish")
    public String publishMessage() throws Exception {
        try (DaprClient client = new DaprClientBuilder().build()) {
            String message = "Hello, Dapr!";
            client.publishEvent(PUBSUB_NAME, TOPIC_NAME, message).block();
            return "Message published: " + message;
        }
    }
}
