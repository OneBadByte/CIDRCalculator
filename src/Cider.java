import java.util.Objects;
import java.util.Scanner;

/**
 * Created by blackdartq on 11/5/16.
 */
public class Cider {



    public int bits = 0;

    public int cidrNetBit(int bitHostNumber){

        double oldHostNumber = 0;
        double newHostNumber = 1;
        double y = 0;
        double z = 0;

        double bits = (double) bitHostNumber;

        boolean running = true;
        while(running){
       // for(int i = 1; i < 12; i++){




            if(bits <= y && bits > z){

                running = false;
                break;


            }else{

                y = Math.pow(2,newHostNumber) - 2;
                z = Math.pow(2,oldHostNumber) - 2;
                oldHostNumber = newHostNumber;
                newHostNumber++;
                //System.out.println();
                //System.out.println("old: " + oldHostNumber);
                //System.out.println("new: " + newHostNumber);
                //System.out.println("y: " + y);
                //System.out.println("z: " + z);

            }

        }

        int total = 32 - (int) oldHostNumber;
        return total;


    }


    public static void main(String args[]){



        Cider cider = new Cider();
        Scanner getInput = new Scanner(System.in);
        int number = 0;
        boolean loopRunning = true;
        String input;
        while(loopRunning){

        System.out.print("enter host IPs needed: ");
        number = getInput.nextInt();

        System.out.println("the CIDR is : /" + cider.cidrNetBit(number));

            System.out.print("Continue?(y/n): ");
            input = getInput.next();
            if(Objects.equals(input, "y")){

                break;
            }else{
                continue;


            }

        }


    }



    }

