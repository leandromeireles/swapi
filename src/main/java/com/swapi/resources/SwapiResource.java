package com.swapi.resources;

import java.util.List;

import com.swapi.models.SwapiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.swapi.models.Planeta;
import com.swapi.repository.SwapiRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "SWAPI")
@CrossOrigin(origins = "*")
public class SwapiResource extends ResponseEntityExceptionHandler {

    @Autowired
    SwapiRepository swapiRepository;

    @GetMapping("/planeta")
    @ApiOperation(value = "Retorna Lista de Panetas")
    public ResponseEntity<?> listaPlaneta() {

        return new ResponseEntity<>(swapiRepository.findAll(), HttpStatus.OK);

    }

    @GetMapping("/planeta/{id}")
    @ApiOperation(value = "Retorna Loja Física")
    public ResponseEntity<?> buscaPlaneta(@PathVariable(value = "id") int id) throws Exception {

        try {
            Planeta planeta = new Planeta();
            SwapiResponse swapiResponse = new SwapiResponse();
            planeta = swapiRepository.findById(id);
            if (planeta == null) {
                swapiResponse.setCod(SwapiResponse.STATUS_204);
                swapiResponse.setMessage(SwapiResponse.MSG_204_GET);
                return new ResponseEntity<>(swapiResponse, HttpStatus.NOT_FOUND);
            }

            return new ResponseEntity<>(planeta, HttpStatus.OK);
        } catch (Exception e) {

            throw new Exception(SwapiResponse.MSG_ERROR, e);

        }

    }

    @PostMapping("/planeta")
    @ApiOperation(value = "Salva um Planeta")
    public Object salvaPlaneta(@RequestBody Planeta planeta) throws Exception {

        try {

            SwapiResponse swapiResponse = new SwapiResponse();
            swapiRepository.save(planeta);
            swapiResponse.setCod(SwapiResponse.STATUS_201_SUCCESS);
            swapiResponse.setMessage(SwapiResponse.MSG_201_POST);
            return swapiResponse;

        } catch (Exception e) {

            throw new Exception(SwapiResponse.MSG_ERROR_POST, e);
        }

    }

    @DeleteMapping("/planeta/{id}")
    @ApiOperation(value = "Deleta um Planeta")
    public void deletaPlaneta(@PathVariable(value = "id") Long id) throws Exception {

        swapiRepository.deleteById(id);

    }

}
