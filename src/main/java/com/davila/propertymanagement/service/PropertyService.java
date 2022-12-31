package com.davila.propertymanagement.service;

import com.davila.propertymanagement.dto.PropertyDTO;

import java.util.List;

public interface PropertyService {
    PropertyDTO saveProperty(PropertyDTO propertyDTO);
    List<PropertyDTO> getAllProperties();

}
