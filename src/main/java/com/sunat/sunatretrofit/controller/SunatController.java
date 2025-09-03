package com.sunat.sunatretrofit.controller;

import com.sunat.sunatretrofit.model.SunatResponse;
import com.sunat.sunatretrofit.service.SunatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SunatController {

    @Autowired
    private SunatService sunatService;

    @GetMapping("/sunat/ruc")
    public ResponseEntity<SunatResponse> consultarRuc(@RequestParam("numero") String numero) throws Exception {
        return ResponseEntity.ok(sunatService.consultarRuc(numero));
    }

    @GetMapping("/sunat/ruc/full")
    public ResponseEntity<SunatResponse> consultarRucFull(@RequestParam("numero") String numero) throws Exception {
        return ResponseEntity.ok(sunatService.consultarRucFull(numero));
    }
}