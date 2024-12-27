package br.com.archse.subpubdapr;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SubscriberController {

    @PostMapping("/sample-topic")
    public void handleMessage(@RequestBody String message) {
        System.out.println("Received message: " + message);
    }
}
