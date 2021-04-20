
package desenvolvimento;

import java.util.Scanner;


public class UF {
   private String nome;
   private String sigla;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
   
    public void cadastrar(){
        Scanner tec = new Scanner(System.in);
        System.out.print("Estado: ");
        this.setNome(tec.nextLine());
        System.out.print("Sigla: ");
        this.setSigla(tec.nextLine());
    }
    public void imprimirUF(){
        System.out.println("Estado: "+this.getNome());
        System.out.println("Sigla: "+this.getSigla());
    }
}