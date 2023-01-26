package ie.dit;

public class HelloWorld
{
    public static void main(String[] args)
    {
       System.out.println("Hello World"); 
       
       Person bryan = new Person("Bryan");

       bryan.sayHello();

       Person Gizemé = new Person("Gizemé");

       Gizemé.sayHello();

       Cat ginger = new Cat("Ginger");

       ginger.Kill();


    }

}

