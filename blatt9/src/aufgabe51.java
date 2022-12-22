import static jsTools.Input.*;
class Student{


    String vorname;
    String nachname;
    String studiengang;
    int semester;
    int punkte;
    static int studentenanzahl=0;

    {
        if (this.studentenanzahl<10) {
            this.studentenanzahl++;
        }
    }

    Student(String vorname, String nachname, String studiengang){
        this.vorname=vorname;
        this.nachname=nachname;
        this.studiengang=studiengang;
    }

    Student(){
        this.vorname=readString("Name");
        this.studiengang=readString("Studiengang");
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + vorname + '\'' +
                ", studiengang='" + studiengang + '\'' +
                ", semester=" + semester +
                '}';
    }

    public static int getStudentenanzahl() {
        return studentenanzahl;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    public void vorruecken(){
        boolean darfVorruecken=false;
        if (30>=punkte && punkte<90){
            darfVorruecken=true;

            this.semester=3;
        }else if(punkte>=90 && punkte<105){
            darfVorruecken=true;
            this.semester=5;


        }else if(punkte>=105){
            darfVorruecken=true;
            this.semester=7;

        }
    }
}


public class aufgabe51 {
    public static void main (String [] args){
        Student student1=new Student("Peter", "Müller","Informatik");
        student1.setPunkte(20);
        student1.vorruecken();
        System.out.println(student1.toString());
        Student student2=new Student("Maria","Huber","WI");
        student2.setPunkte(120);
        student2.vorruecken();
        student2.toString();
        System.out.println(student2.toString());



    }


             }