public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {

        if (validarData(dia, mes, ano)) {
            this.dia = dia;
        }

        else {
            this.dia = 1;
        }

    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {

        if (validarData(dia, mes, ano)) {
            this.mes = mes;
        }

        else {
            this.mes = 1;
        }

    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {

        if (validarData(dia, mes, ano)) {
            this.ano = ano;
        }

        else {
            this.ano = 2000;
        }

    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private boolean validarData(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes(mes, ano)) {
            return false;
        }
        return true;
    }

    private int diasNoMes(int mes, int ano) {
        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (mes == 2 && verificaAnoBissexto()) {
            return 29;
        }
        return diasPorMes[mes];
    }
}
