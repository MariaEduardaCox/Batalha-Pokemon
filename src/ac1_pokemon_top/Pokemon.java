
package ac1_pokemon_top;

public final class Pokemon {
    //Atributos
    private String nome;
    private String tipo;
    private int vida = 200;
    private double defesa;
    private double ataque;
    private int level;
    
    //Construtor
    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;        
        this.level = level;
        
        calculaAtributos();
        calculaLevel();
        imprimeAtributos();
    }

    public String getNome() {
        return nome;
    }
    public int getVida(){
        return vida;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        
    }
    
    
    //Métodos
    private void calculaLevel(){
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
    }
    
    void imprimeAtributos(){
        System.out.println("Nome: "+ this.nome + " | " +
                           "Tipo: " + this.tipo + " | " +
                           "Vida: " + this.vida + " | " +
                           "Level: " + this.level + " | " +
                           "Defesa: " + this.defesa + " | " +
                           "Ataque: " + this.ataque + " | ");
    }
    
    private void calculaAtributos(){        
        switch(this.tipo){
            case "Fogo":
                this.ataque = 100; 
                this.defesa = 50;
                this.vida = this.vida - 20;
            break;
            
            case "Água":
                this.ataque = 80; 
                this.defesa = 70;
                this.vida = this.vida + 30;
            break;
            
            case "Terra":
                this.ataque = 70; 
                this.defesa = 100;
                this.vida = this.vida + 50;
            break;
            
            case "Planta":
                this.ataque = 80; 
                this.defesa = 70;
                this.vida = this.vida + 100;
            break;
                
            case "Elétrico":
                this.ataque = 90;
                this.defesa = 60;
                this.vida = this.vida + 40;
            break;
        }
    }   
}
    

    
