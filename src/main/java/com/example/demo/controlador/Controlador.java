/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controlador;

import com.example.demo.modelo.NoticiasNasa;
import com.example.demo.servicioI.ServicioI;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ck
 */
@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private ServicioI servicios;

    @GetMapping("/")
    public ModelAndView listarDatos(@ModelAttribute("NoticiasNasa") NoticiasNasa noticiasNasa, ModelMap model) {
        List<NoticiasNasa> listaNoticias = new ArrayList<>();
        listaNoticias = servicios.obtenerDatos();
        model.addAttribute("listaNoticias", listaNoticias);
        return new ModelAndView("Dashboard", model);
    }

    @GetMapping("/noticia1")
    public ModelAndView verNoticia0(@ModelAttribute("NoticiasNasa") NoticiasNasa noticiasNasa, ModelMap model) {
        noticiasNasa = servicios.datosNoticia1(noticiasNasa);
        model.addAttribute("NoticiasNasa", noticiasNasa);
        return new ModelAndView("Noticia0", model);
    }

    @GetMapping("/noticia1")
    public ModelAndView verNoticia1(@ModelAttribute("NoticiasNasa") NoticiasNasa noticiasNasa, ModelMap model) {
        noticiasNasa = servicios.datosNoticia2(noticiasNasa);
        model.addAttribute("NoticiasNasa", noticiasNasa);
        return new ModelAndView("Noticia1", model);
    }

    @GetMapping("/noticia1")
    public ModelAndView verNoticia2(@ModelAttribute("NoticiasNasa") NoticiasNasa noticiasNasa, ModelMap model) {
        noticiasNasa = servicios.datosNoticia3(noticiasNasa);
        model.addAttribute("NoticiasNasa", noticiasNasa);
        return new ModelAndView("Noticia2", model);
    }

    @GetMapping("/noticia1")
    public ModelAndView verNoticia3(@ModelAttribute("NoticiasNasa") NoticiasNasa noticiasNasa, ModelMap model) {
        noticiasNasa = servicios.datosNoticia4(noticiasNasa);
        model.addAttribute("NoticiasNasa", noticiasNasa);
        return new ModelAndView("Noticia3", model);
    }

}
