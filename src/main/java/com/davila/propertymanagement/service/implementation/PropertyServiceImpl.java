package com.davila.propertymanagement.service.implementation;

import com.davila.propertymanagement.converter.PropertyConverter;
import com.davila.propertymanagement.dto.PropertyDTO;
import com.davila.propertymanagement.entity.PropertyEntity;
import com.davila.propertymanagement.repository.PropertyRepository;
import com.davila.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private PropertyConverter propertyConverter;
    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
        PropertyEntity pe = propertyConverter.convertDTOtoEntity(propertyDTO);
        pe = propertyRepository.save(pe);
        //convert to pto
        propertyDTO = propertyConverter.convertEntitytoDTO(pe);
        return propertyDTO;
    }

    @Override
    public List<PropertyDTO> getAllProperties() {
        List<PropertyEntity> listofProps = (List<PropertyEntity>)propertyRepository.findAll();
        List<PropertyDTO> propList = new ArrayList<>();
        for(PropertyEntity pe: listofProps){
            PropertyDTO dto = propertyConverter.convertEntitytoDTO(pe);
            propList.add(dto);
        }
        return propList;
    }

    @Override
    public PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId) {

        Optional<PropertyEntity> optEn = propertyRepository.findById(propertyId);//data from database
        PropertyDTO dto = null;
        if(optEn.isPresent()){
            PropertyEntity pe = optEn.get();
            pe.setTitle(propertyDTO.getTitle());
            pe.setDescription(propertyDTO.getDescription());
            pe.setOwnerName(propertyDTO.getOwnerName());
            pe.setOwnerEmail(propertyDTO.getOwnerEmail());
            pe.setPrice(propertyDTO.getPrice());
            pe.setAddress(propertyDTO.getAddress());
            dto = propertyConverter.convertEntitytoDTO(pe);
            propertyRepository.save(pe);
        }
        return dto;
    }


}
