import java.util.Scanner;

public class estruturaParte1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem-vindo, agora estaremos começando o jogo Ping Pong Imaginario, você terá de se esforçar para acertar, ");
        System.out.println("nada que exiga movimentos rápidos, mas um raciocionio rápido, acerte onde a bolinha irá cair...apenas isso.");
   
        System.out.println();

        System.out.println("acha que consegue? - 1 para sim, 0 para não -.");
        int inicio = input.nextInt();

        int rodadas = 1;
        while (inicio != 1 && inicio != 0){
            System.out.println("acha que consegue? - 1 para sim, 2 para não-.");
            inicio = input.nextInt(); 
            
            if(rodadas > 3 && rodadas < 5){
                System.out.println("1 para sim, 0 para não. Caso não queira, o X é serventia do terminal :)");
                
            }

            if (rodadas > 6){
                break;
            }

            rodadas++;
        }

        if(inicio == 0){
            System.out.println("Beleza, até mais.");
        } else {

        }

   
    }
}
