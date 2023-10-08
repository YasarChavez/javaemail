package com.javaemail.javaemail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaemail.javaemail.service.EmailService;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/send-email")
    public String enviarCorreo(
            @RequestParam String destinatario,
            @RequestParam String asunto,
            @RequestParam String mensaje) {
        emailService.enviarCorreo(destinatario, asunto, mensaje);
        return "Correo enviado con éxito.";
    }
}
