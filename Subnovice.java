class Subnovice extends Novice {
    public void SetCareer(String s){
        career=s;
        if(career=="Tank"){
            Spd = 2;
            Atk = 20;
            Def = 40;
        }else if(career=="Marksman"){
            Spd = 5;
            Atk = 30;
            Def = 30;
        }
    }
    public void PrintStatusCareer(){
        System.out.println("Your Career : "+career);
        System.out.println("Speed = "+Spd+" Attack = "+Atk+" Defend = "+Def);
    }
}
