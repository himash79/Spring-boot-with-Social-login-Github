package lh.oAuth2Github.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SignInController {

    @GetMapping("/")
    public String signIn(Principal principal) {
        return "Successfully Sign in with this user : " + principal.getName();
    }

}
