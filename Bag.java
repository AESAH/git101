import java.io.*;
import java.util.Scanner;
public class Bag{
    public void MyBag(){
        Subnovice nv = new Subnovice();
        SubBag b = new SubBag();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose your Item");
        System.out.println("(1)IncreaseBlood (2)Attack (3)Status (4)Stop");
        int n=0;
        while(n!=4)
        {
            System.out.print("Enter number: ");
            n=scan.nextInt();
            if(n==1){
                b.PrintItem(1);
                nv.Eat(3);
            }
            else if(n==2){
                b.PrintItem(2);
                nv.Walk();
            }
           
            else if(n==3){
                nv.PrintStatus(nv.level,nv.hp,nv.exp);
            }  
        }
        System.out.println("End Game");
    }
}
