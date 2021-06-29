class bankac 
{
    String name,acno,type;
    double balance;
    static double r;
    static double minbal;

    static
    {
        r=7.5;
        minbal=1000;
    }
    static void rdisplay()
    {
        System.out.println("Rate of interest is "+r);
    }

    bankac()
    {
        name=" ";
        acno=" ";
        type=" ";
        balance=0;
    }

    bankac(String na,String ac,String ty,double bal)
    {
        if(bal <minbal)
        {
            System.out.println("Account cant be created");
            System.exit(0);
        }
        name=na;
        acno=ac;
        type=ty;
        balance=bal;
    }

    double deposit(double amt)
    {
        balance=balance+amt;
        System.out.println("The current balance is:"+balance);
        return balance;
    }

    double withdraw(double amt)
    {
        if((balance-amt)<minbal)
        {
        System.out.print("Amount cannot be withdrawn.");
		}
        else
        {balance=balance-amt;
        System.out.println("the current balance is"+balance);
		}

      return balance ;  
    }

    void display()
    {
        System.out.println("name:"+name+"\n account number:"+acno+"\n account type:"+type+"\n balance:"+balance);

    }
}


class bankmain
{
    public static void main(String[] args) 
    {
       bankac b1= new bankac("sara","0808","credit",7000);
       bankac b2= new bankac("lou","9090","debit",5000) ;
       System.out.println("the details of first account are:");
       b1.display();
       System.out.println("the details of second account are:");
       b2.display();
       bankac.rdisplay();
       b1.deposit(5000);
       b2.withdraw(5000);
       b1.withdraw(700);
       b2.deposit(9000);

    }
}
