import java.security.Timestamp;
import java.util.Date;

public class Carro {
    private String placa;
    private long horarioEntrada;
    private Timestamp entradaFormat;

    //construtor
    public Carro(String placa) {
        this.placa = placa;

        Date data = new Date();
        horarioEntrada = data.getTime();
    }

    public String getPlaca() {
        return placa;
    }

    public long getHorarioEntrada() {
        return horarioEntrada;
    }

    @Override
    public String toString() { 
        return "[ placa: " + placa + " horario de entrada: " + horarioEntrada + " ]";
    }
}
