package com.activty9.activty9.services;


import com.activty9.activty9.mappers.patientMapper;
import com.activty9.activty9.models.patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class patientService {

    @Autowired
    patientMapper pMapper;
    public List<patient> getAll(){
        return pMapper.getAll();
    }
}
