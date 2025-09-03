package com.sunat.sunatretrofit.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SunatResponse {
    @SerializedName("ruc")
    private String ruc;

    @SerializedName("razon_social")
    private String razonSocial;

    @SerializedName("estado")
    private String estado;

    @SerializedName("condicion")
    private String condicion;

    @SerializedName("direccion")
    private String direccion;

    @SerializedName("ubigeo")
    private String ubigeo;

    @SerializedName("departamento")
    private String departamento;

    @SerializedName("provincia")
    private String provincia;

    @SerializedName("distrito")
    private String distrito;

}