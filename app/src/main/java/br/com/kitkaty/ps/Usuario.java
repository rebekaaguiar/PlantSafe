package br.com.kitkaty.ps;

public class Usuario {
    private String temperatura;
    private long id;
    private long umidade;
    private String datahora;
    private String regada;


    @Override
    public String toString() {
        return "Temperatura = " + temperatura + "\nId = " + id + "\nUmidade = " + umidade +
                "\nData e hora = " + datahora + "\nRegada = " + regada;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getRegada() {
        return regada;
    }

    public void setRegada(String regada) {
        this.regada = regada;
    }

    public long getUmidade() {
        return umidade;
    }

    public void setUmidade(long umidade) {
        this.umidade = umidade;
    }

    public String getDatahora() {
        return datahora;
    }

    public void setDatahora(String datahora) {
        this.datahora = datahora;
    }

    public Usuario(String datahora, String regada) {

        this.datahora = datahora;
        this.regada = regada;
    }

    public Usuario(long id, String temperatura, long umidade, String datahora, String regada) {

        this.id = id;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.datahora = datahora;
        this.regada = regada;

    }
}

