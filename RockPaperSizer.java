import java.util.Random;
import java.util.Scanner;

import javax.swing.text.html.parser.Entity;
//Using OOPs
class RPC{
    int randomnum;
    int input;
    RPC(){
        System.out.println(" 0.for Rock \n 1.for Paper \n 2.for Sizer\n");
        Random r1=new Random();
        randomnum=r1.nextInt(2);

    }

    public void tackinginput(){
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
    }

    public void check(){
        if((randomnum==0 && input==1)||(randomnum==1 && input==2)||(randomnum==2 && input==0)){
        System.out.println("You win");
    }
    else if((randomnum==0 && input==0)||(randomnum==1&& input==1)||(randomnum==2 && input ==2)){
        System.out.println("Draw becouse you choose"+input+"and computer choose"+randomnum);
    }
    else{
        System.out.println("You loss becouse computer choose"+input);
    }
    }
}

public class RockPaperSizer {
//Without OOPs
    // public static void main(String[] args) {
        
    
    // Scanner sc=new Scanner(System.in);

    // Random random=new Random();
    // int a=random.nextInt(3);

    // System.out.println("Enter rock for  0");
    // System.out.println("Enter paper for 1");
    // System.out.println("Enter sizer for 2");

    // System.out.println();

    // int user=sc.nextInt();

    // if((a==0 && user==1)||(a==1 && user==2)||(a==2 && user==0)){
    //     System.out.println("You win");
    // }
    // else if((a==0 && user==0)||(a==1&& user==1)||(a==2 && user==2)){
    //     System.out.println("Draw becouse you choose"+user+"and computer choose"+a);
    // }
    // else{
    //     System.out.println("You loss becouse computer choose"+a);
    // }

    

    // }
    public static void main(String[] args) {
        RPC rpc1=new RPC();
        rpc1.tackinginput();
        rpc1.check();
    }


}
