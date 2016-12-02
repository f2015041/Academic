import java.util.*;
//Scanner n=new Scanner(System.in);
interface Movable{ void move(String newPos); }

abstract class Chesspiece implements Movable{
        String name;                               //king,queen,pawn,bishop,knight,castle;
	String color;                              //Black or White
	String curPos;
	public Chesspiece(String n,String c,String pos){
	       name=n;
	       color=c;
	       curPos=pos;
	}
}
class King extends Chesspiece{ 
     public King(String n,String c,String pos){ super(n,c,pos); }
    // String gameMove=n.next();
     public void move(String newPos){
            System.out.println(name+" moved from "+curPos+" to " + newPos);
     }
}
class Queen extends Chesspiece{
      public Queen(String n,String c,String pos){ super(n,c,pos); }
     // String gameMove=n.next();
      public void move(String newPos){
             System.out.println(name+" moved from " + curPos+ " to " + newPos);
      }
}
class Bishop extends Chesspiece{
      public Bishop(String n,String c,String pos){ super(n,c,pos); }
     // String gameMove=n.next();
      public void move(String newPos){
             System.out.println(name+" moved from " + curPos+ " to  " + newPos);
      }
}

public class p18chess{
       public static void main(String args[]){
       ArrayList<Chesspiece> a=new ArrayList<>();
       Scanner n=new Scanner(System.in);
       Chesspiece p1=new King("king","white","d1");
       Chesspiece p2=new Queen("queen","black","f3");
       Chesspiece p3=new Bishop("bishop","white","e3");
       a.add(p1);
       a.add(p2);
       a.add(p3);
       System.out.println("Choosen 3 pieces");
       int play=1;
       do{
         System.out.println("First piece move");
	 a.get(0).move(n.next());
	 System.out.println("SECOND Piece move");
	 a.get(1).move(n.next());
	 System.out.println("Thirde piece move");
	 a.get(2).move(n.next());
	 play=0;
       }while(play==1);

     }

