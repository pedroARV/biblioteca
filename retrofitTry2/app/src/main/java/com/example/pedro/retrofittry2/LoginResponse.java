package com.example.pedro.retrofittry2;

public class LoginResponse {

     public int idUsuario;
     public String usuario;
     public String perfil;

     public int getIdUsuario() {
          return idUsuario;
     }

     public void setIdUsuario(int idUsuario) {
          this.idUsuario = idUsuario;
     }

     public String getUsuario() {
          return usuario;
     }

     public void setUsuario(String usuario) {
          this.usuario = usuario;
     }

     public String getPerfil() {
          return perfil;
     }

     public void setPerfil(String perfil) {
          this.perfil = perfil;
     }
}
