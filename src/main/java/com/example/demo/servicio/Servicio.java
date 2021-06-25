/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicio;

import com.example.demo.modelo.NoticiasNasa;
import com.example.demo.servicioI.ServicioI;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ck
 */
@Service("ServiciosI")
@Transactional
public class Servicio implements ServicioI {

    private List<NoticiasNasa> listaNoticias = new ArrayList<>();

    /**
     * Metodo para obtener los datos del EndPoint
     *
     * @return
     */
    @Override
    public List<NoticiasNasa> obtenerDatos() {
        String hoy = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        LocalDate date = LocalDate.now();
        for (int i = 0; i < 6; i++) {
            date = date.minusDays(i);
            final String uri = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=" + date.toString();
            RestTemplate restTemplate = new RestTemplate();
            NoticiasNasa result = restTemplate.getForObject(uri, NoticiasNasa.class);
            listaNoticias.add(result);
        }
        return listaNoticias;
    }

    @Override
    public NoticiasNasa datosNoticia1(NoticiasNasa noticias) {
        return noticias = listaNoticias.get(0);
    }

    @Override
    public NoticiasNasa datosNoticia2(NoticiasNasa noticias) {
        return noticias = listaNoticias.get(1);
    }

    @Override
    public NoticiasNasa datosNoticia3(NoticiasNasa noticias) {
        return noticias = listaNoticias.get(2);
    }

    @Override
    public NoticiasNasa datosNoticia4(NoticiasNasa noticias) {
        return noticias = listaNoticias.get(3);
    }

    @Override
    public NoticiasNasa datosNoticia5(NoticiasNasa noticias) {
        return noticias = listaNoticias.get(4);
    }

    @Override
    public NoticiasNasa datosNoticia6(NoticiasNasa noticias) {
        return noticias = listaNoticias.get(5);
    }
}
