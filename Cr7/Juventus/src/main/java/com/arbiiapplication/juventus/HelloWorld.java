package com.arbiiapplication.juventus;

public class HelloWorld {
    public void testfunc(){
        int count = 0;
        System.out.println("COUNT UPDATED TO : " + count+1 );
    }

    public static void main(String args[]){

////        humne class HelloWorld k andr obj instanciate krwaya hai
//
//        HelloWorld obj = new HelloWorld();
//        obj.testfunc();
//        System.out.println("Cr7 THE ICON");


        Players match1 = new Players();
        Players match2 = new Players();

        match1.Ronaldo = 3;
        match1.Dybala = 2;
        match1.pianiC =5;
        match1.Buffon = 6;
        System.out.println("GOALS IN MATCH 1 ");
        System.out.println("RONALDO " + match1.Ronaldo);
        System.out.println("Dybala " + match1.Dybala);
        System.out.println("PianiC " + match1.pianiC);
        System.out.println("Buffon " + match1.Buffon);
        System.out.println("MY NAME IS :  " + Players.name);

    }
}


//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class HelloWorld{
//
//
//    public static void main(String args[]){
//        ArrayList nameArray = new ArrayList();
//        nameArray.add("AREEB");
//        nameArray.add("ZAR");
//        nameArray.add("SULTAN");
//        nameArray.add("MEENA");
//
//        Iterator iterator = nameArray.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//    }
//
//}