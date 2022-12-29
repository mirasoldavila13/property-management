package com.davila.propertymanagement.service.implementation;

import com.davila.propertymanagement.dto.PropertyDTO;
import com.davila.propertymanagement.entity.PropertyEntity;
import com.davila.propertymanagement.repository.PropertyRepository;
import com.davila.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
       //convert propertyDTO to entity
        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setDescription(propertyDTO.getDescription());
        pe.setOwnerName(propertyDTO.getOwnerName());
        pe.setOwnerEmail(propertyDTO.getOwnerEmail());
        pe.setPrice(propertyDTO.getPrice());
        pe.setAddress(propertyDTO.getAddress());

        propertyRepository.save(pe);
        return null;
    }
}
