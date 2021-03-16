package orange.rest.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "vacina_aplicada")
public class VacinaModel {

    @Id
    @NotNull
    private Long idusuario;

    @Column
    @NotNull
    private String vacina;

    @Column
    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd")
    private String aplicacao;

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getVacina() {
        return vacina;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public String getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }
}

//    CREATE TABLE vacina_aplicada (
//    vacina varchar(30) NOT NULL,
//    email varchar(50) NOT NULL,
//    aplicacao date
//);

//    ALTER TABLE vacina_aplicada ADD CONSTRAINT fk_idusuario FOREIGN KEY (cpf) REFERENCES cadastrar_usuario (cpf);

//    ALTER TABLE cadastrar_usuario ADD idusuario int(100)
