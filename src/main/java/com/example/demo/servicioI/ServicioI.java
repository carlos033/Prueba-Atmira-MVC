/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicioI;

import com.example.demo.modelo.NoticiasNasa;
import java.util.List;

/**
 *
 * @author ck
 */
public interface ServicioI {

    public List<NoticiasNasa> obtenerDatos();

    public NoticiasNasa datosNoticia1(NoticiasNasa noticias);

    public NoticiasNasa datosNoticia2(NoticiasNasa noticias);

    public NoticiasNasa datosNoticia3(NoticiasNasa noticias);

    public NoticiasNasa datosNoticia4(NoticiasNasa noticias);

    public NoticiasNasa datosNoticia5(NoticiasNasa noticias);

    public NoticiasNasa datosNoticia6(NoticiasNasa noticias);

}
