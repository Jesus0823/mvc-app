package com.mvc.app.models.entities;



import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable{

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		
		@NotEmpty(message="no puede estar vacio")
		@Size(min=30, max=30, message="el tamaño debe estar entre 3 a 30")
		@Column(nullable=false)
		private String nombre;
		
		@Column(nullable=false)
		private String apellidos;
		
		@Email(message="no es un email valido")
		@Column(nullable=false, unique=true)
		private String email;
		@Column(name="create_at")
		private Date creatAt;
		
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Date getCreatAt() {
			return creatAt;
		}
		public void setCreatAt(Date creatAt) {
			this.creatAt = creatAt;
		}
		
		private static final long serialVersionUID = 1L; 
		
		
}
