public class Carro {
    private String placa;
    private String modelo;
    private Integer ano;
    private Integer tanque;
    private Integer media;
    private Boolean ligado;

    public Carro(String placa, String modelo, Integer ano, Integer media) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.media = media;
        this.tanque = 10;
        this.ligado = false;
    }

    public Carro() {
    }

    public void setPlaca(String placa) {
      this.placa = placa;
    }

    public String getPlaca(){
        return this.placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getTanque() {
        return this.tanque;
    }

    public void setTanque(Integer tanque) {
        this.tanque = tanque;
    }

    public Integer getMedia() {
        return media;
    }

    public void setMedia(Integer media) {
        this.media = media;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean situacao(){
        return this.ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void abastecer(Integer litros) {
        if (this.situacao() == false) {
            this.tanque = this.tanque + litros;
        } else {
            System.out.println("Carro ligado, não pode abastecer");
        }
    }

    public void dirigir(Integer percurso) {
        if (this.situacao() == true) {
       Integer consumo = percurso/this.media;
       this.tanque = this.tanque - consumo;
        } else {
            System.out.println("O carro está desligado");
        }
    }
}
