package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

            Scanner input=new Scanner(System.in);

            System.out.print("Enter how many pizza you want to order: ");
            int order=input.nextInt();
            pizzaorder po1=new pizzaorder();
            for(int i=1;i<=order;i++)
            {
                System.out.print("Enter the size of the pizza: ");
                String size=input.next();

                System.out.print("Enter the number of cheese toppings: ");
                int cheeze=input.nextInt();

                System.out.print("Enter the  number of pepperoni toppings: ");
                int pepperoni =input.nextInt();

                System.out.print("Enter the number of ham toppings: ");
                int ham=input.nextInt();

                if(i==1)
                {
                    pizza p1=new pizza(size,cheeze,pepperoni,ham);
                    po1.setPizza1(p1);
                }
                else if(i==2)
                {
                    pizza p2=new pizza(size,cheeze,pepperoni,ham);
                    po1.setPizza2(p2);
                }
                else if (i==3)
                {
                    pizza p3=new pizza(size,cheeze,pepperoni,ham);
                    po1.setPizza3(p3);
                }
            }
            System.out.println("The total cost of the order is: "+po1.calcTotal()+"$");
            po1.getp1().getDescription();


        }


    }

}
}
