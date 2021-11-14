import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);


        int qtdPessoas, qtdSanduiches;
        ArrayList tamSanduiches = new ArrayList();

        qtdPessoas = sc.nextInt();
        qtdSanduiches = sc.nextInt();

        for (int i=0; i<qtdSanduiches; i++){
            tamSanduiches.add(sc.nextInt());
        };


        int menor = (Integer)tamSanduiches.get(0);
        int maior = (Integer)tamSanduiches.get(0);



        for (int i=1; i<qtdSanduiches; i++){
            int aux = (Integer)tamSanduiches.get(i);

            if (aux < menor){
                menor = aux;
            }
        }

        for (int i=1; i<qtdSanduiches; i++){
            int aux = (Integer)tamSanduiches.get(i);

            if (aux > maior){
                maior = aux;
            }
        }

        int centrimetrosV=0;

        int centimetros = 0;
        int qtdFatias = 0;

        for (int tam = 1; tam <= maior ; tam++){
                centimetros = 0;
                qtdFatias = 0;
                for (int j = 0; j <qtdSanduiches; j++){
                        int SanduicheTam = (Integer)tamSanduiches.get(j);
                        int divisor = SanduicheTam/tam;
                        qtdFatias = qtdFatias + divisor;
                        centimetros = tam;
                }

                if (qtdFatias == qtdPessoas){
                    centrimetrosV = centimetros;
                }

        }
        System.out.print(centrimetrosV);
        

        sc.close();
  }
}
