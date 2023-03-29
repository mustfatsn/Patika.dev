package StudentInformationSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course o1;
    Course o2;
    Course o3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3,Course o1,Course o2,Course o3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        int avarage = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
       if (note1 >= 0 && note1 <= 100){
           this.c1.note = note1;
       }
       if (note2 >= 0 && note2 <= 100){
           this.c2.note = note2;
       }
       if (note3 >= 0 && note3 <= 100){
           this.c3.note = note3;
       }
    }
    void addBulkOralNote(int oral1, int oral2, int oral3){
        if (oral1 >= 0 && oral1 <= 100){
            this.o1.oral = oral1;
        }
        if (oral2 >= 0 && oral2 <= 100){
            this.o2.oral = oral2;
        }
        if (oral3 >= 0 && oral3 <= 100);
            this.o3.oral = oral3;
    }

    void isPass(){
        if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0 ){
            System.out.println("Notlar Tam Olarak Girilmemiş");
        }
        if (this.o1.note == 0 || this.o2.note == 0 || this.o3.note == 0 ){
            System.out.println("Notlar Tam Olarak Girilmemiş");
        }
        System.out.println("=============");
        this.avarage = (((this.c1.note * 0.80)+(this.o1.oral * 0.20)) +
                             ((this.c2.note * 0.80)+(this.o2.oral * 0.20)) +
                             ((this.c3.note * 0.80)+(this.o3.oral * 0.20))) / 3.0;
        if (this.avarage > 55){
            System.out.println("Hababam Sınıfı Uyanıyor ! ");
            this.isPass = true;
        }else{
            System.out.println("Hababam Sınıfı,Sınıfta Kaldı ! ");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Sınavı: " + this.c1.note);
        System.out.println(this.c2.name + " Sınavı: " + this.c2.note);
        System.out.println(this.c3.name + " Sınavı: " + this.c3.note);
        System.out.println(this.o1.name + " Sözlü: " + this.o1.oral);
        System.out.println(this.o2.name + " Sözlü: " + this.o2.oral);
        System.out.println(this.o3.name + " Sözlü: " + this.o3.oral);
        System.out.println("Ortalama: " + this.avarage);
    }
}
