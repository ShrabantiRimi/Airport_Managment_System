public class Customer {
    String From;
        String To;
        String Date;
        Customer(String From,String To,String Date)
        {
            this.From=From;
            this.To=To;
            this.Date=Date;
        }
        String Show()
        {
            
            
            {
            
                return ("Ticket is available");
           }
        }

     public class Flight {
        int ID;
        double Price;

         Flight(int ID,double Price) {
            this.ID=ID;
            this.Price=Price;
            
        }
        double information()
        {
            if((ID<=100)&&(ID>=100))
            {
                return (ID);
                
            }
            return 0;
        }
        double infoemation_two()
        {
            if((Price<=100)&&(Price>=100))
            {
                return (Price);
            }
            return 0;
            
        }
    
    }
    
}

class arrang{
    int ID;
        double Price;
        int Num_ticikets;

         arrang(int ID,double Price,int Num_ticikets) {
            this.ID=ID;
            this.Price=Price;
            this.Num_ticikets=Num_ticikets;
            
        }
        String information()
        {
            if((((ID>=100)&&(ID<=105))&&((Price<=15000.00)&&(Price>=8000.00)))&&(Num_ticikets!=0))
               
            {
                double Total_price;
                Total_price=(Price*Num_ticikets);
                return (""+ID+" IDis Availables.\n"+","+Price+" Price is correct.\n Now your Total Price is"+Total_price+"\n if you interest then click Book.\nIf you are not then click Exit");
                
            }
            else
            {
             return("SORRY\nYou Enter the worng information");  
            }
            //return 0;
        }
}
class payment{
    int Credit_card_num;
   int PIN;
payment(int Credit_card_num,int PIN)
{
   this.Credit_card_num= Credit_card_num;
   this.PIN=PIN;
}
    String Book_information()
{
    if((Credit_card_num==0 && PIN==0))
    {
        return("Your Informations is not correct.\nTry agine with right information");
    }
    else
    {
      return ("Your Informations are correct.\nTiciket are Successfully Booked\n\n\t\tTHANKS\t\t");  
    }
}
}

