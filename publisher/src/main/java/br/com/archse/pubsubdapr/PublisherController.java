package br.com.archse.pubsubdapr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {


    @GetMapping("/publish")
    public String publishMessage()  {
            return "Message published" ;
        
    }
}
