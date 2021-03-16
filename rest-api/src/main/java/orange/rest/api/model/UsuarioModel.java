package orange.rest.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity(name = "cadastrar_usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idusuario;

    @Column(unique = true)
    @NotEmpty(message = "CPF Obrigatório.")
    private String cpf;

    @Column
    @NotEmpty(message = "Nome Obrigatório.")
    private String nome;

    @Column(unique = true)
    @NotEmpty(message = "E-mail Obrigatório.")
    @Email
    private String email;

    @Column
    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd")
    private String nascimento;

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

}

//    CREATE TABLE cadastrar_usuario (
//    cpf varchar(11) PRIMARY KEY,
//    nome varchar(40) NOT NULL,
//    email varchar(50) NOT NULL,
//    nascimento date NOT NULL
//);


