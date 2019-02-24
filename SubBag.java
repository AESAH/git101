class SubBag extends Bag {
    public void PrintItem(int number){
        if(number==1){
            System.out.println("IncreaseBlood: Hp+3");
        }else if(number==2){
            System.out.println("Attack: Exp+2 Hp-2");
        }
        
    }
}
