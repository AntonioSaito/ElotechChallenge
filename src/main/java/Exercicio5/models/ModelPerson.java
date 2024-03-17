package Exercicio5.models;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Pessoa")
public class ModelPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento;

    public ModelPerson() {
    }

    public ModelPerson(Integer id, String nome, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
        return id + " - " + nome + " - " + formatacao.format(dataNascimento);
    }

}
