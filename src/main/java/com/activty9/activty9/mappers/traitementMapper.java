package com.activty9.activty9.mappers;

import com.activty9.activty9.models.patient;
import com.activty9.activty9.models.traitement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface traitementMapper {
    List<traitement> getAll();
    patient getById(int id);
}
