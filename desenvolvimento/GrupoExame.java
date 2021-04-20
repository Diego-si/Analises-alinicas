
package desenvolvimento;

import java.util.Scanner;

public class GrupoExame {
    private int codigo;
    private String Descrição;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }
    
    public void cadastrar(){
        Scanner cad = new Scanner(System.in);
        System.out.print("Código do Grupo: ");
        this.setCodigo(cad.nextInt());
        cad.nextLine();
        System.out.println("Grupo de Exame: ");
        this.setDescrição(cad.nextLine());
    }
    public void imprimirGrupoExame(){
        System.out.println("Código: "+this.getCodigo());
        System.out.println("Grupo do Exame: "+this.getDescrição());
        System.out.println("-----------------------");
    }
    public void listarGrupoExame(){
        System.out.print(" | "+this.getDescrição());
    }
}
