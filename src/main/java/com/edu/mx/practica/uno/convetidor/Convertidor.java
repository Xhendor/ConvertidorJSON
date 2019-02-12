package com.edu.mx.practica.uno.convetidor;

import com.google.gson.Gson;

public class Convertidor {

    /**
     * Metodo para convertir Clase a JSON
     * @param clase texto en formato clase para convertir
     * @return Clase convertida a JSON
     */
    public String convertirClaseToJson(String clase){


        return "";
    }

    /**
     * Metodo para convertir XML a JSON
     * @param xml texto en formato XML para convertir
     * @return XML convertido a JSON
     */
    public String convertirXmlToJson(String xml){


        //Crear una instancia de Gson
        Gson gson=new Gson();
        //Se agrega el texto de entrada para convertirlo
        String resultado=gson.toJson(xml);

        return resultado;
    }




}
