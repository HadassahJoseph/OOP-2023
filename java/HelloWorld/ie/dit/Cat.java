package ie.dit;

public class Cat 
{
    String name;
    private int numLives = 9 ;

    public Cat (String name)
    {
        this.name = name;
        this.numLives = 9;
    }

    public void Kill()
    {
        int i;
        for(i=0; i<numLives; i++){

            if (i > 0){

                System.out.println("Ouch");

            }

            else if (i == 0){
                System.out.println("Dead");

            }

            
        }

    }
}