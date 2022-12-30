package com.davila.propertymanagement.converter;

import com.davila.propertymanagement.dto.PropertyDTO;
import com.davila.propertymanagement.entity.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {

    public PropertyEntity convertDTOtoEntity(PropertyDTO propertyDTO){
        //convert propertyDTO to entity
        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setDescription(propertyDTO.getDescription());
        pe.setOwnerName(propertyDTO.getOwnerName());
        pe.setOwnerEmail(propertyDTO.getOwnerEmail());
        pe.setPrice(propertyDTO.getPrice());
        pe.setAddress(propertyDTO.getAddress());
        return pe;
    }

    public PropertyDTO convertEntitytoDTO(PropertyEntity propertyEntity){
        //convert entity to propertyDTO
        PropertyDTO propertyDTO = new PropertyDTO();
        propertyDTO.setTitle(propertyEntity.getTitle());
        propertyDTO.setDescription(propertyEntity.getDescription());
        propertyDTO.setOwnerName(propertyEntity.getOwnerName());
        propertyDTO.setOwnerEmail(propertyEntity.getOwnerEmail());
        propertyDTO.setPrice(propertyEntity.getPrice());
        propertyDTO.setAddress(propertyEntity.getAddress());

        return propertyDTO;
    }
}
