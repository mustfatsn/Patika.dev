package BoxingGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int firstPunch;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight,int firstPunch){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

        if (firstPunch >= 0 && firstPunch <= 100){
            this.firstPunch = firstPunch;
        }else{
            this.firstPunch = 0;
        }

    }

    void run(){
        if (isCheck()){
            for (int i = 1; i <= 2;i++){
                System.out.println("======BİRİNCİ ROUND======");
                if (isfirstPunch()){
                    System.out.println(this.f1.name + " ilk atak yapan veren.");
                    this.f2.health = this.f1.hit(f2);
                }else{
                    System.out.println(this.f2.name + " ilk atak yapan veren.");
                    this.f1.health = this.f2.hit(f1);
                }
                System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
                i++;
            }
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("======YENİ ROUND======");
                this.f2.health = this.f1.hit(f2);
                if (isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(f1);
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
            }
        }else{
            System.out.println("Sporcuların Sikletleri Uymuyor.");
        }
    }

    boolean isCheck(){
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >=minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı !");
            return true;
        }
        return false;
    }
    boolean isfirstPunch(){
        double randomPunch = Math.random() * 100;
        return randomPunch >= this.firstPunch;
    }
}
