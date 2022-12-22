/*

public class aufgabe 2{

public static void main(String[]args){
        int[][]m=genMatrix(5,5,3);
        for(int i=0;i< 5;i++){
        for(int j=0;j< 5;j++){
        System.out.print(m[i][j]+"\t");
        }
        System.out.println();
        }

        System.out.println();
        System.out.println();

        int[][]m1={{1,3,4,8},{9,6,3,2},{5,7,8,4}};
        int[][]m2={{5,3,6},{8,4,5},{9,7,8},{2,1,3}};
        int[][]c=mixMatrix(m1,m2);

        for(int i=0;i<c.length;i++){
        for(int j=0;j<c[0].length;j++){
        System.out.print(c[i][j]+"\t");
        }
        System.out.println();
        }
        }

static int[][]genMatrix(int dimR,int dimS,int val){
        int[][]m=new int[dimR][dimS];

        for(int i=0;i<dimR; i++){
        for(int j=0;j<dimS; j++){
        m[i][j]=0;
        }
        }

        for(int i=0;i<dimR; i++){
        m[i][0]=val;
        }
        for(int i=0;i<dimR; i++){
        m[i][dimS-1]=val;
        }
        for(int i=0;i<dimS; i++){
        m[0][i]=val;
        }
        for(int i=0;i<dimS; i++){
        m[dimR-1][i]=val;
        }
        return m;
        }

static int[][]mixMatrix(int[][]m1,int[][]m2){
        int[][]m;
        int x;
        int y;
        if(m1.length>m2.length&&m1[0].length>m2[0].length){
        m=new int[m1.length][m1[0].length];
        x=m2.length;
        y=m2[0].length;
        }else if(m1.length<=m2.length&&m1[0].length>m2[0].length){
        m=new int[m2.length][m1[0].length];
        x=m1.length;
        y=m2[0].length;
        }else if(m1.length>m2.length&&m1[0].length<=m2[0].length){
        m=new int[m1.length][m2[0].length];
        x=m2.length;
        y=m1[0].length;
        }else if(m1.length<=m2.length&&m1[0].length<=m2[0].length){
        m=new int[m2.length][m2[0].length];
        x=m1.length;
        y=m1[0].length;
        }else{
        m=new int[0][0];
        x=0;
        y=0;
        }

        for(int i=0;i<m.length;i++){
        for(int j=0;j<m[0].length;j++){
        m[i][j]=0;
        }
        }

        for(int i=0;i<x; i++){
        for(int j=0;j<y; j++){
        m[i][j]=m1[i][j]+m2[i][j];
        }
        }

        return m;

        }

static void exChangeCol(int[][]m1,int c1,int c2){
        int[]arr=new int[m1.length];
        for(int i=0;i<m1.length;i++){
        arr[i]=m1[i][c1];
        m1[i][c1]=m1[i][c2];
        }
        for(int i=0;i<arr.length;i++){
        m1[i][c2]=arr[i];
        }
        }


static void fillRand(int[][]m){
        for(int i=0;i<m.length;i++){
        for(int j=0;j<m[0].length;j++){
        m[i][j]=(int)(100*Math.random());
        }
        }
        }

        }
        */
