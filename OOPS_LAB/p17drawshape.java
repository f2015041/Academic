import java.util.*;

abstract class Shape{
       private int color;

       public void setColor(int c){ color=c; }
       public int getColor(){ return color; }

       abstract void readInput();                         //abstract Functions
       abstract void calculateArea();
       abstract void calculatePerimeter();
       abstract void display();
}
class Triangle extends Shape{                              //equilateral triangle
       int b , h ,perimeter;
       double area;
       Scanner in=new Scanner(System.in);
       public Triangle(){
              this.b=0;
	      this.h=0;
	}
	public void readInput(){
	      System.out.println("Enter base,height and color");
              b=in.nextInt();
	      h=in.nextInt();
              super.setColor(in.nextInt());
	}
	public void calculateArea(){  area=0.5*b*h ;  }
	public void calculatePerimeter(){  perimeter=3*b;  }
	public  void display(){
	        System.out.println("Area,Perimeter and Color are "+area+" "+perimeter+" "+super.getColor());
	 }
}
class Rectangle extends Shape{
      int l,w,area,perimeter;
      Scanner in=new Scanner(System.in);

      public Rectangle(){
             this.l=0;
	     this.w=0;
      }
      public void readInput(){
             System.out.println("Enter lenght,width and color");
             l=in.nextInt();
	     w=in.nextInt();
	     super.setColor(in.nextInt());
      
      }
      public void calculateArea(){  area=l*w; }
      public void calculatePerimeter(){  perimeter=2*(l+w);  }
      public void display(){
             System.out.println("Area, Perimeter and Color are "+area+" "+perimeter+" "+super.getColor());
      }
}
class Circle extends Shape{
      int r;
      double area,perimeter;
      Scanner in=new Scanner(System.in);

      public Circle(){ this.r=0; }
      public void readInput(){
              System.out.println("Enter radius and color");
	      r=in.nextInt();
              super.setColor(in.nextInt());
      }
      public void calculateArea(){  area=3.14*r*r; }
      public void calculatePerimeter(){  perimeter=2*3.14*r; }
      public void display(){
             System.out.println("Area, Peirmeter and Color are "+area+" "+perimeter+" "+super.getColor()) ;
      }
}

public class p17drawshape{
       public static void main(String[] args){

       ArrayList<Shape> s=new ArrayList<Shape>();
       
       Scanner in=new Scanner(System.in);

       int n; 
       do{
         System.out.println("Enter 1 for tri,2 for rect and 3 for circ");
	 n=in.nextInt();
	 if(n==1){
	 Shape sh=new Triangle();
	 sh.readInput();
	 sh.calculateArea();
	 sh.calculatePerimeter();
	 sh.display();
	 s.add(sh);
	 }
	 if(n==2){
	  Shape sh=new Rectangle();
	  sh.readInput();
	  sh.calculateArea();
	  sh.calculatePerimeter();
	  sh.display();
	  s.add(sh);
	 }
	 if(n==3){
	   Shape sh=new Circle();
	   sh.readInput();
	   sh.calculateArea();
	   sh.calculatePerimeter();
	   sh.display();
	   s.add(sh);
	 }
	}while(n!=0);
  
 }
}



       
