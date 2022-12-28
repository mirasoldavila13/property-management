package com.davila.propertymanagement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculatorDTO {

    private Double num1;
    private Double num2;
    private Double num3;
    //@JsonProperty("num41")//this will populate num4
    private Double num4;


}
