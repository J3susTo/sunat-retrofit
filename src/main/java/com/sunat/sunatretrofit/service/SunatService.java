package com.sunat.sunatretrofit.service;

import com.sunat.sunatretrofit.client.SunatApiClient;
import com.sunat.sunatretrofit.model.SunatResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

@Service
@Slf4j
public class SunatService {

    @Autowired
    private SunatApiClient sunatApiClient;

    public SunatResponse consultarRuc(String numero) throws Exception {
        log.info("Consultando RUC: {}", numero);
        Call<SunatResponse> call = sunatApiClient.getRuc(numero);
        Response<SunatResponse> response = call.execute();
        if (response.isSuccessful() && response.body() != null) {
            return response.body();
        } else {
            log.error("Error en la consulta de RUC: {}, código: {}", numero, response.code());
            throw new Exception("Error en la consulta de RUC: " + response.code());
        }
    }

    public SunatResponse consultarRucFull(String numero) throws Exception {
        log.info("Consultando RUC completo: {}", numero);
        Call<SunatResponse> call = sunatApiClient.getRucFull(numero);
        Response<SunatResponse> response = call.execute();
        if (response.isSuccessful() && response.body() != null) {
            return response.body();
        } else {
            log.error("Error en la consulta de RUC completo: {}, código: {}", numero, response.code());
            throw new Exception("Error en la consulta de RUC completo: " + response.code());
        }
    }
}