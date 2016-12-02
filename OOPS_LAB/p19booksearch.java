import java.util.*;
class Book implements Comparable<Book>{
       private String name;
       private double cost;
       GeneralizedSearch g;
       public Book(String n,double c){
              name=n;
	      cost=c;
      }
     /* public int compareTo(Book other){
            if(name.equals(other.name)==true){return 0;}
	    else{return 1;}// Compares name from current book obj with name of another book obj
      }                                          
      public void display(){System.out.println(name+ " " +cost);} */
      public double getCost(){return cost;}
      public String getName(){return name;}
      @Override
      public int compareTo(Book o)
      {
       if(name.compareTo(o.name)<0){ return -1; }
       if (name.compareTo(o.name)>0){return  1; }
       return 0; 
      }
}

class GeneralizedSearch{
      public static boolean search(ArrayList<Book> b,Book a){

             boolean match=false;
	     
	     for(int i=0;i<b.size();i++){
	         if(a.compareTo(b.get(i))==0)
		    { match=true;}
		 else
		    {match=false;}
	      }
	      return match;
	      
     }
}                                                        
public class p19booksearch{
       public static void main(String[] args){
         /*     Book[] bList=new Book[3];
	      bList[0]=new Book("ABC",100);
	      bList[1]=new Book("DEF",200);
	      bList[2]=new Book("GHI",300);
              Book toBeCompared=new Book("DEF",200);
	      int b=(GeneralizedSearch.search(bList,toBeCompared));
	      if(b==1){
	        toBeCompared.display();
	      }else{System.out.println(" Not matching ");}          */
              String a;
	      double c;
	      boolean r;
	      ArrayList<Book> B=new ArrayList<Book>();
	      Book b1=new Book("ABC",100);
	      B.add(b1);
	      Book b2=new Book("DEF",200);
	      B.add(b2);
	      Book b3=new Book("GHI",300);
	      B.add(b3);
	      Book b4=new Book("ABC",100);
	      r=GeneralizedSearch.search(B,b4);
	      if(r==true){System.out.println("Book found");
	      }else{System.out.println("Book not found");}


       }
 }
