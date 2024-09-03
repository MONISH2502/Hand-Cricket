import java.util.*;

class Cricket
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        //Random random = new Random();
        
        String name;
        int aa;
        int ii;
        int bb;
        double rr;
        int cheat;
        int score1;
        int score2;
        int c;
        int choice;
        int infinity=1;
        
        while(infinity>0)
        {
           name="" ;
           aa=0;
           ii=0;
           bb=0;
           rr=0;
           cheat=0;
           score1=0;
           score2=0;
           c=0;
           choice=0;
           infinity=1;
           
           System.out.println("===================");
           System.out.println("WELCOME TO THE GAME");
           System.out.println("===================\n");
           System.out.println("Enter your name :");
           name=kb.nextLine();
           
           for(c=1;c<=2;c++)
           {
               System.out.println("=================\n");
           }
           
           System.out.println("Hello "+name);
           System.out.println(".");
           System.out.println("WELCOME TO CRICKET MANIA");
           System.out.println("*");
           
                System.out.println("This Game Is Similar To The Hand-Cricket Game Played By Kids.");
                System.out.println(".");
                System.out.println("There Is No Limit On The Number Of Balls.");
                System.out.println(".");
                System.out.println("You Will First Bat. Enter Any Number From 1 To 10.");
                System.out.println(".");
                System.out.println("Enter The Numbers Carefully Without Making Any Mistake.");
                System.out.println(".");
                System.out.println("If The Number Entered By The Computer Is Same As The Number Entered By You,");
                System.out.println("You Will Be Declared As Out.");
                System.out.println(".");
                System.out.println("Your Final Score Will Be The Sum Of The Numbers You Entered Before Getting Out.");
                System.out.println(".");
                System.out.println("After Getting Out, You Will Have To Bowl.");
                System.out.println(".");
                System.out.println("Try To Enter A Number Similar To The Number Entered By The Computer.");
                System.out.println(".");
                System.out.println("If The Sum Of Numbers Entered By The Computer Becomes More Than Your Score, It Will Win.");
                System.out.println(".");
                System.out.println("But If You Enter A Number Same As The Number Entered By The Computer, You Can Win!");
                System.out.println(".");
                
            for(c=1;c<=2;c++)
           {
               System.out.println("=================");
           }
           System.out.println("YOU ARE BATTING..");
           
            System.out.println("=================");
            System.out.println("=================");
            
            for(ii=1;ii>0;ii++)
            {
                System.out.println("");
                System.out.println("Enter your number");
                bb=kb.nextInt();
                rr=(Math.random()*10);
                rr=rr+1;
                aa=(int)rr;
                System.out.println("");
                System.out.println("Computer's number :"+aa);
                System.out.println("");
                System.out.println("");
                
                if(bb==aa)
                {
                  System.out.println("");
                  System.out.println("you are out");
                  System.out.println("**************");
                  System.out.println("FINAL SCORE :"+score1);
                  System.out.println("**************");
                  break;
                }
                else if(bb>0&&bb<=10)
                {
                    score1=score1+bb;
                }
                else if(bb<0||bb>10)
                {
                    for(c=0;c<=1;c++)
                    {
                        System.out.println("====================");
                    }
                    
                    System.out.println("You have either tried to cheat or entered a wrong input.game over !");
                    cheat++;
                    break;
                }
                System.out.println("Your current score is "+score1);
                System.out.println("");
                System.out.println("********");
            }//for ii bat
            for(c=0;c<=1;c++)
            {
                if(cheat>0)
                {
                    break;
                }
                System.out.println("====================");
            }
            for(c=0;c<1;c++)
            {
                if(cheat>0)
                {
                    break;
                }
                System.out.println("YOU ARE BOWLING");
            }
            for(c=0;c<=1;c++)
            {
                if(cheat>0)
                {
                    break;
                }
                System.out.println("====================");
            }
            for(ii=1;ii>0;ii++)
            {
                if(cheat>0)
                {
                    break;
                }
                System.out.println("");
                System.out.println("Enter your number :");
                bb=kb.nextInt();
                rr=(Math.random()*10);
                rr=rr+1;
                aa=(int)rr;
                System.out.println("");
                System.out.println("Computer's number :"+aa);
                System.out.println("*********");
                
                  if(aa==bb)
                    {
                        System.out.println(" ");
                        System.out.println("COMPUTER IS OUTT!!!!");
                        System.out.println(" ");
                        System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                        System.out.println("################");
                        System.out.println(" ");
                        break;
                    }
                  
                  else if(bb>0&&bb<=10)
                  {
                      score2=score2+aa;
                      
                  }
                  else if(bb<0||bb>10)
                  {
                      for(c=0;c<=1;c++)
                      {
                          System.out.println("==============");
                       }
                       System.out.println("You have either entered the wrong input or tried to cheat.Game over !");
                       cheat++;
                       break;
                  }
                  if(score2>score1)
                  {
                      System.out.println("THE COMPUTER HAS SCOREDMORE THAN YOU !!");
                      System.out.println("********");
                      System.out.println("********");
                      System.out.println("FINAL SCORE"+score2);
                      break;
                  }
                 System.out.println("==================="); 
                 System.out.println("COMPUTER'S SCORE"+score2);
            }//for ii bowling
             for(c=0;c<=2;c++) { if(cheat>0)
                    {
                        break;
                    }
                    
                    System.out.println("====================================");}
                for(ii=0;ii<1;ii++)
                { if(cheat>0)
                    {
                        break;
                    }
                   System.out.println(""); 
                   System.out.println("#################"); 
                   System.out.println("YOUR FINAL SCORE :"+score1); 
                   System.out.println("COMPUTER'S FINAL SCORE :"+score2); 
                   System.out.println("*******************"); 
                   
                     if((score1)>(score2))
                    {
                        System.out.println("Congratulations "+name+"!! You Have Defeated The Almighty, Computer!!");
                    }
                    
                    else if((score1)<(score2))
                    {
                        System.out.println("Sorry "+name+", But The Computer Has Defeated You..!");
                    }
                    
                    else
                    {
                        System.out.println("It's a Tie..! :(");
                    }
                  
                }//for score
                
            System.out.println("");
            System.out.println("Enter 1 To Play This Game Again.");
            System.out.println("");
            System.out.println("Enter 0 Or Any Other Number To Quit.");
            choice=kb.nextInt();
            System.out.println("");
            
            if(choice==1)
            {
                System.out.print('\f');
            }
            
            else
            {
                System.out.print('\f');
                System.out.println("Good Bye!");
                break;
            }
     
}

}
}
