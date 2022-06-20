package com.example.calculadora.servicios;

import java.math.BigDecimal;

public interface IServicioCalculadora {

    /**
     * Method is used for calculation for given numbers and operator type
     * Calcula para los números proporcionados como argumentos el resutlado de
     * la operación
     *
     * @param primerNumero
     * @param segundoNumero
     * @param operacion sumar, restar
     * @return el resultado de la operación (depende del tipo de operación).
     */
    double calcula(BigDecimal primerNumero, BigDecimal segundoNumero, String operacion);
}
