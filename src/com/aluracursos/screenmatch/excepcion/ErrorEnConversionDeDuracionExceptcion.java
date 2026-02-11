package com.aluracursos.screenmatch.excepcion;

public class ErrorEnConversionDeDuracionExceptcion extends RuntimeException {
    private String mensaje;

    public ErrorEnConversionDeDuracionExceptcion(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return this.mensaje;
    }
}
