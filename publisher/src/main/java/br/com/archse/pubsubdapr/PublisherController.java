package br.com.archse.pubsubdapr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/publisher")
public class PublisherController {


    @GetMapping("/publish")
    public String publishMessage()  {
            return "Message published" ;
        
    }
}
