package co.develhope.deploy1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BasicController {

    @Value("${devName}")
    private String devName;


    @GetMapping("")
    public ResponseEntity<String> getDevName(){
        return ResponseEntity.ok(devName);
    }
}