package com.tecsup.elazaro.almacenapp.models;

public class Solicitud {

    private Integer id;
    private String nombre;
    private String email;
    private String tipoSolicitud;
    private String motivoSolicitud;
    private String imagen;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public String getMotivoSolicitud() {
        return motivoSolicitud;
    }

    public void setMotivoSolicitud(String motivoSolicitud) {
        this.motivoSolicitud = motivoSolicitud;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


    @Override
    public String toString() {
        return "Solicitud{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", tipoSolicitud='" + tipoSolicitud + '\'' +
                ", motivoSolicitud='" + motivoSolicitud + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
