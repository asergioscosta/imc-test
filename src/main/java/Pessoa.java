public class Pessoa {

    private float peso;
    private float altura;
    private String sexo;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float calcularImc() {
        return this.peso / (this.altura * this.altura);
    }

    public String verificarImc() {
        float imc;
        imc = this.calcularImc();
        if (this.sexo.equals("Masculino")) {
            if (imc < 20.7) {
                return "abaixo do peso";
            }
            else {
                if (imc < 26.4) {
                    return "no peso normal";
                }
                else {
                    if (imc < 27.8) {
                        return "marginalmente acima do peso";
                    }
                    else {
                        if (imc < 31.1) {
                            return "acima do peso ideal";
                        }
                        else {
                            return "obeso";
                        }
                    }
                }
            }
        }
        else
        {
            if (imc < 19.1) {
                return "abaixo do peso";
            }
            else {
                if (imc < 25.8) {
                    return "no peso normal";
                }
                else {
                    if (imc < 27.3) {
                        return "marginalmente acima do peso";
                    }
                    else {
                        if (imc < 32.3) {
                            return "acima do peso ideal";
                        }
                        else {
                            return "obeso";
                        }
                    }
                }
            }
        }
    }
}