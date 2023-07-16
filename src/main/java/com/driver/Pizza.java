package com.driver;

public class Pizza {

    private int price;
    private int totalprice;
    private Boolean isVeg;
    private String bill;
    private boolean billgenerated;
    private int papperBag;
    private boolean papper;
    private boolean toping;
    private int TopingPrice;
    private int CheesPrice;
    private boolean chees;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.TopingPrice=70;
        }else{
            this.price=400;
            this.TopingPrice=120;
        }
        CheesPrice=80;
        papperBag=20;
        totalprice=price;
        bill="Base Price Of The Pizza:"+price+"\n";
    }

    public int getPrice(){
        return this.totalprice;
    }

    public void addExtraCheese(){
        // your code goes here
       if(!chees){
           chees=true;
       totalprice=totalprice+CheesPrice;
       }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toping){
            toping=true;
            totalprice=totalprice+TopingPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!papper){
            papper=true;
            totalprice=totalprice+papperBag;
        }
    }

    public String getBill(){
        // your code goes here
if(!billgenerated) {
    billgenerated=true;
    if(chees)bill += "Extra Cheese Price =" + CheesPrice + "\n";
    if(toping)bill+="Extra Toppings Added:" + TopingPrice +"\n";
    if(papper)bill+="Paperbag Added:"+papperBag+"\n";

    bill+="Total Price: "+totalprice+"\n";

}

        return this.bill;
    }
}
