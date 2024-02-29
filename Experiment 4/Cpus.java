import java.util.Scanner;
class Cpu
{
int price=15000;
	class Processor
	{
	int noOfCores=4;
	String manufacturer="intel cop.";
	void display()
	{
	System.out.println("No Of Cores:"+noOfCores);
	System.out.println("Manufactures:"+manufacturer);
	}
	}
void display()
{
Processor p=new Processor();
p.display();
System.out.println("Price="+price);
}
static class Ram{
int memory=8;
String manufacturer="corsair";
void display()
{
System.out.println("Details of Ram");
System.out.println("Memory:"+memory);
System.out.println("Manufacturer:"+manufacturer);
}
}
}
class Cpus{
public static void main(String args[]){
Cpu c1=new Cpu();
c1.display();
Cpu.Ram r1=new Cpu.Ram();
r1.display();
}
}

