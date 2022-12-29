package com.davila.propertymanagement.service.implementation;

import com.davila.propertymanagement.converter.PropertyConverter;
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
    @Autowired
    private PropertyConverter propertyConverter;
    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
        PropertyEntity pe = propertyConverter.convertDTOtoEntity(propertyDTO);
        propertyRepository.save(pe);
        return null;
    }
}
