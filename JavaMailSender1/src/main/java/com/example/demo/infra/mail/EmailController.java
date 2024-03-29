package com.example.demo.infra.mail;

import com.example.demo.infra.mail.service.CreateEmailCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email/code")
@RequiredArgsConstructor
public class EmailController {

    private final CreateEmailCodeService createEmailCodeService;

    @PostMapping
    public String requestEmailCode(@RequestParam String email) {
        return createEmailCodeService.sendVerificationCode(email);
    }

}
