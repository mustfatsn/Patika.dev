package StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","555","TRH");
        Teacher t2 = new Teacher("Graham Bell","000","FZK");
        Teacher t3 = new Teacher("Külyutmaz","111","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","101","FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji","101","BIO");
        biyoloji.addTeacher(t3);

        Course trhoral = new Course("Tarih","101","TRH");
        Course fzkoral = new Course("Fizik","101","FZK");
        Course bioral = new Course("Biyoloji","101","BIO");

        Student s1 = new Student("İnek Şaban","123","5",tarih,fizik,biyoloji,trhoral,fzkoral,bioral);
        s1.addBulkExamNote(100,78,50);
        s1.addBulkOralNote(20,30,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","444","4",tarih,fizik,biyoloji,trhoral,fzkoral,bioral);
        s2.addBulkExamNote(50,30,70);
        s2.addBulkOralNote(50,60,70);
        s2.isPass();
    }
}
