class Shapes{
//area of square
int area(int l){
return l*l;
}

//area of rectangle
int area(int l,int b){
return l*b;
}

//area of cuboid
int area(int l,int b,int h){
return((2*l*b)+(2*l*h)+(2*b*b));
}
public static void main(String args[]){
Shapes s=new Shapes();
System.out.println("Area of square: "+s.area(5));
System.out.println("Area of rectangle: "+s.area(3,6));
System.out.println("Area of cuboid: "+s.area(5,2,4));
}
}
