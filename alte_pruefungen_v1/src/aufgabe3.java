class Work {
    int var=10;
    static int theSt=5;
    Work(int p){
        theSt++;
        var +=p;
    }
    boolean test(double d){
        return d>var/theSt;
    }

        }

public class aufgabe3 {

    public static void main(String[] args) {
        Work [] w[] = new Work [3][2];
        Work h=new Work(3);
        w[0][1]=h;
        w[2]=new Work[3];
        w[2][2]=new Work(4);
        boolean b=w[0][1].test(2.0);
        System.out.println(w[0][1].test(2.0));
        System.out.println(w[0][1].var+","+w[2][2].theSt);
        System.out.println(Work.theSt + ","+w[0][1].theSt+","+w[2][2].theSt);
        System.out.println(b);


    }
}
