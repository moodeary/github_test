package github.test.member.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/githubTest")
public class memberController {

    @GetMapping("/get")
    public ResponseEntity getMapping() {

        return new ResponseEntity<>("To-do Application !", HttpStatus.OK);
    }

}
