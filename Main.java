
interface Laptop {
     void powerOn();
     void powerOff();
     void soundOn();
     void soundOff();
}
     
class LaptopUser {
     private Laptop laptop;

     public LaptopUser (Laptop laptop){
          this.laptop = laptop;
     }
     void turnOffLaptop(){
          this.laptop.powerOff();
     }
     void turnOnLaptop(){
          this.laptop.powerOn();
     }
     void makeSoundOn(){
          this.laptop.soundOn();
     }
     void makeSoundOff(){
          this.laptop.soundOff();
     }
}

class Macbook implements Laptop{
     private boolean isPowerOn;
     private boolean isSoundOn;

     public Macbook(){}

     @Override
     public void powerOn(){
          isPowerOn = true;
          System.out.println("Laptop menyala");
          System.out.println("Selamat datang di Macbook");
     }
     @Override
     public void powerOff(){
          isPowerOn = false;
          System.out.println(" laptop dimatikan");
     }
     @Override
     public void soundOn(){
          System.out.println("mencoba menyalakan sound");
          if(isPowerOn){
               isSoundOn = true;
               System.out.println("sound menyala");
          }else{
               isSoundOn = false;
               System.out.println("nyalakan dulu laptopnya");
          }
     }
     @Override
     public void soundOff(){
          System.out.println("mencoba mematikan sound");
          if(isPowerOn){
               isSoundOn =false;
               System.out.println("sound telah di matikan");
          }else{
               isSoundOn = false;
               System.out.println("nyalakan dulu laptopnya");
          }
     }
     public void getStatus(){
          if (isPowerOn){
          System.out.println("laptop menyala");
     } else{
          System.out.println("Laptop mati");
     }if (isSoundOn){
          System.out.println("sound menyala");
     }else{
          System.out.println("sound mati");
     }
  }
}

class Lenovo implements Laptop{
     private boolean isPowerOn;
     private boolean isSoundOn;
     
     public Lenovo(){}

     @Override
     public void powerOn(){
          isPowerOn = true;
          System.out.println("laptop menyala");
          System.out.println("selamat datang di Lenovo");
     }
     @Override 
     public void powerOff(){
          isPowerOn = false;
          System.out.println("laptop mati");
     }
     @Override
     public void soundOn(){
          System.out.println("mencoba menyalakan sound");
          if(isSoundOn){
               isSoundOn = true;
               System.out.println("sound akan menyala");
          }else{
               isSoundOn = false;
               System.out.println("nyalakan laptopnya dulu");
          }
     }
     @Override
     
     public void soundOff(){
          System.out.println("mencoba mematikan sound");
          if(isPowerOn){
               isSoundOn = false;
               System.out.println("sound dimatikan");
          }else{
               isSoundOn = false;
               System.out.println("nyalakan dulu laptopnya mas");
          }
     }

     public void getStatus(){
          if(isPowerOn){
               System.out.println("laptop di nyalakan");
          }else{
               System.out.println("laptop di matikan");
          } if (isSoundOn) {
               System.out.println("sound menyala");
          }else{
               System.out.println("sound akan mati");
          }
     }
     
class Asus implements Laptop{
     private boolean isPowerOn;
     private boolean isSoundOn;
          
     public Asus(){}
     
          @Override
          public void powerOn(){
               isPowerOn = true;
               System.out.println("laptop menyala");
               System.out.println("selamat datang di Asus");
          }
          @Override 
          public void powerOff(){
               isPowerOn = false;
               System.out.println("laptop mati");
          }
          @Override
          public void soundOn(){
               System.out.println("mencoba menyalakan sound");
               if(isSoundOn){
                    isSoundOn = true;
                    System.out.println("sound akan menyala");
               }else{
                    isSoundOn = false;
                    System.out.println("nyalakan laptopnya dulu");
               }
          }
          @Override
          
          public void soundOff(){
               System.out.println("mencoba mematikan sound");
               if(isPowerOn){
                    isSoundOn = false;
                    System.out.println("sound dimatikan");
               }else{
                    isSoundOn = false;
                    System.out.println("nyalakan dulu laptopnya mas");
               }
          }
     
          public void getStatus(){
               if(isPowerOn){
                    System.out.println("laptop di nyalakan");
               }else{
                    System.out.println("laptop di matikan");
               } if (isSoundOn) {
                    System.out.println("sound menyala");
               }else{
                    System.out.println("sound akan mati");
               }
          }
     }

public class Main {
     public void main(String[] args){
     
               LaptopUser laptopUser = new LaptopUser(new Macbook());
     
               laptopUser.turnOnLaptop();
               laptopUser.makeSoundOff();
               laptopUser.turnOffLaptop();
               laptopUser.makeSoundOn();
     
               System.out.println();
     
               LaptopUser LaptopUser2 = new LaptopUser(new Asus());
     
               laptopUser.turnOnLaptop();
               laptopUser.makeSoundOn();
               laptopUser.turnOffLaptop();
               laptopUser.makeSoundOff();
     
               System.out.println();
     
               LaptopUser laptopUser3 = new LaptopUser(new Lenovo());
     
               laptopUser.turnOnLaptop();
               laptopUser.makeSoundOn();
               laptopUser.turnOffLaptop();
               laptopUser.makeSoundOff();
               
          }
    }
}