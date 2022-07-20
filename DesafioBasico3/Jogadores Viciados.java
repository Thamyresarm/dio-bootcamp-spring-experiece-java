// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int number,id;
        //System.out.println("Digite o número de gameplays publicadas");
        number=sc.nextInt();
        //System.out.println("Digite o seu identificador na universidade");
        id=sc.nextInt();

        int count=0;
        while(number>0){

            int id1,num;

            //System.out.println("Digite o identificador do player");
            id1=sc.nextInt();
            //System.out.println("Digite o numero referente ao game: 0 - CS 1 - LOL");
            num=sc.nextInt();

            if(id== id1 &&  num==0){
                count++;
            }

            number--;
        }
        System.out.println(count);

    }
}