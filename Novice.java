import java.io.*;
import java.util.Scanner;
public class Novice {
    public double hp = 80;
    public double hp_max = 80;
    public int exp = 0;
    public int level = 1;
    public int Spd;
    public int Atk;
    public int Def;
    public String career;
    public static void main(String[] args) {
        Subnovice nv = new Subnovice();
        Bag B = new Bag();
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose your career (1)Tank (2)Marksman");
        a=scan.nextInt();
        if(a==1){
            nv.SetCareer("Tank");
        }else if(a==2){
            nv.SetCareer("Marksman");
        }
        nv.PrintStatusCareer();
        nv.PrintStatus(nv.level,nv.hp,nv.exp);
        B.MyBag();
    }
    public void HP_UP(double hp){
        if(this.hp<this.hp_max){
            this.hp = this.hp+hp;
        }
    }
    public void HP_DOWN(double hp){
        this.hp = this.hp-hp;
    }
    public void Level_Up(){
        this.level = this.level+1;
        this.exp = 0;
    }

    public void EXP(int exp){
            this.exp = this.exp+exp;
            if(this.exp>=20){
                Level_Up();
            }
    }

    public void Walk(){
        EXP(2);
        HP_DOWN(2);
    }
   
    public void Eat(double hp){
        HP_UP(hp); 
    }
    public void PrintStatus(int level,double hp,int exp){
        System.out.println("level : "+level);
        System.out.println("HP : "+hp+"/"+hp_max);
        System.out.println("EXP : "+exp);
    }
    
}