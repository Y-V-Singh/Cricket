import java.util.*;
public class The_20_balls
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r;//to input run
        int t=0;//total score
        int ex=0;//to provide extra run to team in case if no ball,etc
        int n=20;//no of balls
        double str;//to calculate Strike rate
        int c=0;//to count the number of balls played by the bats men
        
       outer: 
       for(int i=0;i<n;i++)
        {
            c++;
           int m=17;int a=2;
            int wide=(int)((Math.random()*(m-a))+a);//to check weather it is a wide ball or not
                if(wide==10||wide==12||wide==13)
                {
                    System.out.println("The bowler went too far");
                    System.out.println("It's a wide ball; another run added to the score");
                    ex=ex+1;
                }
             
            System.out.println("enter the number of run you want to attempt on this ball");
            r=sc.nextInt();
                      
            switch(r)
            {
                case 1:
                {
                int w=(int)((Math.random() *(m-a))+a);//to check weather run is compleated successfully or not
                if(w==3)
                  {
                      System.out.println("Sorry, the fielder was too fast");
                      System.out.println("It's a run out");
                      break outer ;
                  }
                if(w==4)
                  {
                      System.out.println("Sorry, the boll was a big miistry");
                      System.out.println("It's a clean boled");
                      break outer ;
                  }
                if(w==5||w==6)
                {
                    c++;
                  System.out.println("Bowler exceeded his limits");
                  System.out.println("It's a no ball");
                  ex=ex+1;//One extra run of no ball
                  System.out.println("Enter the runs you want to attempt on no ball");
                  int r2=sc.nextInt();//Number of runs scored on no ball
                  int o=(int)((Math.random()*(10-1))-1);
                  if(o==1||o==2)
                  {
                      System.out.println("What a hard luck got run out on no ball");
                      break outer;
                  }
                  else
                  {
                      r=r+r2;
                  }
                }
                t=t+r;                  
                }
                break;
                case 2:
                 {
                    int w=(int)((Math.random() *(m-a))+a);//to check weather run is compleated successfully or not
                    if(w==3)
                  {
                      System.out.println("Sorry, the fielder showed exeptional skills");
                      System.out.println("It's a run out");
                      break outer ;
                  }
                  if(w==5)
                  {
                      System.out.println("Sorry, the boll was a big miistry");
                      System.out.println("It's a clean boled");
                      break outer ;
                  }
                  if(w==6)
                  {
                      System.out.println("Sorry, the feilder chaught that well");
                      System.out.println("It's a catch out");
                      break outer;
                  }
                  if(w==7||w==8||w==9)
                  {
                      System.out.println("The ball is to close do you want to cancel the second run?");
                      System.out.println("enter 1 for Yes, 2 for no");
                      int ch=sc.nextInt();
                      if(ch==1)
                      {
                          int l=(int)((Math.random()*(8-2))+2);//probality to take weather it's still a out 
                          if(l==4||l==3)
                          {
                              System.out.println("Aah! you got late; it's an out");
                              break outer;
                          }
                          else
                          { 
                              System.out.println("Ooh! that was close; it's a not out");
                              t=t+1;
                          }
                      }
                      else
                      {
                          int l=(int)((Math.random()*(8-2))+2);//probality to take weather it's still a out
                          if(l==7||l==6||l==8)
                           System.out.print("Ooh!It's a double");                               
                          else
                          {                          
                           System.out.print("Run Out");
                           t=t+1;
                           break outer;
                          }
                          t=t+2;
                          break;
                        }
                      
                    }
                 if(w==10||w==11)
                {
                    c++;
                  System.out.println("Bowler exceeded his limits");
                  System.out.println("It's a no ball");
                  ex=ex+1;//One extra run of no ball
                  System.out.println("Enter the runs you want to attempt on this ball");
                  int r2=sc.nextInt();//Number of runs scored on no ball
                  int o=(int)((Math.random()*(10-1))-1);
                   if(r2==1||r2==2||r2==3)
                  {
                      if(o==1)
                      {
                      System.out.println("What a hard luck got run out on no ball");
                      t=t+r+1;
                      break outer;
                    }
                    else
                    r=r+r2;
                  }
                  else
                  {
                      r=r+r2;
                  }
                }
                t=t+r;
                }
                break;                
                case 3:
                {
                  int w=(int)((Math.random() *(m-a))+a);//to check weather run is compleated successfully or not
                  if(w==3||w==4)
                  {
                      System.out.println("Sorry, the fielder traped the ball");
                      System.out.println("It's just a double");
                      t=t+r;
                      break outer;
                  }
                   if(w==10||w==11)
                {
                  c++;
                  System.out.println("Bowler exceeded his limits");
                  System.out.println("It's a no ball");
                  ex=ex+1;//One extra run of no ball
                  System.out.println("Enter the runs you want to attempt on no ball");
                  int r2=sc.nextInt();//Number of runs scored on no ball
                  int o=(int)((Math.random()*(10-1))-1);
                  if(r2==1||r2==2||r2==3)
                  {
                      if(o==1)
                      {
                      System.out.println("What a hard luck got run out on no ball");
                      t=t+r+1;
                      break outer;
                    }
                    else
                    r=r+r2;
                  }
                  else
                  {
                      r=r+r2;
                  }
                }
                  t=t+r;              
                }                
                break;
                case 4:
                {
                  int w=(int)((Math.random() *(m-a))+a);//to check weather run is compleated successfully or not
                  if(w==3||w==4||w==5)
                  {
                      System.out.println("Aah!The ball was not timed well");
                      System.out.println("It's a Catch out");
                      break outer ;
                  }
                  if(w==7||w==8)
                  {
                      System.out.println("Sorry, the boll was placed well by the bowler");
                      System.out.println("It's a clear boled");
                      break outer ;
                  }
                  if(w==10||w==11)
                {
                  c++;
                  System.out.println("Bowler exceeded his limits");
                  System.out.println("It's a no ball");
                  ex=ex+1;//One extra run of no ball
                  System.out.println("Enter the runs you want to attempt on no  ball");
                  int r2=sc.nextInt();//Number of runs scored on no ball
                  int o=(int)((Math.random()*(10-1))-1);
                  if(r2==1||r2==2||r2==3)
                  {
                      if(o==1)
                      {
                      System.out.println("What a hard luck got run out on no ball");
                      t=t+r+1;
                      break outer;
                    }
                    else
                    r=r+r2;
                  }
                  else
                  {
                      r=r+r2;
                  }
                }
                  t=t+r;
                }
                break;
                case 5:
                {
                  int w=(int)((Math.random() *(m-a))+a);//to check weather run is compleated successfully or not
                  if(w==3||w==4||w==5||w==6||w==7)
                  {
                      System.out.println("It's a no ball");
                      System.out.println("Five runs added to the score");
                      t=t+5;
                      break;
                  }
                  else
                  {
                      System.out.println("It's not a no ball");
                      System.out.println("Four runs added to the score");
                      t=t+4;
                      break;
                  }
                }
                
                case 6:
                {
                  int w=(int)((Math.random() *(m-a))+a);//to check weather run is compleated successfully or not
                  if(w==3||w==4||w==5||w==6)
                  {
                      System.out.println("Fate left you on the boundry");
                      System.out.println("It's a catch out");
                      break outer ;
                  }
                  if(w==9||w==10)
                  {
                      System.out.println("Ball twisted below the bat");
                      System.out.println("It's a clean boled");
                      break outer ;
                               
                  }
                  if(w==10||w==11)
                {
                  c++;
                  System.out.println("Bowler exceeded his limits");
                  System.out.println("It's a no ball");
                  ex=ex+1;//One extra run of no ball
                  System.out.println("Enter the runs you want to attempt on no ball");
                  int r2=sc.nextInt();//Number of runs scored on no ball
                  int o=(int)((Math.random()*(10-1))-1);
                  if(r2==1||r2==2||r2==3)
                  {
                      if(o==1)
                      {
                      System.out.println("What a hard luck got run out on no ball");
                      t=t+r+1;
                      break outer;
                    }
                    else
                    r=r+r2;
                  }
                  else
                  {
                      r=r+r2;
                  }
                }
                  t=t+r;
                }
                break;
                default:
                {
                     int w=(int)((Math.random() *(m-a))+a);//to check weather run is compleated successfully or not
                  if(w==3||w==4||w==5||w==6)
                  {
                      System.out.println("Batsman didn't even felt the ball");
                      System.out.println("What a delivery");
                      t=t+0;
                      break ;
                  }
                  else
                  {
                      System.out.println("Batsman was tricked by the bowler");
                      System.out.println("It's a clean boled");
                      break outer ;
                  }
                } 
            }
       }
       int runs=t+ex;
       System.out.println("Total runs scored="+runs);
       System.out.println("Extras:"+ex);
       str=(double)t/(double)c*100;
       System.out.println("Strike Rate="+str);
       if(runs==0)
       {
        int a=runs+6;
        int chase=(int)((Math.random()*(a-runs))-runs);
        System.out.println("The opponent team scored "+chase+ "runs");
        if(chase>runs)
        {System.out.println("The result is same as expected, you lost the match by 1 wicket");
        }
        if(chase==runs)
        {
            System.out.println("What a miracle! it's a tie, great luck for the defenders");
        }
       }
       
       else if(runs==1)
       {
        int a=runs+6;
        int chase=(int)((Math.random()*(a-0))-0);
        System.out.println("The opponent team scored "+chase+ "runs");
        if(chase>runs)
        {System.out.println("Your bowler and feilders tried well,but you lost the match by 1 wicket");
        }
        if(chase==runs)
        {
            System.out.println("Match Tied");
        }
        if(chase<runs)
        {
            System.out.println("Your bowler and feilders showed great skill, you won the match by"+" "+"1"+" runs");
       }
    }
    else
    {
        
        int a=runs+6;
        int chase=(int)((Math.random()*(a-0))-0);
        System.out.println("The opponent team scored "+chase+ "runs");
        if(chase>runs)
        {System.out.println("Your bowler and feilders tried well,but you lost the match by 1 wicket");
        }
        if(chase==runs)
        {
            System.out.println("Match Tied");
        }
        if(chase<runs)
        {
            System.out.println("Your bowler and feilders showed great skill, you won the match by"+" "+(runs-chase)+" runs");
       }
    }    
  }
}
  
