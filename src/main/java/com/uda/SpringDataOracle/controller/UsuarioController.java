package com.uda.SpringDataOracle.controller;

import com.uda.SpringDataOracle.dao.UsuarioPageableRepository;
import com.uda.SpringDataOracle.dao.UsuarioRepository;
import com.uda.SpringDataOracle.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


/**
 * Created by enzamora on 12/07/17.
 */
@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioPageableRepository usuarioPageableRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return usuarioRepository.findAll();
    }

    @GetMapping(path="/pageable")
    public @ResponseBody
    Page<User> getPageable(Pageable pageable) {
        // This returns a JSON or XML with the users
        Page<User> persons = usuarioPageableRepository.findAll(pageable);

        return persons;
    }
}
