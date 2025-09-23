public class Exercicio7 {

    private String nome = "";
    private int idade = 0;
    private float peso = 0;
    private float altura = 0;

    public Exercicio7(String nome, int idade, float peso, float altura) {
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        setAltura(altura);
    }

    public Exercicio7(float peso, float altura) {
        setPeso(peso);
        setAltura(altura);
    }

    public Exercicio7(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public Exercicio7() {

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

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

    // Métodos comportamentais
    public void envelhecer() {
        idade++;
        if (idade < 21) {
            crescer(0.5f); // cresce 0,5 cm por ano
        }
    }

    public void engordar(float quilos) {
        peso += quilos;
    }

    public void emagrecer(float quilos) {
        peso -= quilos;
    }

    public void crescer(float cm) {
        altura += cm;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Exercicio7 [nome=");
        builder.append(nome);
        builder.append(", idade=");
        builder.append(idade);
        builder.append(", peso=");
        builder.append(peso);
        builder.append(", altura=");
        builder.append(altura);
        builder.append("]");
        return builder.toString();
    }
}
