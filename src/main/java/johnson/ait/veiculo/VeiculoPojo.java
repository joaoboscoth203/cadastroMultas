/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package johnson.ait.veiculo;

import java.util.List;

/**
 *
 * @author joaob
 */
public class VeiculoPojo {
    
    private String placa;
    private int ano;
    private String modelo;
    private String marca;
    private String condutor;
    private List<Multa> multa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCondutor() {
        return condutor;
    }

    public void setCondutor(String condutor) {
        this.condutor = condutor;
    }

    public List<Multa> getMulta() {
        return multa;
    }

    public void setMulta(List<Multa> multa) {
        this.multa = multa;
    }
    
    
    
}
